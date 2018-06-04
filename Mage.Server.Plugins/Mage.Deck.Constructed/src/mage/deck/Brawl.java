
package mage.deck;

import java.util.*;
import mage.abilities.common.CanBeYourCommanderAbility;
import mage.cards.Card;
import mage.cards.ExpansionSet;
import mage.cards.Sets;
import mage.cards.decks.Constructed;
import mage.cards.decks.Deck;
import mage.constants.SetType;
import mage.filter.FilterMana;

/**
 *
 * @author spjspj
 */
public class Brawl extends Constructed {

    protected List<String> bannedCommander = new ArrayList<>();

    public Brawl() {
        super("Brawl");

        // Copy of standard sets
        GregorianCalendar current = new GregorianCalendar();
        List<ExpansionSet> sets = new ArrayList(Sets.getInstance().values());
        Collections.sort(sets, new Comparator<ExpansionSet>() {
            @Override
            public int compare(final ExpansionSet lhs, ExpansionSet rhs) {
                return lhs.getReleaseDate().after(rhs.getReleaseDate()) ? -1 : 1;
            }
        });
        int blocksAdded = 0;
        int blocksToAdd = 3;
        for (Iterator<ExpansionSet> iter = sets.iterator(); iter.hasNext() && blocksAdded < blocksToAdd;) {
            ExpansionSet set = iter.next();
            if (set.getSetType() == SetType.CORE || set.getSetType() == SetType.EXPANSION || set.getSetType() == SetType.SUPPLEMENTAL_STANDARD_LEGAL) {    // Still adding core sets because of Magic Origins

                setCodes.add(set.getCode());
                if (set.getReleaseDate().before(current.getTime()) // This stops spoiled sets from counting as "new" blocks
                        && set.getParentSet() == null
                        && set.getSetType() == SetType.EXPANSION) {
                    if (blocksAdded == 0 && !isFallBlock(set)) { // if the most current block is no fall block, 4 blocks are added
                        blocksToAdd++;
                    }
                    blocksAdded++;
                }
            }
        }
        banned.add("Baral, Chief of Compliance");
        banned.add("Smuggler's Copter");
        banned.add("Sorcerers' Spyglass");
    }

    private static boolean isFallBlock(ExpansionSet set) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(set.getReleaseDate());
        // Sets from fall block are normally released in September and January
        return cal.get(Calendar.MONTH) > 7 || cal.get(Calendar.MONTH) < 2;
    }

    public Brawl(String name) {
        super(name);
    }

    @Override
    public boolean validate(Deck deck) {
        boolean valid = true;
        FilterMana colorIdentity = new FilterMana();

        if (deck.getCards().size() + deck.getSideboard().size() != 60) {
            invalid.put("Deck", "Must contain 60 cards: has " + (deck.getCards().size() + deck.getSideboard().size()) + " cards");
            valid = false;
        }

        Map<String, Integer> counts = new HashMap<>();
        countCards(counts, deck.getCards());
        countCards(counts, deck.getSideboard());
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                if (!basicLandNames.contains(entry.getKey()) && !anyNumberCardsAllowed.contains(entry.getKey())) {
                    invalid.put(entry.getKey(), "Too many: " + entry.getValue());
                    valid = false;
                }
            }
        }

        for (String bannedCard : banned) {
            if (counts.containsKey(bannedCard)) {
                invalid.put(bannedCard, "Banned");
                valid = false;
            }
        }

        if (deck.getSideboard().size() != 1) {
            invalid.put("Brawl", "Sideboard must contain only the commander)");
            valid = false;
        } else {
            for (Card commander : deck.getSideboard()) {
                if (bannedCommander.contains(commander.getName())) {
                    invalid.put("Brawl", "Brawl banned (" + commander.getName() + ')');
                    valid = false;
                }
                if (!((commander.isCreature() && commander.isLegendary())
                        || commander.isPlaneswalker() || commander.getAbilities().contains(CanBeYourCommanderAbility.getInstance()))) {
                    invalid.put("Brawl", "Invalid Commander (" + commander.getName() + ')');
                    valid = false;
                }
                FilterMana commanderColor = commander.getColorIdentity();
                if (commanderColor.isWhite()) {
                    colorIdentity.setWhite(true);
                }
                if (commanderColor.isBlue()) {
                    colorIdentity.setBlue(true);
                }
                if (commanderColor.isBlack()) {
                    colorIdentity.setBlack(true);
                }
                if (commanderColor.isRed()) {
                    colorIdentity.setRed(true);
                }
                if (commanderColor.isGreen()) {
                    colorIdentity.setGreen(true);
                }
                if (commanderColor.isColorless()) {
                    colorIdentity.setColorless(true);
                }
            }
        }
        Set<String> basicsInDeck = new HashSet<>();
        if (colorIdentity.isColorless()) {
            for (Card card : deck.getCards()) {
                if (basicLandNames.contains(card.getName())) {
                    basicsInDeck.add(card.getName());
                }
            }
        }
        for (Card card : deck.getCards()) {
            if (!cardHasValidColor(colorIdentity, card)
                    && !(colorIdentity.isColorless()
                    && basicsInDeck.size() == 1
                    && basicsInDeck.contains(card.getName()))) {
                invalid.put(card.getName(), "Invalid color (" + colorIdentity.toString() + ')');
                valid = false;
            }
        }
        for (Card card : deck.getCards()) {
            if (!isSetAllowed(card.getExpansionSetCode())) {
                if (!legalSets(card)) {
                    invalid.put(card.getName(), "Not allowed Set: " + card.getExpansionSetCode());
                    valid = false;
                }
            }
        }
        for (Card card : deck.getSideboard()) {
            if (!isSetAllowed(card.getExpansionSetCode())) {
                if (!legalSets(card)) {
                    invalid.put(card.getName(), "Not allowed Set: " + card.getExpansionSetCode());
                    valid = false;
                }
            }
        }
        return valid;
    }

    public boolean cardHasValidColor(FilterMana commander, Card card) {
        FilterMana cardColor = card.getColorIdentity();
        return !(cardColor.isBlack() && !commander.isBlack()
                || cardColor.isBlue() && !commander.isBlue()
                || cardColor.isGreen() && !commander.isGreen()
                || cardColor.isRed() && !commander.isRed()
                || cardColor.isWhite() && !commander.isWhite());
    }

}
