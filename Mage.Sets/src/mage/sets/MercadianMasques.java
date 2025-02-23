package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author North
 */
public final class MercadianMasques extends ExpansionSet {

    private static final MercadianMasques instance = new MercadianMasques();

    public static MercadianMasques getInstance() {
        return instance;
    }

    private MercadianMasques() {
        super("Mercadian Masques", "MMQ", ExpansionSet.buildDate(1999, 8, 25), SetType.EXPANSION);
        this.blockName = "Masques";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aerial Caravan", 58, Rarity.RARE, mage.cards.a.AerialCaravan.class));
        cards.add(new SetCardInfo("Afterlife", 1, Rarity.UNCOMMON, mage.cards.a.Afterlife.class));
        cards.add(new SetCardInfo("Alabaster Wall", 2, Rarity.COMMON, mage.cards.a.AlabasterWall.class));
        cards.add(new SetCardInfo("Alley Grifters", 115, Rarity.COMMON, mage.cards.a.AlleyGrifters.class));
        cards.add(new SetCardInfo("Ancestral Mask", 229, Rarity.COMMON, mage.cards.a.AncestralMask.class));
        cards.add(new SetCardInfo("Armistice", 3, Rarity.RARE, mage.cards.a.Armistice.class));
        cards.add(new SetCardInfo("Arms Dealer", 172, Rarity.UNCOMMON, mage.cards.a.ArmsDealer.class));
        cards.add(new SetCardInfo("Arrest", 4, Rarity.UNCOMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Assembly Hall", 286, Rarity.RARE, mage.cards.a.AssemblyHall.class));
        cards.add(new SetCardInfo("Ballista Squad", 5, Rarity.UNCOMMON, mage.cards.b.BallistaSquad.class));
        cards.add(new SetCardInfo("Balloon Peddler", 59, Rarity.COMMON, mage.cards.b.BalloonPeddler.class));
        cards.add(new SetCardInfo("Barbed Wire", 287, Rarity.UNCOMMON, mage.cards.b.BarbedWire.class));
        cards.add(new SetCardInfo("Battle Rampart", 173, Rarity.COMMON, mage.cards.b.BattleRampart.class));
        cards.add(new SetCardInfo("Battle Squadron", 174, Rarity.RARE, mage.cards.b.BattleSquadron.class));
        cards.add(new SetCardInfo("Bifurcate", 230, Rarity.RARE, mage.cards.b.Bifurcate.class));
        cards.add(new SetCardInfo("Black Market", 116, Rarity.RARE, mage.cards.b.BlackMarket.class));
        cards.add(new SetCardInfo("Blaster Mage", 175, Rarity.COMMON, mage.cards.b.BlasterMage.class));
        cards.add(new SetCardInfo("Blockade Runner", 60, Rarity.COMMON, mage.cards.b.BlockadeRunner.class));
        cards.add(new SetCardInfo("Blood Hound", 176, Rarity.RARE, mage.cards.b.BloodHound.class));
        cards.add(new SetCardInfo("Blood Oath", 177, Rarity.RARE, mage.cards.b.BloodOath.class));
        cards.add(new SetCardInfo("Boa Constrictor", 231, Rarity.UNCOMMON, mage.cards.b.BoaConstrictor.class));
        cards.add(new SetCardInfo("Bog Smugglers", 117, Rarity.COMMON, mage.cards.b.BogSmugglers.class));
        cards.add(new SetCardInfo("Bog Witch", 118, Rarity.COMMON, mage.cards.b.BogWitch.class));
        cards.add(new SetCardInfo("Brainstorm", 61, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Brawl", 178, Rarity.RARE, mage.cards.b.Brawl.class));
        cards.add(new SetCardInfo("Briar Patch", 232, Rarity.UNCOMMON, mage.cards.b.BriarPatch.class));
        cards.add(new SetCardInfo("Bribery", 62, Rarity.RARE, mage.cards.b.Bribery.class));
        cards.add(new SetCardInfo("Buoyancy", 63, Rarity.COMMON, mage.cards.b.Buoyancy.class));
        cards.add(new SetCardInfo("Cackling Witch", 119, Rarity.UNCOMMON, mage.cards.c.CacklingWitch.class));
        cards.add(new SetCardInfo("Caller of the Hunt", 233, Rarity.RARE, mage.cards.c.CallerOfTheHunt.class));
        cards.add(new SetCardInfo("Cateran Brute", 120, Rarity.COMMON, mage.cards.c.CateranBrute.class));
        cards.add(new SetCardInfo("Cateran Enforcer", 121, Rarity.UNCOMMON, mage.cards.c.CateranEnforcer.class));
        cards.add(new SetCardInfo("Cateran Kidnappers", 122, Rarity.UNCOMMON, mage.cards.c.CateranKidnappers.class));
        cards.add(new SetCardInfo("Cateran Overlord", 123, Rarity.RARE, mage.cards.c.CateranOverlord.class));
        cards.add(new SetCardInfo("Cateran Persuader", 124, Rarity.COMMON, mage.cards.c.CateranPersuader.class));
        cards.add(new SetCardInfo("Cateran Slaver", 125, Rarity.RARE, mage.cards.c.CateranSlaver.class));
        cards.add(new SetCardInfo("Cateran Summons", 126, Rarity.UNCOMMON, mage.cards.c.CateranSummons.class));
        cards.add(new SetCardInfo("Caustic Wasps", 234, Rarity.UNCOMMON, mage.cards.c.CausticWasps.class));
        cards.add(new SetCardInfo("Cave-In", 180, Rarity.RARE, mage.cards.c.CaveIn.class));
        cards.add(new SetCardInfo("Cavern Crawler", 181, Rarity.COMMON, mage.cards.c.CavernCrawler.class));
        cards.add(new SetCardInfo("Cave Sense", 179, Rarity.COMMON, mage.cards.c.CaveSense.class));
        cards.add(new SetCardInfo("Ceremonial Guard", 182, Rarity.COMMON, mage.cards.c.CeremonialGuard.class));
        cards.add(new SetCardInfo("Chambered Nautilus", 64, Rarity.UNCOMMON, mage.cards.c.ChamberedNautilus.class));
        cards.add(new SetCardInfo("Chameleon Spirit", 65, Rarity.UNCOMMON, mage.cards.c.ChameleonSpirit.class));
        cards.add(new SetCardInfo("Charisma", 66, Rarity.RARE, mage.cards.c.Charisma.class));
        cards.add(new SetCardInfo("Charm Peddler", 6, Rarity.COMMON, mage.cards.c.CharmPeddler.class));
        cards.add(new SetCardInfo("Charmed Griffin", 7, Rarity.UNCOMMON, mage.cards.c.CharmedGriffin.class));
        cards.add(new SetCardInfo("Cho-Arrim Alchemist", 8, Rarity.RARE, mage.cards.c.ChoArrimAlchemist.class));
        cards.add(new SetCardInfo("Cho-Arrim Bruiser", 9, Rarity.RARE, mage.cards.c.ChoArrimBruiser.class));
        cards.add(new SetCardInfo("Cho-Arrim Legate", 10, Rarity.UNCOMMON, mage.cards.c.ChoArrimLegate.class));
        cards.add(new SetCardInfo("Cho-Manno, Revolutionary", 11, Rarity.RARE, mage.cards.c.ChoMannoRevolutionary.class));
        cards.add(new SetCardInfo("Cho-Manno's Blessing", 12, Rarity.COMMON, mage.cards.c.ChoMannosBlessing.class));
        cards.add(new SetCardInfo("Cinder Elemental", 183, Rarity.UNCOMMON, mage.cards.c.CinderElemental.class));
        cards.add(new SetCardInfo("Clear the Land", 235, Rarity.RARE, mage.cards.c.ClearTheLand.class));
        cards.add(new SetCardInfo("Close Quarters", 184, Rarity.UNCOMMON, mage.cards.c.CloseQuarters.class));
        cards.add(new SetCardInfo("Cloud Sprite", 67, Rarity.COMMON, mage.cards.c.CloudSprite.class));
        cards.add(new SetCardInfo("Coastal Piracy", 68, Rarity.UNCOMMON, mage.cards.c.CoastalPiracy.class));
        cards.add(new SetCardInfo("Collective Unconscious", 236, Rarity.RARE, mage.cards.c.CollectiveUnconscious.class));
        cards.add(new SetCardInfo("Common Cause", 13, Rarity.RARE, mage.cards.c.CommonCause.class));
        cards.add(new SetCardInfo("Conspiracy", 127, Rarity.RARE, mage.cards.c.Conspiracy.class));
        cards.add(new SetCardInfo("Cornered Market", 14, Rarity.RARE, mage.cards.c.CorneredMarket.class));
        cards.add(new SetCardInfo("Corrupt Official", 128, Rarity.RARE, mage.cards.c.CorruptOfficial.class));
        cards.add(new SetCardInfo("Counterspell", 69, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Cowardice", 70, Rarity.RARE, mage.cards.c.Cowardice.class));
        cards.add(new SetCardInfo("Crackdown", 15, Rarity.RARE, mage.cards.c.Crackdown.class));
        cards.add(new SetCardInfo("Crag Saurian", 185, Rarity.RARE, mage.cards.c.CragSaurian.class));
        cards.add(new SetCardInfo("Crash", 186, Rarity.COMMON, mage.cards.c.Crash.class));
        cards.add(new SetCardInfo("Credit Voucher", 289, Rarity.UNCOMMON, mage.cards.c.CreditVoucher.class));
        cards.add(new SetCardInfo("Crenellated Wall", 290, Rarity.UNCOMMON, mage.cards.c.CrenellatedWall.class));
        cards.add(new SetCardInfo("Crooked Scales", 291, Rarity.RARE, mage.cards.c.CrookedScales.class));
        cards.add(new SetCardInfo("Crossbow Infantry", 16, Rarity.COMMON, mage.cards.c.CrossbowInfantry.class));
        cards.add(new SetCardInfo("Crumbling Sanctuary", 292, Rarity.RARE, mage.cards.c.CrumblingSanctuary.class));
        cards.add(new SetCardInfo("Customs Depot", 71, Rarity.UNCOMMON, mage.cards.c.CustomsDepot.class));
        cards.add(new SetCardInfo("Dark Ritual", 129, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Darting Merfolk", 72, Rarity.COMMON, mage.cards.d.DartingMerfolk.class));
        cards.add(new SetCardInfo("Dawnstrider", 237, Rarity.RARE, mage.cards.d.Dawnstrider.class));
        cards.add(new SetCardInfo("Deadly Insect", 238, Rarity.COMMON, mage.cards.d.DeadlyInsect.class));
        cards.add(new SetCardInfo("Deathgazer", 130, Rarity.UNCOMMON, mage.cards.d.Deathgazer.class));
        cards.add(new SetCardInfo("Deepwood Drummer", 239, Rarity.COMMON, mage.cards.d.DeepwoodDrummer.class));
        cards.add(new SetCardInfo("Deepwood Elder", 240, Rarity.RARE, mage.cards.d.DeepwoodElder.class));
        cards.add(new SetCardInfo("Deepwood Ghoul", 131, Rarity.COMMON, mage.cards.d.DeepwoodGhoul.class));
        cards.add(new SetCardInfo("Deepwood Legate", 132, Rarity.UNCOMMON, mage.cards.d.DeepwoodLegate.class));
        cards.add(new SetCardInfo("Deepwood Tantiv", 241, Rarity.UNCOMMON, mage.cards.d.DeepwoodTantiv.class));
        cards.add(new SetCardInfo("Deepwood Wolverine", 242, Rarity.COMMON, mage.cards.d.DeepwoodWolverine.class));
        cards.add(new SetCardInfo("Dehydration", 73, Rarity.COMMON, mage.cards.d.Dehydration.class));
        cards.add(new SetCardInfo("Delraich", 133, Rarity.RARE, mage.cards.d.Delraich.class));
        cards.add(new SetCardInfo("Desert Twister", 243, Rarity.UNCOMMON, mage.cards.d.DesertTwister.class));
        cards.add(new SetCardInfo("Devout Witness", 17, Rarity.COMMON, mage.cards.d.DevoutWitness.class));
        cards.add(new SetCardInfo("Diplomatic Escort", 74, Rarity.UNCOMMON, mage.cards.d.DiplomaticEscort.class));
        cards.add(new SetCardInfo("Diplomatic Immunity", 75, Rarity.COMMON, mage.cards.d.DiplomaticImmunity.class));
        cards.add(new SetCardInfo("Disenchant", 18, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Distorting Lens", 293, Rarity.RARE, mage.cards.d.DistortingLens.class));
        cards.add(new SetCardInfo("Drake Hatchling", 76, Rarity.COMMON, mage.cards.d.DrakeHatchling.class));
        cards.add(new SetCardInfo("Dust Bowl", 316, Rarity.RARE, mage.cards.d.DustBowl.class));
        cards.add(new SetCardInfo("Embargo", 77, Rarity.RARE, mage.cards.e.Embargo.class));
        cards.add(new SetCardInfo("Energy Flux", 78, Rarity.UNCOMMON, mage.cards.e.EnergyFlux.class));
        cards.add(new SetCardInfo("Enslaved Horror", 134, Rarity.UNCOMMON, mage.cards.e.EnslavedHorror.class));
        cards.add(new SetCardInfo("Extortion", 135, Rarity.RARE, mage.cards.e.Extortion.class));
        cards.add(new SetCardInfo("Extravagant Spirit", 79, Rarity.RARE, mage.cards.e.ExtravagantSpirit.class));
        cards.add(new SetCardInfo("Eye of Ramos", 294, Rarity.RARE, mage.cards.e.EyeOfRamos.class));
        cards.add(new SetCardInfo("False Demise", 80, Rarity.UNCOMMON, mage.cards.f.FalseDemise.class));
        cards.add(new SetCardInfo("Ferocity", 245, Rarity.COMMON, mage.cards.f.Ferocity.class));
        cards.add(new SetCardInfo("Flailing Manticore", 187, Rarity.RARE, mage.cards.f.FlailingManticore.class));
        cards.add(new SetCardInfo("Flailing Ogre", 188, Rarity.UNCOMMON, mage.cards.f.FlailingOgre.class));
        cards.add(new SetCardInfo("Flailing Soldier", 189, Rarity.COMMON, mage.cards.f.FlailingSoldier.class));
        cards.add(new SetCardInfo("Flaming Sword", 190, Rarity.COMMON, mage.cards.f.FlamingSword.class));
        cards.add(new SetCardInfo("Food Chain", 246, Rarity.RARE, mage.cards.f.FoodChain.class));
        cards.add(new SetCardInfo("Forced March", 136, Rarity.RARE, mage.cards.f.ForcedMarch.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Foster", 247, Rarity.RARE, mage.cards.f.Foster.class));
        cards.add(new SetCardInfo("Fountain of Cho", 317, Rarity.UNCOMMON, mage.cards.f.FountainOfCho.class));
        cards.add(new SetCardInfo("Fountain Watch", 19, Rarity.RARE, mage.cards.f.FountainWatch.class));
        cards.add(new SetCardInfo("Fresh Volunteers", 20, Rarity.COMMON, mage.cards.f.FreshVolunteers.class));
        cards.add(new SetCardInfo("Furious Assault", 191, Rarity.COMMON, mage.cards.f.FuriousAssault.class));
        cards.add(new SetCardInfo("Game Preserve", 248, Rarity.RARE, mage.cards.g.GamePreserve.class));
        cards.add(new SetCardInfo("General's Regalia", 295, Rarity.RARE, mage.cards.g.GeneralsRegalia.class));
        cards.add(new SetCardInfo("Gerrard's Irregulars", 192, Rarity.COMMON, mage.cards.g.GerrardsIrregulars.class));
        cards.add(new SetCardInfo("Ghoul's Feast", 137, Rarity.UNCOMMON, mage.cards.g.GhoulsFeast.class));
        cards.add(new SetCardInfo("Giant Caterpillar", 249, Rarity.COMMON, mage.cards.g.GiantCaterpillar.class));
        cards.add(new SetCardInfo("Glowing Anemone", 81, Rarity.UNCOMMON, mage.cards.g.GlowingAnemone.class));
        cards.add(new SetCardInfo("Groundskeeper", 250, Rarity.UNCOMMON, mage.cards.g.Groundskeeper.class));
        cards.add(new SetCardInfo("Gush", 82, Rarity.COMMON, mage.cards.g.Gush.class));
        cards.add(new SetCardInfo("Hammer Mage", 193, Rarity.UNCOMMON, mage.cards.h.HammerMage.class));
        cards.add(new SetCardInfo("Haunted Crossroads", 138, Rarity.UNCOMMON, mage.cards.h.HauntedCrossroads.class));
        cards.add(new SetCardInfo("Heart of Ramos", 296, Rarity.RARE, mage.cards.h.HeartOfRamos.class));
        cards.add(new SetCardInfo("Henge Guardian", 297, Rarity.UNCOMMON, mage.cards.h.HengeGuardian.class));
        cards.add(new SetCardInfo("Henge of Ramos", 318, Rarity.UNCOMMON, mage.cards.h.HengeOfRamos.class));
        cards.add(new SetCardInfo("Hickory Woodlot", 319, Rarity.COMMON, mage.cards.h.HickoryWoodlot.class));
        cards.add(new SetCardInfo("High Market", 320, Rarity.RARE, mage.cards.h.HighMarket.class));
        cards.add(new SetCardInfo("High Seas", 83, Rarity.UNCOMMON, mage.cards.h.HighSeas.class));
        cards.add(new SetCardInfo("Highway Robber", 139, Rarity.COMMON, mage.cards.h.HighwayRobber.class));
        cards.add(new SetCardInfo("Hired Giant", 194, Rarity.UNCOMMON, mage.cards.h.HiredGiant.class));
        cards.add(new SetCardInfo("Honor the Fallen", 21, Rarity.RARE, mage.cards.h.HonorTheFallen.class));
        cards.add(new SetCardInfo("Hoodwink", 84, Rarity.COMMON, mage.cards.h.Hoodwink.class));
        cards.add(new SetCardInfo("Horned Troll", 251, Rarity.COMMON, mage.cards.h.HornedTroll.class));
        cards.add(new SetCardInfo("Horn of Plenty", 298, Rarity.RARE, mage.cards.h.HornOfPlenty.class));
        cards.add(new SetCardInfo("Horn of Ramos", 299, Rarity.RARE, mage.cards.h.HornOfRamos.class));
        cards.add(new SetCardInfo("Howling Wolf", 252, Rarity.COMMON, mage.cards.h.HowlingWolf.class));
        cards.add(new SetCardInfo("Hunted Wumpus", 253, Rarity.UNCOMMON, mage.cards.h.HuntedWumpus.class));
        cards.add(new SetCardInfo("Ignoble Soldier", 22, Rarity.UNCOMMON, mage.cards.i.IgnobleSoldier.class));
        cards.add(new SetCardInfo("Indentured Djinn", 85, Rarity.UNCOMMON, mage.cards.i.IndenturedDjinn.class));
        cards.add(new SetCardInfo("Instigator", 140, Rarity.RARE, mage.cards.i.Instigator.class));
        cards.add(new SetCardInfo("Insubordination", 141, Rarity.COMMON, mage.cards.i.Insubordination.class));
        cards.add(new SetCardInfo("Intimidation", 142, Rarity.UNCOMMON, mage.cards.i.Intimidation.class));
        cards.add(new SetCardInfo("Invigorate", 254, Rarity.COMMON, mage.cards.i.Invigorate.class));
        cards.add(new SetCardInfo("Inviolability", 23, Rarity.COMMON, mage.cards.i.Inviolability.class));
        cards.add(new SetCardInfo("Iron Lance", 300, Rarity.UNCOMMON, mage.cards.i.IronLance.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivory Mask", 24, Rarity.RARE, mage.cards.i.IvoryMask.class));
        cards.add(new SetCardInfo("Jeweled Torque", 301, Rarity.UNCOMMON, mage.cards.j.JeweledTorque.class));
        cards.add(new SetCardInfo("Jhovall Queen", 25, Rarity.RARE, mage.cards.j.JhovallQueen.class));
        cards.add(new SetCardInfo("Jhovall Rider", 26, Rarity.UNCOMMON, mage.cards.j.JhovallRider.class));
        cards.add(new SetCardInfo("Karn's Touch", 86, Rarity.RARE, mage.cards.k.KarnsTouch.class));
        cards.add(new SetCardInfo("Kris Mage", 195, Rarity.COMMON, mage.cards.k.KrisMage.class));
        cards.add(new SetCardInfo("Kyren Archive", 302, Rarity.RARE, mage.cards.k.KyrenArchive.class));
        cards.add(new SetCardInfo("Kyren Glider", 196, Rarity.COMMON, mage.cards.k.KyrenGlider.class));
        cards.add(new SetCardInfo("Kyren Legate", 197, Rarity.UNCOMMON, mage.cards.k.KyrenLegate.class));
        cards.add(new SetCardInfo("Kyren Negotiations", 198, Rarity.UNCOMMON, mage.cards.k.KyrenNegotiations.class));
        cards.add(new SetCardInfo("Kyren Sniper", 199, Rarity.COMMON, mage.cards.k.KyrenSniper.class));
        cards.add(new SetCardInfo("Kyren Toy", 303, Rarity.RARE, mage.cards.k.KyrenToy.class));
        cards.add(new SetCardInfo("Land Grant", 255, Rarity.COMMON, mage.cards.l.LandGrant.class));
        cards.add(new SetCardInfo("Larceny", 143, Rarity.UNCOMMON, mage.cards.l.Larceny.class));
        cards.add(new SetCardInfo("Last Breath", 27, Rarity.UNCOMMON, mage.cards.l.LastBreath.class));
        cards.add(new SetCardInfo("Lava Runner", 200, Rarity.RARE, mage.cards.l.LavaRunner.class));
        cards.add(new SetCardInfo("Liability", 144, Rarity.RARE, mage.cards.l.Liability.class));
        cards.add(new SetCardInfo("Lightning Hounds", 201, Rarity.COMMON, mage.cards.l.LightningHounds.class));
        cards.add(new SetCardInfo("Lithophage", 202, Rarity.RARE, mage.cards.l.Lithophage.class));
        cards.add(new SetCardInfo("Lumbering Satyr", 257, Rarity.UNCOMMON, mage.cards.l.LumberingSatyr.class));
        cards.add(new SetCardInfo("Lunge", 203, Rarity.COMMON, mage.cards.l.Lunge.class));
        cards.add(new SetCardInfo("Lure", 258, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Maggot Therapy", 145, Rarity.COMMON, mage.cards.m.MaggotTherapy.class));
        cards.add(new SetCardInfo("Magistrate's Scepter", 304, Rarity.RARE, mage.cards.m.MagistratesScepter.class));
        cards.add(new SetCardInfo("Magistrate's Veto", 204, Rarity.UNCOMMON, mage.cards.m.MagistratesVeto.class));
        cards.add(new SetCardInfo("Megatherium", 259, Rarity.RARE, mage.cards.m.Megatherium.class));
        cards.add(new SetCardInfo("Mercadia's Downfall", 205, Rarity.UNCOMMON, mage.cards.m.MercadiasDownfall.class));
        cards.add(new SetCardInfo("Mercadian Atlas", 305, Rarity.RARE, mage.cards.m.MercadianAtlas.class));
        cards.add(new SetCardInfo("Mercadian Bazaar", 321, Rarity.UNCOMMON, mage.cards.m.MercadianBazaar.class));
        cards.add(new SetCardInfo("Mercadian Lift", 306, Rarity.RARE, mage.cards.m.MercadianLift.class));
        cards.add(new SetCardInfo("Midnight Ritual", 146, Rarity.RARE, mage.cards.m.MidnightRitual.class));
        cards.add(new SetCardInfo("Misdirection", 87, Rarity.RARE, mage.cards.m.Misdirection.class));
        cards.add(new SetCardInfo("Misshapen Fiend", 147, Rarity.COMMON, mage.cards.m.MisshapenFiend.class));
        cards.add(new SetCardInfo("Misstep", 88, Rarity.COMMON, mage.cards.m.Misstep.class));
        cards.add(new SetCardInfo("Molting Harpy", 148, Rarity.UNCOMMON, mage.cards.m.MoltingHarpy.class));
        cards.add(new SetCardInfo("Moment of Silence", 28, Rarity.COMMON, mage.cards.m.MomentOfSilence.class));
        cards.add(new SetCardInfo("Monkey Cage", 307, Rarity.RARE, mage.cards.m.MonkeyCage.class));
        cards.add(new SetCardInfo("Moonlit Wake", 29, Rarity.UNCOMMON, mage.cards.m.MoonlitWake.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Muzzle", 30, Rarity.COMMON, mage.cards.m.Muzzle.class));
        cards.add(new SetCardInfo("Natural Affinity", 260, Rarity.RARE, mage.cards.n.NaturalAffinity.class));
        cards.add(new SetCardInfo("Nether Spirit", 149, Rarity.RARE, mage.cards.n.NetherSpirit.class));
        cards.add(new SetCardInfo("Nightwind Glider", 31, Rarity.COMMON, mage.cards.n.NightwindGlider.class));
        cards.add(new SetCardInfo("Noble Purpose", 32, Rarity.UNCOMMON, mage.cards.n.NoblePurpose.class));
        cards.add(new SetCardInfo("Notorious Assassin", 150, Rarity.RARE, mage.cards.n.NotoriousAssassin.class));
        cards.add(new SetCardInfo("Ogre Taskmaster", 206, Rarity.UNCOMMON, mage.cards.o.OgreTaskmaster.class));
        cards.add(new SetCardInfo("Orim's Cure", 33, Rarity.COMMON, mage.cards.o.OrimsCure.class));
        cards.add(new SetCardInfo("Overtaker", 89, Rarity.RARE, mage.cards.o.Overtaker.class));
        cards.add(new SetCardInfo("Panacea", 308, Rarity.UNCOMMON, mage.cards.p.Panacea.class));
        cards.add(new SetCardInfo("Pangosaur", 261, Rarity.RARE, mage.cards.p.Pangosaur.class));
        cards.add(new SetCardInfo("Peat Bog", 322, Rarity.COMMON, mage.cards.p.PeatBog.class));
        cards.add(new SetCardInfo("Pious Warrior", 34, Rarity.COMMON, mage.cards.p.PiousWarrior.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Port Inspector", 90, Rarity.COMMON, mage.cards.p.PortInspector.class));
        cards.add(new SetCardInfo("Power Matrix", 309, Rarity.RARE, mage.cards.p.PowerMatrix.class));
        cards.add(new SetCardInfo("Pretender's Claim", 151, Rarity.UNCOMMON, mage.cards.p.PretendersClaim.class));
        cards.add(new SetCardInfo("Primeval Shambler", 152, Rarity.UNCOMMON, mage.cards.p.PrimevalShambler.class));
        cards.add(new SetCardInfo("Puffer Extract", 310, Rarity.UNCOMMON, mage.cards.p.PufferExtract.class));
        cards.add(new SetCardInfo("Pulverize", 207, Rarity.RARE, mage.cards.p.Pulverize.class));
        cards.add(new SetCardInfo("Putrefaction", 153, Rarity.UNCOMMON, mage.cards.p.Putrefaction.class));
        cards.add(new SetCardInfo("Puppet's Verdict", 208, Rarity.RARE, mage.cards.p.PuppetsVerdict.class));
        cards.add(new SetCardInfo("Quagmire Lamprey", 154, Rarity.UNCOMMON, mage.cards.q.QuagmireLamprey.class));
        cards.add(new SetCardInfo("Rain of Tears", 155, Rarity.UNCOMMON, mage.cards.r.RainOfTears.class));
        cards.add(new SetCardInfo("Ramosian Captain", 35, Rarity.UNCOMMON, mage.cards.r.RamosianCaptain.class));
        cards.add(new SetCardInfo("Ramosian Commander", 36, Rarity.UNCOMMON, mage.cards.r.RamosianCommander.class));
        cards.add(new SetCardInfo("Ramosian Lieutenant", 37, Rarity.COMMON, mage.cards.r.RamosianLieutenant.class));
        cards.add(new SetCardInfo("Ramosian Rally", 38, Rarity.COMMON, mage.cards.r.RamosianRally.class));
        cards.add(new SetCardInfo("Ramosian Sergeant", 39, Rarity.COMMON, mage.cards.r.RamosianSergeant.class));
        cards.add(new SetCardInfo("Ramosian Sky Marshal", 40, Rarity.RARE, mage.cards.r.RamosianSkyMarshal.class));
        cards.add(new SetCardInfo("Rampart Crawler", 156, Rarity.COMMON, mage.cards.r.RampartCrawler.class));
        cards.add(new SetCardInfo("Rappelling Scouts", 41, Rarity.RARE, mage.cards.r.RappellingScouts.class));
        cards.add(new SetCardInfo("Remote Farm", 323, Rarity.COMMON, mage.cards.r.RemoteFarm.class));
        cards.add(new SetCardInfo("Renounce", 42, Rarity.UNCOMMON, mage.cards.r.Renounce.class));
        cards.add(new SetCardInfo("Revered Elder", 43, Rarity.COMMON, mage.cards.r.ReveredElder.class));
        cards.add(new SetCardInfo("Reverent Mantra", 44, Rarity.RARE, mage.cards.r.ReverentMantra.class));
        cards.add(new SetCardInfo("Revive", 262, Rarity.UNCOMMON, mage.cards.r.Revive.class));
        cards.add(new SetCardInfo("Righteous Aura", 45, Rarity.UNCOMMON, mage.cards.r.RighteousAura.class));
        cards.add(new SetCardInfo("Righteous Indignation", 46, Rarity.UNCOMMON, mage.cards.r.RighteousIndignation.class));
        cards.add(new SetCardInfo("Rishadan Airship", 91, Rarity.COMMON, mage.cards.r.RishadanAirship.class));
        cards.add(new SetCardInfo("Rishadan Brigand", 92, Rarity.RARE, mage.cards.r.RishadanBrigand.class));
        cards.add(new SetCardInfo("Rishadan Cutpurse", 93, Rarity.COMMON, mage.cards.r.RishadanCutpurse.class));
        cards.add(new SetCardInfo("Rishadan Footpad", 94, Rarity.UNCOMMON, mage.cards.r.RishadanFootpad.class));
        cards.add(new SetCardInfo("Rishadan Pawnshop", 311, Rarity.RARE, mage.cards.r.RishadanPawnshop.class));
        cards.add(new SetCardInfo("Rishadan Port", 324, Rarity.RARE, mage.cards.r.RishadanPort.class));
        cards.add(new SetCardInfo("Robber Fly", 209, Rarity.UNCOMMON, mage.cards.r.RobberFly.class));
        cards.add(new SetCardInfo("Rock Badger", 210, Rarity.UNCOMMON, mage.cards.r.RockBadger.class));
        cards.add(new SetCardInfo("Rouse", 157, Rarity.COMMON, mage.cards.r.Rouse.class));
        cards.add(new SetCardInfo("Rushwood Dryad", 263, Rarity.COMMON, mage.cards.r.RushwoodDryad.class));
        cards.add(new SetCardInfo("Rushwood Elemental", 264, Rarity.RARE, mage.cards.r.RushwoodElemental.class));
        cards.add(new SetCardInfo("Rushwood Grove", 325, Rarity.UNCOMMON, mage.cards.r.RushwoodGrove.class));
        cards.add(new SetCardInfo("Rushwood Herbalist", 265, Rarity.COMMON, mage.cards.r.RushwoodHerbalist.class));
        cards.add(new SetCardInfo("Rushwood Legate", 266, Rarity.UNCOMMON, mage.cards.r.RushwoodLegate.class));
        cards.add(new SetCardInfo("Saber Ants", 267, Rarity.UNCOMMON, mage.cards.s.SaberAnts.class));
        cards.add(new SetCardInfo("Sacred Prey", 268, Rarity.COMMON, mage.cards.s.SacredPrey.class));
        cards.add(new SetCardInfo("Sailmonger", 95, Rarity.UNCOMMON, mage.cards.s.Sailmonger.class));
        cards.add(new SetCardInfo("Sand Squid", 96, Rarity.RARE, mage.cards.s.SandSquid.class));
        cards.add(new SetCardInfo("Sandstone Needle", 326, Rarity.COMMON, mage.cards.s.SandstoneNeedle.class));
        cards.add(new SetCardInfo("Saprazzan Bailiff", 97, Rarity.RARE, mage.cards.s.SaprazzanBailiff.class));
        cards.add(new SetCardInfo("Saprazzan Breaker", 98, Rarity.UNCOMMON, mage.cards.s.SaprazzanBreaker.class));
        cards.add(new SetCardInfo("Saprazzan Cove", 327, Rarity.UNCOMMON, mage.cards.s.SaprazzanCove.class));
        cards.add(new SetCardInfo("Saprazzan Heir", 99, Rarity.RARE, mage.cards.s.SaprazzanHeir.class));
        cards.add(new SetCardInfo("Saprazzan Legate", 100, Rarity.UNCOMMON, mage.cards.s.SaprazzanLegate.class));
        cards.add(new SetCardInfo("Saprazzan Outrigger", 101, Rarity.COMMON, mage.cards.s.SaprazzanOutrigger.class));
        cards.add(new SetCardInfo("Saprazzan Raider", 102, Rarity.COMMON, mage.cards.s.SaprazzanRaider.class));
        cards.add(new SetCardInfo("Saprazzan Skerry", 328, Rarity.COMMON, mage.cards.s.SaprazzanSkerry.class));
        cards.add(new SetCardInfo("Scandalmonger", 158, Rarity.UNCOMMON, mage.cards.s.Scandalmonger.class));
        cards.add(new SetCardInfo("Security Detail", 47, Rarity.RARE, mage.cards.s.SecurityDetail.class));
        cards.add(new SetCardInfo("Seismic Mage", 211, Rarity.RARE, mage.cards.s.SeismicMage.class));
        cards.add(new SetCardInfo("Sever Soul", 159, Rarity.COMMON, mage.cards.s.SeverSoul.class));
        cards.add(new SetCardInfo("Shock Troops", 212, Rarity.COMMON, mage.cards.s.ShockTroops.class));
        cards.add(new SetCardInfo("Shoving Match", 103, Rarity.UNCOMMON, mage.cards.s.ShovingMatch.class));
        cards.add(new SetCardInfo("Silent Assassin", 160, Rarity.RARE, mage.cards.s.SilentAssassin.class));
        cards.add(new SetCardInfo("Silverglade Elemental", 269, Rarity.COMMON, mage.cards.s.SilvergladeElemental.class));
        cards.add(new SetCardInfo("Silverglade Pathfinder", 270, Rarity.UNCOMMON, mage.cards.s.SilvergladePathfinder.class));
        cards.add(new SetCardInfo("Sizzle", 213, Rarity.COMMON, mage.cards.s.Sizzle.class));
        cards.add(new SetCardInfo("Skulking Fugitive", 161, Rarity.COMMON, mage.cards.s.SkulkingFugitive.class));
        cards.add(new SetCardInfo("Skull of Ramos", 312, Rarity.RARE, mage.cards.s.SkullOfRamos.class));
        cards.add(new SetCardInfo("Snake Pit", 271, Rarity.UNCOMMON, mage.cards.s.SnakePit.class));
        cards.add(new SetCardInfo("Snorting Gahr", 272, Rarity.COMMON, mage.cards.s.SnortingGahr.class));
        cards.add(new SetCardInfo("Snuff Out", 162, Rarity.COMMON, mage.cards.s.SnuffOut.class));
        cards.add(new SetCardInfo("Soothing Balm", 48, Rarity.COMMON, mage.cards.s.SoothingBalm.class));
        cards.add(new SetCardInfo("Soothsaying", 104, Rarity.UNCOMMON, mage.cards.s.Soothsaying.class));
        cards.add(new SetCardInfo("Soul Channeling", 163, Rarity.COMMON, mage.cards.s.SoulChanneling.class));
        cards.add(new SetCardInfo("Specter's Wail", 164, Rarity.COMMON, mage.cards.s.SpectersWail.class));
        cards.add(new SetCardInfo("Spidersilk Armor", 273, Rarity.COMMON, mage.cards.s.SpidersilkArmor.class));
        cards.add(new SetCardInfo("Spiritual Focus", 49, Rarity.RARE, mage.cards.s.SpiritualFocus.class));
        cards.add(new SetCardInfo("Spontaneous Generation", 274, Rarity.RARE, mage.cards.s.SpontaneousGeneration.class));
        cards.add(new SetCardInfo("Squall", 275, Rarity.COMMON, mage.cards.s.Squall.class));
        cards.add(new SetCardInfo("Squallmonger", 276, Rarity.UNCOMMON, mage.cards.s.Squallmonger.class));
        cards.add(new SetCardInfo("Squee, Goblin Nabob", 214, Rarity.RARE, mage.cards.s.SqueeGoblinNabob.class));
        cards.add(new SetCardInfo("Squeeze", 105, Rarity.RARE, mage.cards.s.Squeeze.class));
        cards.add(new SetCardInfo("Stamina", 277, Rarity.UNCOMMON, mage.cards.s.Stamina.class));
        cards.add(new SetCardInfo("Statecraft", 106, Rarity.RARE, mage.cards.s.Statecraft.class));
        cards.add(new SetCardInfo("Steadfast Guard", 50, Rarity.COMMON, mage.cards.s.SteadfastGuard.class));
        cards.add(new SetCardInfo("Stinging Barrier", 107, Rarity.COMMON, mage.cards.s.StingingBarrier.class));
        cards.add(new SetCardInfo("Stone Rain", 215, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Story Circle", 51, Rarity.UNCOMMON, mage.cards.s.StoryCircle.class));
        cards.add(new SetCardInfo("Strongarm Thug", 165, Rarity.UNCOMMON, mage.cards.s.StrongarmThug.class));
        cards.add(new SetCardInfo("Subterranean Hangar", 329, Rarity.UNCOMMON, mage.cards.s.SubterraneanHangar.class));
        cards.add(new SetCardInfo("Sustenance", 278, Rarity.UNCOMMON, mage.cards.s.Sustenance.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Task Force", 52, Rarity.COMMON, mage.cards.t.TaskForce.class));
        cards.add(new SetCardInfo("Tectonic Break", 216, Rarity.RARE, mage.cards.t.TectonicBreak.class));
        cards.add(new SetCardInfo("Territorial Dispute", 217, Rarity.RARE, mage.cards.t.TerritorialDispute.class));
        cards.add(new SetCardInfo("Thermal Glider", 53, Rarity.COMMON, mage.cards.t.ThermalGlider.class));
        cards.add(new SetCardInfo("Thieves' Auction", 218, Rarity.RARE, mage.cards.t.ThievesAuction.class));
        cards.add(new SetCardInfo("Thrashing Wumpus", 166, Rarity.RARE, mage.cards.t.ThrashingWumpus.class));
        cards.add(new SetCardInfo("Thunderclap", 219, Rarity.COMMON, mage.cards.t.Thunderclap.class));
        cards.add(new SetCardInfo("Thwart", 108, Rarity.UNCOMMON, mage.cards.t.Thwart.class));
        cards.add(new SetCardInfo("Tidal Bore", 109, Rarity.COMMON, mage.cards.t.TidalBore.class));
        cards.add(new SetCardInfo("Tidal Kraken", 110, Rarity.RARE, mage.cards.t.TidalKraken.class));
        cards.add(new SetCardInfo("Tiger Claws", 279, Rarity.COMMON, mage.cards.t.TigerClaws.class));
        cards.add(new SetCardInfo("Timid Drake", 111, Rarity.UNCOMMON, mage.cards.t.TimidDrake.class));
        cards.add(new SetCardInfo("Tonic Peddler", 54, Rarity.UNCOMMON, mage.cards.t.TonicPeddler.class));
        cards.add(new SetCardInfo("Tooth of Ramos", 313, Rarity.RARE, mage.cards.t.ToothOfRamos.class));
        cards.add(new SetCardInfo("Tower of the Magistrate", 330, Rarity.RARE, mage.cards.t.TowerOfTheMagistrate.class));
        cards.add(new SetCardInfo("Toymaker", 314, Rarity.UNCOMMON, mage.cards.t.Toymaker.class));
        cards.add(new SetCardInfo("Trade Routes", 112, Rarity.RARE, mage.cards.t.TradeRoutes.class));
        cards.add(new SetCardInfo("Tranquility", 280, Rarity.COMMON, mage.cards.t.Tranquility.class));
        cards.add(new SetCardInfo("Trap Runner", 55, Rarity.UNCOMMON, mage.cards.t.TrapRunner.class));
        cards.add(new SetCardInfo("Tremor", 220, Rarity.COMMON, mage.cards.t.Tremor.class));
        cards.add(new SetCardInfo("Two-Headed Dragon", 221, Rarity.RARE, mage.cards.t.TwoHeadedDragon.class));
        cards.add(new SetCardInfo("Undertaker", 167, Rarity.COMMON, mage.cards.u.Undertaker.class));
        cards.add(new SetCardInfo("Unmask", 168, Rarity.RARE, mage.cards.u.Unmask.class));
        cards.add(new SetCardInfo("Unnatural Hunger", 169, Rarity.RARE, mage.cards.u.UnnaturalHunger.class));
        cards.add(new SetCardInfo("Uphill Battle", 222, Rarity.UNCOMMON, mage.cards.u.UphillBattle.class));
        cards.add(new SetCardInfo("Vendetta", 170, Rarity.COMMON, mage.cards.v.Vendetta.class));
        cards.add(new SetCardInfo("Venomous Breath", 281, Rarity.UNCOMMON, mage.cards.v.VenomousBreath.class));
        cards.add(new SetCardInfo("Venomous Dragonfly", 282, Rarity.COMMON, mage.cards.v.VenomousDragonfly.class));
        cards.add(new SetCardInfo("Vernal Equinox", 283, Rarity.RARE, mage.cards.v.VernalEquinox.class));
        cards.add(new SetCardInfo("Vine Dryad", 284, Rarity.RARE, mage.cards.v.VineDryad.class));
        cards.add(new SetCardInfo("Vine Trellis", 285, Rarity.COMMON, mage.cards.v.VineTrellis.class));
        cards.add(new SetCardInfo("Volcanic Wind", 223, Rarity.UNCOMMON, mage.cards.v.VolcanicWind.class));
        cards.add(new SetCardInfo("Wall of Distortion", 171, Rarity.COMMON, mage.cards.w.WallOfDistortion.class));
        cards.add(new SetCardInfo("War Cadence", 224, Rarity.UNCOMMON, mage.cards.w.WarCadence.class));
        cards.add(new SetCardInfo("War Tax", 113, Rarity.UNCOMMON, mage.cards.w.WarTax.class));
        cards.add(new SetCardInfo("Warmonger", 225, Rarity.UNCOMMON, mage.cards.w.Warmonger.class));
        cards.add(new SetCardInfo("Warpath", 226, Rarity.UNCOMMON, mage.cards.w.Warpath.class));
        cards.add(new SetCardInfo("Waterfront Bouncer", 114, Rarity.COMMON, mage.cards.w.WaterfrontBouncer.class));
        cards.add(new SetCardInfo("Wave of Reckoning", 56, Rarity.RARE, mage.cards.w.WaveOfReckoning.class));
        cards.add(new SetCardInfo("Wild Jhovall", 227, Rarity.COMMON, mage.cards.w.WildJhovall.class));
        cards.add(new SetCardInfo("Wishmonger", 57, Rarity.UNCOMMON, mage.cards.w.Wishmonger.class));
        cards.add(new SetCardInfo("Word of Blasting", 228, Rarity.UNCOMMON, mage.cards.w.WordOfBlasting.class));
        cards.add(new SetCardInfo("Worry Beads", 315, Rarity.RARE, mage.cards.w.WorryBeads.class));
    }
}
