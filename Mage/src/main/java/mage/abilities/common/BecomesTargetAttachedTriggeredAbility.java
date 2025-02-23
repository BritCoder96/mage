package mage.abilities.common;

import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.constants.Zone;
import mage.filter.FilterStackObject;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.events.GameEvent.EventType;
import mage.game.events.GameEvent;
import mage.game.stack.StackObject;
import mage.game.permanent.Permanent;

/**
 *
 * @author LoneFox
 */
public class BecomesTargetAttachedTriggeredAbility extends TriggeredAbilityImpl {

    private final FilterStackObject filter;
    private final String enchantType;

    public BecomesTargetAttachedTriggeredAbility(Effect effect) {
        this(effect, StaticFilters.FILTER_SPELL_OR_ABILITY_A);
    }

    public BecomesTargetAttachedTriggeredAbility(Effect effect, FilterStackObject filter) {
        this(effect, filter, "creature");
    }

    public BecomesTargetAttachedTriggeredAbility(Effect effect, FilterStackObject filter, String enchantType) {
        super(Zone.BATTLEFIELD, effect);
        this.filter = filter.copy();
        this.enchantType = enchantType;
    }

    public BecomesTargetAttachedTriggeredAbility(final BecomesTargetAttachedTriggeredAbility ability) {
        super(ability);
        this.filter = ability.filter.copy();
        this.enchantType = ability.enchantType;
    }

    @Override
    public BecomesTargetAttachedTriggeredAbility copy() {
        return new BecomesTargetAttachedTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.TARGETED;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent enchantment = game.getPermanent(sourceId);
        StackObject sourceObject = game.getStack().getStackObject(event.getSourceId());
        if (enchantment != null && enchantment.getAttachedTo() != null) {
            if (event.getTargetId().equals(enchantment.getAttachedTo())
                    && filter.match(sourceObject, getSourceId(), getControllerId(), game)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getTriggerPhrase() {
        return "When enchanted " + enchantType + " becomes the target of " + filter.getMessage() + ", ";
    }
}
