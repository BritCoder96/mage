package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.effects.AsThoughManaEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.LoseCreatureTypeSourceEffect;
import mage.abilities.hint.Hint;
import mage.abilities.hint.ValueHint;
import mage.cards.*;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.game.Game;
import mage.players.ManaPoolItem;
import mage.players.Player;
import mage.target.targetpointer.FixedTarget;
import mage.util.CardUtil;

import java.util.UUID;

/**
 * @author TheElk801 plus everyone who worked on Gonti
 */
public final class MindFlayerTheShadow extends CardImpl {

    private static final FilterPermanent filter = new FilterControlledPermanent();

    static {
        filter.add(TargetController.NOT_YOU.getOwnerPredicate());
    }

    private static final DynamicValue xValue = new PermanentsOnBattlefieldCount(filter);
    private static final Hint hint = new ValueHint("Permanents you control but don't own", xValue);

    public MindFlayerTheShadow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT, CardType.CREATURE}, "{4}{B}{B}{B}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HORROR);
        this.power = new MageInt(9);
        this.toughness = new MageInt(9);

        // Mind Flayer, the Shadow isn't a creature unless you control three or more permanents you don't own.
        this.addAbility(new SimpleStaticAbility(new LoseCreatureTypeSourceEffect(xValue, 3)
                .setText("{this} isn't a creature unless you control three or more permanents you don't own")
        ).addHint(hint));

        // At the beginning of your end step, exile the bottom card of each opponent's library face down. For as long as those cards remain exiled, you may look at them, you may cast permanent spells from among them, and you may spend mana as though it were mana of any color to cast those spells.
        this.addAbility(new BeginningOfEndStepTriggeredAbility(
                new MindFlayerTheShadowExileEffect(), TargetController.YOU, false
        ));
    }

    private MindFlayerTheShadow(final MindFlayerTheShadow card) {
        super(card);
    }

    @Override
    public MindFlayerTheShadow copy() {
        return new MindFlayerTheShadow(this);
    }
}

class MindFlayerTheShadowExileEffect extends OneShotEffect {

    MindFlayerTheShadowExileEffect() {
        super(Outcome.Benefit);
        staticText = "exile the bottom card of each opponent's library face down. "
                + "For as long as those cards remain exiled, you may look at them, "
                + "you may cast permanent spells from among them, "
                + "and you may spend mana as though it were mana of any color to cast those spells";
    }

    private MindFlayerTheShadowExileEffect(final MindFlayerTheShadowExileEffect effect) {
        super(effect);
    }

    @Override
    public MindFlayerTheShadowExileEffect copy() {
        return new MindFlayerTheShadowExileEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller == null) {
            return false;
        }
        Cards cards = new CardsImpl();
        for (UUID playerId : game.getOpponents(source.getControllerId())) {
            Player opponent = game.getPlayer(playerId);
            if (opponent == null) {
                continue;
            }
            cards.add(opponent.getLibrary().getFromBottom(game));
        }
        controller.moveCardsToExile(
                cards.getCards(game), source, game, false,
                CardUtil.getExileZoneId(game, source),
                CardUtil.getSourceName(game, source)
        );
        cards.getCards(game).stream().forEach(card -> card.setFaceDown(true, game));
        for (Card card : cards.getCards(game)) {
            card.setFaceDown(true, game);
            game.addEffect(new MindFlayerTheShadowCastFromExileEffect().setTargetPointer(new FixedTarget(card, game)), source);
            game.addEffect(new MindFlayerTheShadowSpendAnyManaEffect().setTargetPointer(new FixedTarget(card, game)), source);
            game.addEffect(new MindFlayerTheShadowLookEffect(source.getControllerId()).setTargetPointer(new FixedTarget(card, game)), source);
        }
        return true;
    }
}

class MindFlayerTheShadowCastFromExileEffect extends AsThoughEffectImpl {

    public MindFlayerTheShadowCastFromExileEffect() {
        super(AsThoughEffectType.PLAY_FROM_NOT_OWN_HAND_ZONE, Duration.Custom, Outcome.Benefit);
    }

    private MindFlayerTheShadowCastFromExileEffect(final MindFlayerTheShadowCastFromExileEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public MindFlayerTheShadowCastFromExileEffect copy() {
        return new MindFlayerTheShadowCastFromExileEffect(this);
    }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        UUID targetId = getTargetPointer().getFirst(game, source);
        if (targetId == null) {
            this.discard(); // card is no longer in the origin zone, effect can be discarded
            return false;
        }
        Card theCard = game.getCard(objectId);
        if (theCard == null
                || theCard.isLand(game)
                || !theCard.isPermanent(game)) {
            return false;
        }
        objectId = theCard.getMainCard().getId(); // for split cards

        if (objectId.equals(targetId)
                && affectedControllerId.equals(source.getControllerId())) {
            Card card = game.getCard(objectId);
            // TODO: Allow to cast Zoetic Cavern face down
            return card != null;
        }
        return false;
    }
}

class MindFlayerTheShadowSpendAnyManaEffect extends AsThoughEffectImpl implements AsThoughManaEffect {

    public MindFlayerTheShadowSpendAnyManaEffect() {
        super(AsThoughEffectType.SPEND_OTHER_MANA, Duration.Custom, Outcome.Benefit);
        staticText = "you may spend mana as though it were mana of any color to cast it";
    }

    private MindFlayerTheShadowSpendAnyManaEffect(final MindFlayerTheShadowSpendAnyManaEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public MindFlayerTheShadowSpendAnyManaEffect copy() {
        return new MindFlayerTheShadowSpendAnyManaEffect(this);
    }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        Card theCard = game.getCard(objectId);
        if (theCard == null) {
            return false;
        }
        objectId = theCard.getMainCard().getId(); // for split cards
        if (objectId.equals(((FixedTarget) getTargetPointer()).getTarget())
                && game.getState().getZoneChangeCounter(objectId) <= ((FixedTarget) getTargetPointer()).getZoneChangeCounter() + 1) {
            // if the card moved from exile to spell the zone change counter is increased by 1 (effect must applies before and on stack, use isCheckPlayableMode?)
            return source.isControlledBy(affectedControllerId);
        } else if (((FixedTarget) getTargetPointer()).getTarget().equals(objectId)) {
            // object has moved zone so effect can be discarded
            this.discard();
        }
        return false;
    }

    @Override
    public ManaType getAsThoughManaType(ManaType manaType, ManaPoolItem mana, UUID affectedControllerId, Ability source, Game game) {
        return mana.getFirstAvailable();
    }
}

class MindFlayerTheShadowLookEffect extends AsThoughEffectImpl {

    private final UUID authorizedPlayerId;

    public MindFlayerTheShadowLookEffect(UUID authorizedPlayerId) {
        super(AsThoughEffectType.LOOK_AT_FACE_DOWN, Duration.EndOfGame, Outcome.Benefit);
        this.authorizedPlayerId = authorizedPlayerId;
        staticText = "You may look at the cards exiled with {this}";
    }

    private MindFlayerTheShadowLookEffect(final MindFlayerTheShadowLookEffect effect) {
        super(effect);
        this.authorizedPlayerId = effect.authorizedPlayerId;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public MindFlayerTheShadowLookEffect copy() {
        return new MindFlayerTheShadowLookEffect(this);
    }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        UUID cardId = getTargetPointer().getFirst(game, source);
        if (cardId == null) {
            this.discard(); // card is no longer in the origin zone, effect can be discarded
        }
        return affectedControllerId.equals(authorizedPlayerId)
                && objectId.equals(cardId);
    }
}
