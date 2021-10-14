package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.List;

public final class NinthEdition extends ExpansionSet {

    private static final NinthEdition instance = new NinthEdition();

    public static NinthEdition getInstance() {
        return instance;
    }

    private NinthEdition() {
        super("Ninth Edition", "9ED", ExpansionSet.buildDate(2005, 7, 29), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Adarkar Wastes", 317, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Air Elemental", 58, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Aladdin's Ring", 286, Rarity.RARE, mage.cards.a.AladdinsRing.class));
        cards.add(new SetCardInfo("Anaba Shaman", 172, Rarity.COMMON, mage.cards.a.AnabaShaman.class));
        cards.add(new SetCardInfo("Anaconda", 229, Rarity.UNCOMMON, mage.cards.a.Anaconda.class));
        cards.add(new SetCardInfo("Anarchist", 173, Rarity.UNCOMMON, mage.cards.a.Anarchist.class));
        cards.add(new SetCardInfo("Ancient Silverback", 230, Rarity.RARE, mage.cards.a.AncientSilverback.class));
        cards.add(new SetCardInfo("Angelic Blessing", 2, Rarity.COMMON, mage.cards.a.AngelicBlessing.class));
        cards.add(new SetCardInfo("Angel of Mercy", 1, Rarity.UNCOMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Angel's Feather", 287, Rarity.UNCOMMON, mage.cards.a.AngelsFeather.class));
        cards.add(new SetCardInfo("Annex", 59, Rarity.UNCOMMON, mage.cards.a.Annex.class));
        cards.add(new SetCardInfo("Archivist", 60, Rarity.RARE, mage.cards.a.Archivist.class));
        cards.add(new SetCardInfo("Aven Cloudchaser", 3, Rarity.COMMON, mage.cards.a.AvenCloudchaser.class));
        cards.add(new SetCardInfo("Aven Fisher", 61, Rarity.COMMON, mage.cards.a.AvenFisher.class));
        cards.add(new SetCardInfo("Aven Flock", 4, Rarity.COMMON, mage.cards.a.AvenFlock.class));
        cards.add(new SetCardInfo("Aven Windreader", 62, Rarity.COMMON, mage.cards.a.AvenWindreader.class));
        cards.add(new SetCardInfo("Azure Drake", 63, Rarity.UNCOMMON, mage.cards.a.AzureDrake.class));
        cards.add(new SetCardInfo("Balduvian Barbarians", 174, Rarity.COMMON, mage.cards.b.BalduvianBarbarians.class));
        cards.add(new SetCardInfo("Baleful Stare", 64, Rarity.UNCOMMON, mage.cards.b.BalefulStare.class));
        cards.add(new SetCardInfo("Ballista Squad", 5, Rarity.UNCOMMON, mage.cards.b.BallistaSquad.class));
        cards.add(new SetCardInfo("Battlefield Forge", 318, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Battle of Wits", 65, Rarity.RARE, mage.cards.b.BattleOfWits.class));
        cards.add(new SetCardInfo("Beast of Burden", 288, Rarity.RARE, mage.cards.b.BeastOfBurden.class));
        cards.add(new SetCardInfo("Biorhythm", 231, Rarity.RARE, mage.cards.b.Biorhythm.class));
        cards.add(new SetCardInfo("Blackmail", 115, Rarity.UNCOMMON, mage.cards.b.Blackmail.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 232, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blaze", 175, Rarity.UNCOMMON, mage.cards.b.Blaze.class));
        cards.add(new SetCardInfo("Blessed Orator", 6, Rarity.UNCOMMON, mage.cards.b.BlessedOrator.class));
        cards.add(new SetCardInfo("Blinding Angel", 7, Rarity.RARE, mage.cards.b.BlindingAngel.class));
        cards.add(new SetCardInfo("Blinking Spirit", 8, Rarity.RARE, mage.cards.b.BlinkingSpirit.class));
        cards.add(new SetCardInfo("Bloodfire Colossus", 177, Rarity.RARE, mage.cards.b.BloodfireColossus.class));
        cards.add(new SetCardInfo("Blood Moon", 176, Rarity.RARE, mage.cards.b.BloodMoon.class));
        cards.add(new SetCardInfo("Bog Imp", 116, Rarity.COMMON, mage.cards.b.BogImp.class));
        cards.add(new SetCardInfo("Bog Wraith", 117, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Boiling Seas", 178, Rarity.UNCOMMON, mage.cards.b.BoilingSeas.class));
        cards.add(new SetCardInfo("Booby Trap", 289, Rarity.RARE, mage.cards.b.BoobyTrap.class));
        cards.add(new SetCardInfo("Boomerang", 66, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Bottle Gnomes", 290, Rarity.UNCOMMON, mage.cards.b.BottleGnomes.class));
        cards.add(new SetCardInfo("Brushland", 319, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Caves of Koilos", 320, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Chastise", 9, Rarity.UNCOMMON, mage.cards.c.Chastise.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 10, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 11, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Clone", 67, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Coat of Arms", 291, Rarity.RARE, mage.cards.c.CoatOfArms.class));
        cards.add(new SetCardInfo("Coercion", 118, Rarity.COMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Confiscate", 68, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Consume Spirit", 119, Rarity.UNCOMMON, mage.cards.c.ConsumeSpirit.class));
        cards.add(new SetCardInfo("Contaminated Bond", 120, Rarity.COMMON, mage.cards.c.ContaminatedBond.class));
        cards.add(new SetCardInfo("Coral Eel", "S3", Rarity.COMMON, mage.cards.c.CoralEel.class));
        cards.add(new SetCardInfo("Counsel of the Soratami", 69, Rarity.COMMON, mage.cards.c.CounselOfTheSoratami.class));
        cards.add(new SetCardInfo("Cowardice", 70, Rarity.RARE, mage.cards.c.Cowardice.class));
        cards.add(new SetCardInfo("Crafty Pathmage", 71, Rarity.COMMON, mage.cards.c.CraftyPathmage.class));
        cards.add(new SetCardInfo("Craw Wurm", 233, Rarity.COMMON, mage.cards.c.CrawWurm.class));
        cards.add(new SetCardInfo("Creeping Mold", 234, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crossbow Infantry", 12, Rarity.COMMON, mage.cards.c.CrossbowInfantry.class));
        cards.add(new SetCardInfo("Cruel Edict", 121, Rarity.UNCOMMON, mage.cards.c.CruelEdict.class));
        cards.add(new SetCardInfo("Dancing Scimitar", 292, Rarity.UNCOMMON, mage.cards.d.DancingScimitar.class));
        cards.add(new SetCardInfo("Daring Apprentice", 72, Rarity.RARE, mage.cards.d.DaringApprentice.class));
        cards.add(new SetCardInfo("Dark Banishing", 122, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Deathgazer", 124, Rarity.UNCOMMON, mage.cards.d.Deathgazer.class));
        cards.add(new SetCardInfo("Death Pits of Rath", 123, Rarity.RARE, mage.cards.d.DeathPitsOfRath.class));
        cards.add(new SetCardInfo("Defense Grid", 293, Rarity.RARE, mage.cards.d.DefenseGrid.class));
        cards.add(new SetCardInfo("Dehydration", 73, Rarity.COMMON, mage.cards.d.Dehydration.class));
        cards.add(new SetCardInfo("Demolish", 179, Rarity.UNCOMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demon's Horn", 294, Rarity.UNCOMMON, mage.cards.d.DemonsHorn.class));
        cards.add(new SetCardInfo("Demystify", 13, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 125, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Disrupting Scepter", 295, Rarity.RARE, mage.cards.d.DisruptingScepter.class));
        cards.add(new SetCardInfo("Dragon's Claw", 296, Rarity.UNCOMMON, mage.cards.d.DragonsClaw.class));
        cards.add(new SetCardInfo("Dream Prowler", 74, Rarity.UNCOMMON, mage.cards.d.DreamProwler.class));
        cards.add(new SetCardInfo("Drudge Skeletons", 126, Rarity.UNCOMMON, mage.cards.d.DrudgeSkeletons.class));
        cards.add(new SetCardInfo("Eager Cadet", "S1", Rarity.COMMON, mage.cards.e.EagerCadet.class));
        cards.add(new SetCardInfo("Early Harvest", 235, Rarity.RARE, mage.cards.e.EarlyHarvest.class));
        cards.add(new SetCardInfo("Elvish Bard", 236, Rarity.UNCOMMON, mage.cards.e.ElvishBard.class));
        cards.add(new SetCardInfo("Elvish Berserker", 237, Rarity.COMMON, mage.cards.e.ElvishBerserker.class));
        cards.add(new SetCardInfo("Elvish Champion", 238, Rarity.RARE, mage.cards.e.ElvishChampion.class));
        cards.add(new SetCardInfo("Elvish Piper", 239, Rarity.RARE, mage.cards.e.ElvishPiper.class));
        cards.add(new SetCardInfo("Elvish Warrior", 240, Rarity.COMMON, mage.cards.e.ElvishWarrior.class));
        cards.add(new SetCardInfo("Emperor Crocodile", 241, Rarity.RARE, mage.cards.e.EmperorCrocodile.class));
        cards.add(new SetCardInfo("Enfeeblement", 127, Rarity.COMMON, mage.cards.e.Enfeeblement.class));
        cards.add(new SetCardInfo("Enormous Baloth", "S9", Rarity.UNCOMMON, mage.cards.e.EnormousBaloth.class));
        cards.add(new SetCardInfo("Enrage", 180, Rarity.UNCOMMON, mage.cards.e.Enrage.class));
        cards.add(new SetCardInfo("Evacuation", 75, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Execute", 128, Rarity.UNCOMMON, mage.cards.e.Execute.class));
        cards.add(new SetCardInfo("Exhaustion", 76, Rarity.UNCOMMON, mage.cards.e.Exhaustion.class));
        cards.add(new SetCardInfo("Fear", 129, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Fellwar Stone", 297, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Festering Goblin", 130, Rarity.COMMON, mage.cards.f.FesteringGoblin.class));
        cards.add(new SetCardInfo("Final Punishment", 131, Rarity.RARE, mage.cards.f.FinalPunishment.class));
        cards.add(new SetCardInfo("Firebreathing", 181, Rarity.COMMON, mage.cards.f.Firebreathing.class));
        cards.add(new SetCardInfo("Fishliver Oil", 77, Rarity.COMMON, mage.cards.f.FishliverOil.class));
        cards.add(new SetCardInfo("Flame Wave", 182, Rarity.UNCOMMON, mage.cards.f.FlameWave.class));
        cards.add(new SetCardInfo("Flashfires", 183, Rarity.UNCOMMON, mage.cards.f.Flashfires.class));
        cards.add(new SetCardInfo("Fleeting Image", 78, Rarity.RARE, mage.cards.f.FleetingImage.class));
        cards.add(new SetCardInfo("Flight", 79, Rarity.COMMON, mage.cards.f.Flight.class));
        cards.add(new SetCardInfo("Flowstone Crusher", 184, Rarity.UNCOMMON, mage.cards.f.FlowstoneCrusher.class));
        cards.add(new SetCardInfo("Flowstone Shambler", 185, Rarity.COMMON, mage.cards.f.FlowstoneShambler.class));
        cards.add(new SetCardInfo("Flowstone Slide", 186, Rarity.RARE, mage.cards.f.FlowstoneSlide.class));
        cards.add(new SetCardInfo("Foot Soldiers", 14, Rarity.COMMON, mage.cards.f.FootSoldiers.class));
        cards.add(new SetCardInfo("Force of Nature", 242, Rarity.RARE, mage.cards.f.ForceOfNature.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Form of the Dragon", 187, Rarity.RARE, mage.cards.f.FormOfTheDragon.class));
        cards.add(new SetCardInfo("Foul Imp", 132, Rarity.COMMON, mage.cards.f.FoulImp.class));
        cards.add(new SetCardInfo("Fugitive Wizard", 80, Rarity.COMMON, mage.cards.f.FugitiveWizard.class));
        cards.add(new SetCardInfo("Furnace of Rath", 188, Rarity.RARE, mage.cards.f.FurnaceOfRath.class));
        cards.add(new SetCardInfo("Giant Cockroach", 133, Rarity.COMMON, mage.cards.g.GiantCockroach.class));
        cards.add(new SetCardInfo("Giant Growth", 243, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Octopus", "S4", Rarity.COMMON, mage.cards.g.GiantOctopus.class));
        cards.add(new SetCardInfo("Giant Spider", 244, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Gift of Estates", 15, Rarity.UNCOMMON, mage.cards.g.GiftOfEstates.class));
        cards.add(new SetCardInfo("Glorious Anthem", 16, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Glory Seeker", 17, Rarity.COMMON, mage.cards.g.GlorySeeker.class));
        cards.add(new SetCardInfo("Gluttonous Zombie", 134, Rarity.UNCOMMON, mage.cards.g.GluttonousZombie.class));
        cards.add(new SetCardInfo("Goblin Balloon Brigade", 189, Rarity.UNCOMMON, mage.cards.g.GoblinBalloonBrigade.class));
        cards.add(new SetCardInfo("Goblin Brigand", 190, Rarity.COMMON, mage.cards.g.GoblinBrigand.class));
        cards.add(new SetCardInfo("Goblin Chariot", 191, Rarity.COMMON, mage.cards.g.GoblinChariot.class));
        cards.add(new SetCardInfo("Goblin King", 192, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Goblin Mountaineer", 193, Rarity.COMMON, mage.cards.g.GoblinMountaineer.class));
        cards.add(new SetCardInfo("Goblin Piker", 194, Rarity.COMMON, mage.cards.g.GoblinPiker.class));
        cards.add(new SetCardInfo("Goblin Raider", "S8", Rarity.COMMON, mage.cards.g.GoblinRaider.class));
        cards.add(new SetCardInfo("Goblin Sky Raider", 195, Rarity.COMMON, mage.cards.g.GoblinSkyRaider.class));
        cards.add(new SetCardInfo("Gravedigger", 136, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grave Pact", 135, Rarity.RARE, mage.cards.g.GravePact.class));
        cards.add(new SetCardInfo("Greater Good", 245, Rarity.RARE, mage.cards.g.GreaterGood.class));
        cards.add(new SetCardInfo("Grizzly Bears", 246, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Groundskeeper", 247, Rarity.UNCOMMON, mage.cards.g.Groundskeeper.class));
        cards.add(new SetCardInfo("Guerrilla Tactics", 196, Rarity.UNCOMMON, mage.cards.g.GuerrillaTactics.class));
        cards.add(new SetCardInfo("Hell's Caretaker", 137, Rarity.RARE, mage.cards.h.HellsCaretaker.class));
        cards.add(new SetCardInfo("Highway Robber", 138, Rarity.COMMON, mage.cards.h.HighwayRobber.class));
        cards.add(new SetCardInfo("Hill Giant", 197, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Hollow Dogs", 139, Rarity.COMMON, mage.cards.h.HollowDogs.class));
        cards.add(new SetCardInfo("Holy Day", 18, Rarity.COMMON, mage.cards.h.HolyDay.class));
        cards.add(new SetCardInfo("Holy Strength", 19, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Honor Guard", 20, Rarity.COMMON, mage.cards.h.HonorGuard.class));
        cards.add(new SetCardInfo("Horned Turtle", 81, Rarity.COMMON, mage.cards.h.HornedTurtle.class));
        cards.add(new SetCardInfo("Horror of Horrors", 140, Rarity.UNCOMMON, mage.cards.h.HorrorOfHorrors.class));
        cards.add(new SetCardInfo("Howling Mine", 298, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Hunted Wumpus", 248, Rarity.UNCOMMON, mage.cards.h.HuntedWumpus.class));
        cards.add(new SetCardInfo("Hypnotic Specter", 141, Rarity.RARE, mage.cards.h.HypnoticSpecter.class));
        cards.add(new SetCardInfo("Icy Manipulator", 299, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("Imaginary Pet", 82, Rarity.RARE, mage.cards.i.ImaginaryPet.class));
        cards.add(new SetCardInfo("Index", "S5", Rarity.COMMON, mage.cards.i.Index.class));
        cards.add(new SetCardInfo("Infantry Veteran", 21, Rarity.COMMON, mage.cards.i.InfantryVeteran.class));
        cards.add(new SetCardInfo("Inspirit", 22, Rarity.UNCOMMON, mage.cards.i.Inspirit.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivory Mask", 23, Rarity.RARE, mage.cards.i.IvoryMask.class));
        cards.add(new SetCardInfo("Jade Statue", 300, Rarity.RARE, mage.cards.j.JadeStatue.class));
        cards.add(new SetCardInfo("Jester's Cap", 301, Rarity.RARE, mage.cards.j.JestersCap.class));
        cards.add(new SetCardInfo("Kami of Old Stone", 24, Rarity.UNCOMMON, mage.cards.k.KamiOfOldStone.class));
        cards.add(new SetCardInfo("Karplusan Forest", 321, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Karplusan Yeti", 198, Rarity.RARE, mage.cards.k.KarplusanYeti.class));
        cards.add(new SetCardInfo("Kavu Climber", 249, Rarity.COMMON, mage.cards.k.KavuClimber.class));
        cards.add(new SetCardInfo("King Cheetah", 250, Rarity.UNCOMMON, mage.cards.k.KingCheetah.class));
        cards.add(new SetCardInfo("Kird Ape", 199, Rarity.UNCOMMON, mage.cards.k.KirdApe.class));
        cards.add(new SetCardInfo("Kraken's Eye", 302, Rarity.UNCOMMON, mage.cards.k.KrakensEye.class));
        cards.add(new SetCardInfo("Lava Axe", 200, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Leonin Skyhunter", 25, Rarity.UNCOMMON, mage.cards.l.LeoninSkyhunter.class));
        cards.add(new SetCardInfo("Levitation", 83, Rarity.UNCOMMON, mage.cards.l.Levitation.class));
        cards.add(new SetCardInfo("Ley Druid", 251, Rarity.UNCOMMON, mage.cards.l.LeyDruid.class));
        cards.add(new SetCardInfo("Lightning Elemental", 201, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Llanowar Behemoth", 252, Rarity.UNCOMMON, mage.cards.l.LlanowarBehemoth.class));
        cards.add(new SetCardInfo("Llanowar Elves", 253, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 322, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Looming Shade", 142, Rarity.COMMON, mage.cards.l.LoomingShade.class));
        cards.add(new SetCardInfo("Lord of the Undead", 143, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Loxodon Warhammer", 303, Rarity.RARE, mage.cards.l.LoxodonWarhammer.class));
        cards.add(new SetCardInfo("Lumengrid Warden", 84, Rarity.COMMON, mage.cards.l.LumengridWarden.class));
        cards.add(new SetCardInfo("Magnivore", 202, Rarity.RARE, mage.cards.m.Magnivore.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 85, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Mana Clash", 203, Rarity.RARE, mage.cards.m.ManaClash.class));
        cards.add(new SetCardInfo("Mana Leak", 86, Rarity.COMMON, mage.cards.m.ManaLeak.class));
        cards.add(new SetCardInfo("Marble Titan", 26, Rarity.RARE, mage.cards.m.MarbleTitan.class));
        cards.add(new SetCardInfo("Maro", 254, Rarity.RARE, mage.cards.m.Maro.class));
        cards.add(new SetCardInfo("Master Decoy", 27, Rarity.COMMON, mage.cards.m.MasterDecoy.class));
        cards.add(new SetCardInfo("Master Healer", 28, Rarity.RARE, mage.cards.m.MasterHealer.class));
        cards.add(new SetCardInfo("Megrim", 144, Rarity.UNCOMMON, mage.cards.m.Megrim.class));
        cards.add(new SetCardInfo("Mending Hands", 29, Rarity.COMMON, mage.cards.m.MendingHands.class));
        cards.add(new SetCardInfo("Might of Oaks", 255, Rarity.RARE, mage.cards.m.MightOfOaks.class));
        cards.add(new SetCardInfo("Millstone", 304, Rarity.RARE, mage.cards.m.Millstone.class));
        cards.add(new SetCardInfo("Mind Rot", 145, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mindslicer", 146, Rarity.RARE, mage.cards.m.Mindslicer.class));
        cards.add(new SetCardInfo("Mogg Sentry", 204, Rarity.RARE, mage.cards.m.MoggSentry.class));
        cards.add(new SetCardInfo("Mortivore", 147, Rarity.RARE, mage.cards.m.Mortivore.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nantuko Husk", 148, Rarity.UNCOMMON, mage.cards.n.NantukoHusk.class));
        cards.add(new SetCardInfo("Natural Affinity", 256, Rarity.RARE, mage.cards.n.NaturalAffinity.class));
        cards.add(new SetCardInfo("Naturalize", 258, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Natural Spring", 257, Rarity.COMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Needle Storm", 259, Rarity.UNCOMMON, mage.cards.n.NeedleStorm.class));
        cards.add(new SetCardInfo("Nekrataal", 149, Rarity.UNCOMMON, mage.cards.n.Nekrataal.class));
        cards.add(new SetCardInfo("Nightmare", 150, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Norwood Ranger", 260, Rarity.COMMON, mage.cards.n.NorwoodRanger.class));
        cards.add(new SetCardInfo("Ogre Taskmaster", 205, Rarity.UNCOMMON, mage.cards.o.OgreTaskmaster.class));
        cards.add(new SetCardInfo("Oracle's Attendants", 30, Rarity.RARE, mage.cards.o.OraclesAttendants.class));
        cards.add(new SetCardInfo("Orcish Artillery", 206, Rarity.UNCOMMON, mage.cards.o.OrcishArtillery.class));
        cards.add(new SetCardInfo("Order of the Sacred Bell", 261, Rarity.COMMON, mage.cards.o.OrderOfTheSacredBell.class));
        cards.add(new SetCardInfo("Ornithopter", 305, Rarity.UNCOMMON, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Overgrowth", 262, Rarity.COMMON, mage.cards.o.Overgrowth.class));
        cards.add(new SetCardInfo("Pacifism", 31, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Paladin en-Vec", 32, Rarity.RARE, mage.cards.p.PaladinEnVec.class));
        cards.add(new SetCardInfo("Panic Attack", 207, Rarity.COMMON, mage.cards.p.PanicAttack.class));
        cards.add(new SetCardInfo("Peace of Mind", 33, Rarity.UNCOMMON, mage.cards.p.PeaceOfMind.class));
        cards.add(new SetCardInfo("Pegasus Charger", 34, Rarity.COMMON, mage.cards.p.PegasusCharger.class));
        cards.add(new SetCardInfo("Persecute", 151, Rarity.RARE, mage.cards.p.Persecute.class));
        cards.add(new SetCardInfo("Phantom Warrior", 88, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Phyrexian Arena", 152, Rarity.RARE, mage.cards.p.PhyrexianArena.class));
        cards.add(new SetCardInfo("Phyrexian Gargantua", 153, Rarity.UNCOMMON, mage.cards.p.PhyrexianGargantua.class));
        cards.add(new SetCardInfo("Phyrexian Hulk", 306, Rarity.UNCOMMON, mage.cards.p.PhyrexianHulk.class));
        cards.add(new SetCardInfo("Plagiarize", 89, Rarity.RARE, mage.cards.p.Plagiarize.class));
        cards.add(new SetCardInfo("Plague Beetle", 154, Rarity.COMMON, mage.cards.p.PlagueBeetle.class));
        cards.add(new SetCardInfo("Plague Wind", 155, Rarity.RARE, mage.cards.p.PlagueWind.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polymorph", 90, Rarity.RARE, mage.cards.p.Polymorph.class));
        cards.add(new SetCardInfo("Puppeteer", 91, Rarity.UNCOMMON, mage.cards.p.Puppeteer.class));
        cards.add(new SetCardInfo("Pyroclasm", 208, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Quicksand", 323, Rarity.UNCOMMON, mage.cards.q.Quicksand.class));
        cards.add(new SetCardInfo("Raging Goblin", 209, Rarity.COMMON, mage.cards.r.RagingGoblin.class));
        cards.add(new SetCardInfo("Raise Dead", 156, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Rampant Growth", 263, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rathi Dragon", 210, Rarity.RARE, mage.cards.r.RathiDragon.class));
        cards.add(new SetCardInfo("Ravenous Rats", 157, Rarity.COMMON, mage.cards.r.RavenousRats.class));
        cards.add(new SetCardInfo("Razortooth Rats", 158, Rarity.COMMON, mage.cards.r.RazortoothRats.class));
        cards.add(new SetCardInfo("Reclaim", 264, Rarity.COMMON, mage.cards.r.Reclaim.class));
        cards.add(new SetCardInfo("Reflexes", 211, Rarity.COMMON, mage.cards.r.Reflexes.class));
        cards.add(new SetCardInfo("Regeneration", 265, Rarity.UNCOMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Relentless Assault", 212, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Reminisce", 92, Rarity.UNCOMMON, mage.cards.r.Reminisce.class));
        cards.add(new SetCardInfo("Remove Soul", 93, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Reverse Damage", 35, Rarity.RARE, mage.cards.r.ReverseDamage.class));
        cards.add(new SetCardInfo("Rewind", 94, Rarity.UNCOMMON, mage.cards.r.Rewind.class));
        cards.add(new SetCardInfo("Righteousness", 36, Rarity.RARE, mage.cards.r.Righteousness.class));
        cards.add(new SetCardInfo("River Bear", 266, Rarity.UNCOMMON, mage.cards.r.RiverBear.class));
        cards.add(new SetCardInfo("Rod of Ruin", 307, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Rogue Kavu", 213, Rarity.COMMON, mage.cards.r.RogueKavu.class));
        cards.add(new SetCardInfo("Rootbreaker Wurm", 267, Rarity.UNCOMMON, mage.cards.r.RootbreakerWurm.class));
        cards.add(new SetCardInfo("Rootwalla", 268, Rarity.COMMON, mage.cards.r.Rootwalla.class));
        cards.add(new SetCardInfo("Royal Assassin", 159, Rarity.RARE, mage.cards.r.RoyalAssassin.class));
        cards.add(new SetCardInfo("Rukh Egg", 214, Rarity.RARE, mage.cards.r.RukhEgg.class));
        cards.add(new SetCardInfo("Sacred Ground", 37, Rarity.RARE, mage.cards.s.SacredGround.class));
        cards.add(new SetCardInfo("Sacred Nectar", 38, Rarity.COMMON, mage.cards.s.SacredNectar.class));
        cards.add(new SetCardInfo("Sage Aven", 95, Rarity.COMMON, mage.cards.s.SageAven.class));
        cards.add(new SetCardInfo("Samite Healer", 39, Rarity.COMMON, mage.cards.s.SamiteHealer.class));
        cards.add(new SetCardInfo("Sanctum Guardian", 40, Rarity.UNCOMMON, mage.cards.s.SanctumGuardian.class));
        cards.add(new SetCardInfo("Sandstone Warrior", 215, Rarity.COMMON, mage.cards.s.SandstoneWarrior.class));
        cards.add(new SetCardInfo("Savannah Lions", 41, Rarity.RARE, mage.cards.s.SavannahLions.class));
        cards.add(new SetCardInfo("Scaled Wurm", 269, Rarity.COMMON, mage.cards.s.ScaledWurm.class));
        cards.add(new SetCardInfo("Scathe Zombies", 160, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Sea Monster", 96, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Sea's Claim", 97, Rarity.COMMON, mage.cards.s.SeasClaim.class));
        cards.add(new SetCardInfo("Seasoned Marshal", 42, Rarity.UNCOMMON, mage.cards.s.SeasonedMarshal.class));
        cards.add(new SetCardInfo("Seedborn Muse", 270, Rarity.RARE, mage.cards.s.SeedbornMuse.class));
        cards.add(new SetCardInfo("Seething Song", 216, Rarity.COMMON, mage.cards.s.SeethingSong.class));
        cards.add(new SetCardInfo("Sengir Vampire", 161, Rarity.RARE, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Serpent Warrior", 162, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Serra Angel", 43, Rarity.RARE, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Serra's Blessing", 44, Rarity.UNCOMMON, mage.cards.s.SerrasBlessing.class));
        cards.add(new SetCardInfo("Shard Phoenix", 217, Rarity.RARE, mage.cards.s.ShardPhoenix.class));
        cards.add(new SetCardInfo("Shatter", 218, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shivan Dragon", 219, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shivan Reef", 324, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shock", 220, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Sift", 98, Rarity.COMMON, mage.cards.s.Sift.class));
        cards.add(new SetCardInfo("Silklash Spider", 271, Rarity.RARE, mage.cards.s.SilklashSpider.class));
        cards.add(new SetCardInfo("Skyhunter Prowler", 45, Rarity.COMMON, mage.cards.s.SkyhunterProwler.class));
        cards.add(new SetCardInfo("Slate of Ancestry", 308, Rarity.RARE, mage.cards.s.SlateOfAncestry.class));
        cards.add(new SetCardInfo("Slay", 163, Rarity.UNCOMMON, mage.cards.s.Slay.class));
        cards.add(new SetCardInfo("Sleight of Hand", 99, Rarity.COMMON, mage.cards.s.SleightOfHand.class));
        cards.add(new SetCardInfo("Soul Feast", 164, Rarity.UNCOMMON, mage.cards.s.SoulFeast.class));
        cards.add(new SetCardInfo("Soul Warden", 46, Rarity.UNCOMMON, mage.cards.s.SoulWarden.class));
        cards.add(new SetCardInfo("Spellbook", 309, Rarity.UNCOMMON, mage.cards.s.Spellbook.class));
        cards.add(new SetCardInfo("Spined Wurm", "S10", Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spineless Thug", 165, Rarity.COMMON, mage.cards.s.SpinelessThug.class));
        cards.add(new SetCardInfo("Spirit Link", 47, Rarity.UNCOMMON, mage.cards.s.SpiritLink.class));
        cards.add(new SetCardInfo("Stone Rain", 221, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storage Matrix", 310, Rarity.RARE, mage.cards.s.StorageMatrix.class));
        cards.add(new SetCardInfo("Storm Crow", 100, Rarity.COMMON, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Story Circle", 48, Rarity.RARE, mage.cards.s.StoryCircle.class));
        cards.add(new SetCardInfo("Stream of Life", 272, Rarity.UNCOMMON, mage.cards.s.StreamOfLife.class));
        cards.add(new SetCardInfo("Sudden Impact", 222, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 325, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Summer Bloom", 273, Rarity.UNCOMMON, mage.cards.s.SummerBloom.class));
        cards.add(new SetCardInfo("Suntail Hawk", 49, Rarity.COMMON, mage.cards.s.SuntailHawk.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swarm of Rats", 166, Rarity.UNCOMMON, mage.cards.s.SwarmOfRats.class));
        cards.add(new SetCardInfo("Tanglebloom", 311, Rarity.UNCOMMON, mage.cards.t.Tanglebloom.class));
        cards.add(new SetCardInfo("Teferi's Puzzle Box", 312, Rarity.RARE, mage.cards.t.TeferisPuzzleBox.class));
        cards.add(new SetCardInfo("Telepathy", 101, Rarity.UNCOMMON, mage.cards.t.Telepathy.class));
        cards.add(new SetCardInfo("Tempest of Light", 50, Rarity.UNCOMMON, mage.cards.t.TempestOfLight.class));
        cards.add(new SetCardInfo("Temporal Adept", 102, Rarity.RARE, mage.cards.t.TemporalAdept.class));
        cards.add(new SetCardInfo("Thieving Magpie", 103, Rarity.UNCOMMON, mage.cards.t.ThievingMagpie.class));
        cards.add(new SetCardInfo("Thought Courier", 104, Rarity.UNCOMMON, mage.cards.t.ThoughtCourier.class));
        cards.add(new SetCardInfo("Thran Golem", 313, Rarity.RARE, mage.cards.t.ThranGolem.class));
        cards.add(new SetCardInfo("Threaten", 223, Rarity.UNCOMMON, mage.cards.t.Threaten.class));
        cards.add(new SetCardInfo("Thundermare", 224, Rarity.RARE, mage.cards.t.Thundermare.class));
        cards.add(new SetCardInfo("Tidal Kraken", 105, Rarity.RARE, mage.cards.t.TidalKraken.class));
        cards.add(new SetCardInfo("Tidings", 106, Rarity.UNCOMMON, mage.cards.t.Tidings.class));
        cards.add(new SetCardInfo("Time Ebb", 107, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Trade Routes", 108, Rarity.RARE, mage.cards.t.TradeRoutes.class));
        cards.add(new SetCardInfo("Trained Armodon", 274, Rarity.COMMON, mage.cards.t.TrainedArmodon.class));
        cards.add(new SetCardInfo("Traumatize", 109, Rarity.RARE, mage.cards.t.Traumatize.class));
        cards.add(new SetCardInfo("Treasure Trove", 110, Rarity.UNCOMMON, mage.cards.t.TreasureTrove.class));
        cards.add(new SetCardInfo("Tree Monkey", 275, Rarity.COMMON, mage.cards.t.TreeMonkey.class));
        cards.add(new SetCardInfo("Treetop Bracers", 276, Rarity.COMMON, mage.cards.t.TreetopBracers.class));
        cards.add(new SetCardInfo("Underground River", 326, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Underworld Dreams", 167, Rarity.RARE, mage.cards.u.UnderworldDreams.class));
        cards.add(new SetCardInfo("Unholy Strength", 168, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Ur-Golem's Eye", 314, Rarity.UNCOMMON, mage.cards.u.UrGolemsEye.class));
        cards.add(new SetCardInfo("Urza's Mine", 327, Rarity.UNCOMMON, mage.cards.u.UrzasMine.class));
        cards.add(new SetCardInfo("Urza's Power Plant", 328, Rarity.UNCOMMON, mage.cards.u.UrzasPowerPlant.class));
        cards.add(new SetCardInfo("Urza's Tower", 329, Rarity.UNCOMMON, mage.cards.u.UrzasTower.class));
        cards.add(new SetCardInfo("Utopia Tree", 277, Rarity.RARE, mage.cards.u.UtopiaTree.class));
        cards.add(new SetCardInfo("Venerable Monk", 51, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Vengeance", "S2", Rarity.UNCOMMON, mage.cards.v.Vengeance.class));
        cards.add(new SetCardInfo("Verdant Force", 278, Rarity.RARE, mage.cards.v.VerdantForce.class));
        cards.add(new SetCardInfo("Verduran Enchantress", 279, Rarity.RARE, mage.cards.v.VerduranEnchantress.class));
        cards.add(new SetCardInfo("Veteran Cavalier", 52, Rarity.COMMON, mage.cards.v.VeteranCavalier.class));
        cards.add(new SetCardInfo("Viashino Sandstalker", 225, Rarity.UNCOMMON, mage.cards.v.ViashinoSandstalker.class));
        cards.add(new SetCardInfo("Viridian Shaman", 280, Rarity.UNCOMMON, mage.cards.v.ViridianShaman.class));
        cards.add(new SetCardInfo("Vizzerdrix", "S7", Rarity.RARE, mage.cards.v.Vizzerdrix.class));
        cards.add(new SetCardInfo("Volcanic Hammer", 226, Rarity.COMMON, mage.cards.v.VolcanicHammer.class));
        cards.add(new SetCardInfo("Vulshok Morningstar", 315, Rarity.UNCOMMON, mage.cards.v.VulshokMorningstar.class));
        cards.add(new SetCardInfo("Wanderguard Sentry", 111, Rarity.COMMON, mage.cards.w.WanderguardSentry.class));
        cards.add(new SetCardInfo("Warrior's Honor", 53, Rarity.COMMON, mage.cards.w.WarriorsHonor.class));
        cards.add(new SetCardInfo("Weathered Wayfarer", 54, Rarity.RARE, mage.cards.w.WeatheredWayfarer.class));
        cards.add(new SetCardInfo("Web", 281, Rarity.UNCOMMON, mage.cards.w.Web.class));
        cards.add(new SetCardInfo("Weird Harvest", 282, Rarity.RARE, mage.cards.w.WeirdHarvest.class));
        cards.add(new SetCardInfo("Whip Sergeant", 227, Rarity.UNCOMMON, mage.cards.w.WhipSergeant.class));
        cards.add(new SetCardInfo("Wildfire", 228, Rarity.RARE, mage.cards.w.Wildfire.class));
        cards.add(new SetCardInfo("Will-o'-the-Wisp", 169, Rarity.RARE, mage.cards.w.WillOTheWisp.class));
        cards.add(new SetCardInfo("Wind Drake", 112, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Withering Gaze", 113, Rarity.UNCOMMON, mage.cards.w.WitheringGaze.class));
        cards.add(new SetCardInfo("Wood Elves", 283, Rarity.COMMON, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Worship", 55, Rarity.RARE, mage.cards.w.Worship.class));
        cards.add(new SetCardInfo("Wrath of God", 56, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Wurm's Tooth", 316, Rarity.UNCOMMON, mage.cards.w.WurmsTooth.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 330, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", 284, Rarity.UNCOMMON, mage.cards.y.YavimayaEnchantress.class));
        cards.add(new SetCardInfo("Yawgmoth Demon", 170, Rarity.RARE, mage.cards.y.YawgmothDemon.class));
        cards.add(new SetCardInfo("Zealous Inquisitor", 57, Rarity.UNCOMMON, mage.cards.z.ZealousInquisitor.class));
        cards.add(new SetCardInfo("Zodiac Monkey", 285, Rarity.COMMON, mage.cards.z.ZodiacMonkey.class));
        cards.add(new SetCardInfo("Zombify", 171, Rarity.UNCOMMON, mage.cards.z.Zombify.class));
        cards.add(new SetCardInfo("Zur's Weirding", 114, Rarity.RARE, mage.cards.z.ZursWeirding.class));
    }

    @Override
    protected List<CardInfo> findCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findCardsByRarity(rarity);
        // card numbers containing S are Starter Set cards not found in boosters
        cardInfos.removeIf(cardInfo -> cardInfo.getCardNumber().contains("S"));
        return cardInfos;
    }
}
