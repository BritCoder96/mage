
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public final class Visions extends ExpansionSet {

    private static final Visions instance = new Visions();

    public static Visions getInstance() {
        return instance;
    }

    private Visions() {
        super("Visions", "VIS", ExpansionSet.buildDate(1997, 1, 11), SetType.EXPANSION);
        this.blockName = "Mirage";
        this.parentSet = Mirage.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aku Djinn", 51, Rarity.RARE, mage.cards.a.AkuDjinn.class));
        cards.add(new SetCardInfo("Anvil of Bogardan", 141, Rarity.RARE, mage.cards.a.AnvilOfBogardan.class));
        cards.add(new SetCardInfo("Archangel", 1, Rarity.RARE, mage.cards.a.Archangel.class));
        cards.add(new SetCardInfo("Army Ants", 126, Rarity.UNCOMMON, mage.cards.a.ArmyAnts.class));
        cards.add(new SetCardInfo("Betrayal", 26, Rarity.COMMON, mage.cards.b.Betrayal.class));
        cards.add(new SetCardInfo("Blanket of Night", 52, Rarity.UNCOMMON, mage.cards.b.BlanketOfNight.class));
        cards.add(new SetCardInfo("Brass-Talon Chimera", 142, Rarity.UNCOMMON, mage.cards.b.BrassTalonChimera.class));
        cards.add(new SetCardInfo("Breathstealer's Crypt", 127, Rarity.RARE, mage.cards.b.BreathstealersCrypt.class));
        cards.add(new SetCardInfo("Breezekeeper", 27, Rarity.COMMON, mage.cards.b.Breezekeeper.class));
        cards.add(new SetCardInfo("Brood of Cockroaches", 53, Rarity.UNCOMMON, mage.cards.b.BroodOfCockroaches.class));
        cards.add(new SetCardInfo("Bull Elephant", 101, Rarity.COMMON, mage.cards.b.BullElephant.class));
        cards.add(new SetCardInfo("Chronatog", 28, Rarity.RARE, mage.cards.c.Chronatog.class));
        cards.add(new SetCardInfo("City of Solitude", 102, Rarity.RARE, mage.cards.c.CityOfSolitude.class));
        cards.add(new SetCardInfo("Cloud Elemental", 29, Rarity.COMMON, mage.cards.c.CloudElemental.class));
        cards.add(new SetCardInfo("Coercion", 54, Rarity.COMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Coral Atoll", 160, Rarity.UNCOMMON, mage.cards.c.CoralAtoll.class));
        cards.add(new SetCardInfo("Corrosion", 128, Rarity.RARE, mage.cards.c.Corrosion.class));
        cards.add(new SetCardInfo("Creeping Mold", 103, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crypt Rats", 55, Rarity.COMMON, mage.cards.c.CryptRats.class));
        cards.add(new SetCardInfo("Daraja Griffin", 2, Rarity.UNCOMMON, mage.cards.d.DarajaGriffin.class));
        cards.add(new SetCardInfo("Dark Privilege", 56, Rarity.COMMON, mage.cards.d.DarkPrivilege.class));
        cards.add(new SetCardInfo("Death Watch", 57, Rarity.COMMON, mage.cards.d.DeathWatch.class));
        cards.add(new SetCardInfo("Desertion", 30, Rarity.RARE, mage.cards.d.Desertion.class));
        cards.add(new SetCardInfo("Desolation", 58, Rarity.UNCOMMON, mage.cards.d.Desolation.class));
        cards.add(new SetCardInfo("Diamond Kaleidoscope", 143, Rarity.RARE, mage.cards.d.DiamondKaleidoscope.class));
        cards.add(new SetCardInfo("Dormant Volcano", 161, Rarity.UNCOMMON, mage.cards.d.DormantVolcano.class));
        cards.add(new SetCardInfo("Dragon Mask", 144, Rarity.UNCOMMON, mage.cards.d.DragonMask.class));
        cards.add(new SetCardInfo("Dream Tides", 31, Rarity.UNCOMMON, mage.cards.d.DreamTides.class));
        cards.add(new SetCardInfo("Dwarven Vigilantes", 77, Rarity.COMMON, mage.cards.d.DwarvenVigilantes.class));
        cards.add(new SetCardInfo("Elephant Grass", 104, Rarity.UNCOMMON, mage.cards.e.ElephantGrass.class));
        cards.add(new SetCardInfo("Elkin Lair", 78, Rarity.RARE, mage.cards.e.ElkinLair.class));
        cards.add(new SetCardInfo("Elven Cache", 105, Rarity.COMMON, mage.cards.e.ElvenCache.class));
        cards.add(new SetCardInfo("Emerald Charm", 106, Rarity.COMMON, mage.cards.e.EmeraldCharm.class));
        cards.add(new SetCardInfo("Equipoise", 3, Rarity.RARE, mage.cards.e.Equipoise.class));
        cards.add(new SetCardInfo("Everglades", 162, Rarity.UNCOMMON, mage.cards.e.Everglades.class));
        cards.add(new SetCardInfo("Eye of Singularity", 4, Rarity.RARE, mage.cards.e.EyeOfSingularity.class));
        cards.add(new SetCardInfo("Fallen Askari", 59, Rarity.COMMON, mage.cards.f.FallenAskari.class));
        cards.add(new SetCardInfo("Femeref Enchantress", 129, Rarity.RARE, mage.cards.f.FemerefEnchantress.class));
        cards.add(new SetCardInfo("Feral Instinct", 107, Rarity.COMMON, mage.cards.f.FeralInstinct.class));
        cards.add(new SetCardInfo("Fireblast", 79, Rarity.COMMON, mage.cards.f.Fireblast.class));
        cards.add(new SetCardInfo("Firestorm Hellkite", 130, Rarity.RARE, mage.cards.f.FirestormHellkite.class));
        cards.add(new SetCardInfo("Flooded Shoreline", 32, Rarity.RARE, mage.cards.f.FloodedShoreline.class));
        cards.add(new SetCardInfo("Foreshadow", 33, Rarity.UNCOMMON, mage.cards.f.Foreshadow.class));
        cards.add(new SetCardInfo("Freewind Falcon", 5, Rarity.COMMON, mage.cards.f.FreewindFalcon.class));
        cards.add(new SetCardInfo("Funeral Charm", 61, Rarity.COMMON, mage.cards.f.FuneralCharm.class));
        cards.add(new SetCardInfo("Giant Caterpillar", 108, Rarity.COMMON, mage.cards.g.GiantCaterpillar.class));
        cards.add(new SetCardInfo("Goblin Recruiter", 80, Rarity.UNCOMMON, mage.cards.g.GoblinRecruiter.class));
        cards.add(new SetCardInfo("Goblin Swine-Rider", 81, Rarity.COMMON, mage.cards.g.GoblinSwineRider.class));
        cards.add(new SetCardInfo("Gossamer Chains", 6, Rarity.COMMON, mage.cards.g.GossamerChains.class));
        cards.add(new SetCardInfo("Griffin Canyon", 163, Rarity.RARE, mage.cards.g.GriffinCanyon.class));
        cards.add(new SetCardInfo("Hearth Charm", 82, Rarity.COMMON, mage.cards.h.HearthCharm.class));
        cards.add(new SetCardInfo("Helm of Awakening", 145, Rarity.UNCOMMON, mage.cards.h.HelmOfAwakening.class));
        cards.add(new SetCardInfo("Honorable Passage", 7, Rarity.UNCOMMON, mage.cards.h.HonorablePassage.class));
        cards.add(new SetCardInfo("Hope Charm", 8, Rarity.COMMON, mage.cards.h.HopeCharm.class));
        cards.add(new SetCardInfo("Hulking Cyclops", 84, Rarity.UNCOMMON, mage.cards.h.HulkingCyclops.class));
        cards.add(new SetCardInfo("Impulse", 34, Rarity.COMMON, mage.cards.i.Impulse.class));
        cards.add(new SetCardInfo("Infantry Veteran", 9, Rarity.COMMON, mage.cards.i.InfantryVeteran.class));
        cards.add(new SetCardInfo("Inspiration", 35, Rarity.COMMON, mage.cards.i.Inspiration.class));
        cards.add(new SetCardInfo("Iron-Heart Chimera", 146, Rarity.UNCOMMON, mage.cards.i.IronHeartChimera.class));
        cards.add(new SetCardInfo("Jamuraan Lion", 10, Rarity.COMMON, mage.cards.j.JamuraanLion.class));
        cards.add(new SetCardInfo("Juju Bubble", 147, Rarity.UNCOMMON, mage.cards.j.JujuBubble.class));
        cards.add(new SetCardInfo("Jungle Basin", 164, Rarity.UNCOMMON, mage.cards.j.JungleBasin.class));
        cards.add(new SetCardInfo("Kaervek's Spite", 63, Rarity.RARE, mage.cards.k.KaerveksSpite.class));
        cards.add(new SetCardInfo("Karoo", 165, Rarity.UNCOMMON, mage.cards.k.Karoo.class));
        cards.add(new SetCardInfo("Katabatic Winds", 109, Rarity.RARE, mage.cards.k.KatabaticWinds.class));
        cards.add(new SetCardInfo("Keeper of Kookus", 85, Rarity.COMMON, mage.cards.k.KeeperOfKookus.class));
        cards.add(new SetCardInfo("King Cheetah", 110, Rarity.COMMON, mage.cards.k.KingCheetah.class));
        cards.add(new SetCardInfo("Knight of the Mists", 36, Rarity.COMMON, mage.cards.k.KnightOfTheMists.class));
        cards.add(new SetCardInfo("Knight of Valor", 11, Rarity.COMMON, mage.cards.k.KnightOfValor.class));
        cards.add(new SetCardInfo("Kookus", 86, Rarity.RARE, mage.cards.k.Kookus.class));
        cards.add(new SetCardInfo("Lead-Belly Chimera", 148, Rarity.UNCOMMON, mage.cards.l.LeadBellyChimera.class));
        cards.add(new SetCardInfo("Lichenthrope", 112, Rarity.RARE, mage.cards.l.Lichenthrope.class));
        cards.add(new SetCardInfo("Lightning Cloud", 87, Rarity.RARE, mage.cards.l.LightningCloud.class));
        cards.add(new SetCardInfo("Longbow Archer", 12, Rarity.UNCOMMON, mage.cards.l.LongbowArcher.class));
        cards.add(new SetCardInfo("Magma Mine", 149, Rarity.UNCOMMON, mage.cards.m.MagmaMine.class));
        cards.add(new SetCardInfo("Man-o'-War", 37, Rarity.COMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Miraculous Recovery", 13, Rarity.UNCOMMON, mage.cards.m.MiraculousRecovery.class));
        cards.add(new SetCardInfo("Mortal Wound", 113, Rarity.COMMON, mage.cards.m.MortalWound.class));
        cards.add(new SetCardInfo("Mundungu", 132, Rarity.UNCOMMON, mage.cards.m.Mundungu.class));
        cards.add(new SetCardInfo("Mystic Veil", 38, Rarity.COMMON, mage.cards.m.MysticVeil.class));
        cards.add(new SetCardInfo("Natural Order", 114, Rarity.RARE, mage.cards.n.NaturalOrder.class));
        cards.add(new SetCardInfo("Necromancy", 64, Rarity.UNCOMMON, mage.cards.n.Necromancy.class));
        cards.add(new SetCardInfo("Necrosavant", 65, Rarity.RARE, mage.cards.n.Necrosavant.class));
        cards.add(new SetCardInfo("Nekrataal", 66, Rarity.UNCOMMON, mage.cards.n.Nekrataal.class));
        cards.add(new SetCardInfo("Ovinomancer", 39, Rarity.UNCOMMON, mage.cards.o.Ovinomancer.class));
        cards.add(new SetCardInfo("Panther Warriors", 115, Rarity.COMMON, mage.cards.p.PantherWarriors.class));
        cards.add(new SetCardInfo("Parapet", 14, Rarity.COMMON, mage.cards.p.Parapet.class));
        cards.add(new SetCardInfo("Phyrexian Marauder", 151, Rarity.RARE, mage.cards.p.PhyrexianMarauder.class));
        cards.add(new SetCardInfo("Phyrexian Walker", 152, Rarity.COMMON, mage.cards.p.PhyrexianWalker.class));
        cards.add(new SetCardInfo("Prosperity", 40, Rarity.UNCOMMON, mage.cards.p.Prosperity.class));
        cards.add(new SetCardInfo("Python", 68, Rarity.COMMON, mage.cards.p.Python.class));
        cards.add(new SetCardInfo("Quicksand", 166, Rarity.UNCOMMON, mage.cards.q.Quicksand.class));
        cards.add(new SetCardInfo("Quirion Ranger", 117, Rarity.COMMON, mage.cards.q.QuirionRanger.class));
        cards.add(new SetCardInfo("Raging Gorilla", 90, Rarity.COMMON, mage.cards.r.RagingGorilla.class));
        cards.add(new SetCardInfo("Rainbow Efreet", 41, Rarity.RARE, mage.cards.r.RainbowEfreet.class));
        cards.add(new SetCardInfo("Relentless Assault", 91, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Relic Ward", 16, Rarity.UNCOMMON, mage.cards.r.RelicWard.class));
        cards.add(new SetCardInfo("Remedy", 17, Rarity.COMMON, mage.cards.r.Remedy.class));
        cards.add(new SetCardInfo("Resistance Fighter", 18, Rarity.COMMON, mage.cards.r.ResistanceFighter.class));
        cards.add(new SetCardInfo("Retribution of the Meek", 19, Rarity.RARE, mage.cards.r.RetributionOfTheMeek.class));
        cards.add(new SetCardInfo("Righteous Aura", 20, Rarity.COMMON, mage.cards.r.RighteousAura.class));
        cards.add(new SetCardInfo("Righteous War", 134, Rarity.RARE, mage.cards.r.RighteousWar.class));
        cards.add(new SetCardInfo("River Boa", 118, Rarity.COMMON, mage.cards.r.RiverBoa.class));
        cards.add(new SetCardInfo("Rock Slide", 92, Rarity.COMMON, mage.cards.r.RockSlide.class));
        cards.add(new SetCardInfo("Rowen", 119, Rarity.RARE, mage.cards.r.Rowen.class));
        cards.add(new SetCardInfo("Sands of Time", 153, Rarity.RARE, mage.cards.s.SandsOfTime.class));
        cards.add(new SetCardInfo("Scalebane's Elite", 135, Rarity.UNCOMMON, mage.cards.s.ScalebanesElite.class));
        cards.add(new SetCardInfo("Shimmering Efreet", 42, Rarity.UNCOMMON, mage.cards.s.ShimmeringEfreet.class));
        cards.add(new SetCardInfo("Shrieking Drake", 43, Rarity.COMMON, mage.cards.s.ShriekingDrake.class));
        cards.add(new SetCardInfo("Simoon", 136, Rarity.UNCOMMON, mage.cards.s.Simoon.class));
        cards.add(new SetCardInfo("Sisay's Ring", 154, Rarity.COMMON, mage.cards.s.SisaysRing.class));
        cards.add(new SetCardInfo("Snake Basket", 155, Rarity.RARE, mage.cards.s.SnakeBasket.class));
        cards.add(new SetCardInfo("Solfatara", 93, Rarity.COMMON, mage.cards.s.Solfatara.class));
        cards.add(new SetCardInfo("Song of Blood", 94, Rarity.COMMON, mage.cards.s.SongOfBlood.class));
        cards.add(new SetCardInfo("Spider Climb", 120, Rarity.COMMON, mage.cards.s.SpiderClimb.class));
        cards.add(new SetCardInfo("Spitting Drake", 95, Rarity.UNCOMMON, mage.cards.s.SpittingDrake.class));
        cards.add(new SetCardInfo("Squandered Resources", 137, Rarity.RARE, mage.cards.s.SquanderedResources.class));
        cards.add(new SetCardInfo("Stampeding Wildebeests", 121, Rarity.UNCOMMON, mage.cards.s.StampedingWildebeests.class));
        cards.add(new SetCardInfo("Suleiman's Legacy", 138, Rarity.RARE, mage.cards.s.SuleimansLegacy.class));
        cards.add(new SetCardInfo("Summer Bloom", 122, Rarity.UNCOMMON, mage.cards.s.SummerBloom.class));
        cards.add(new SetCardInfo("Sun Clasp", 21, Rarity.COMMON, mage.cards.s.SunClasp.class));
        cards.add(new SetCardInfo("Suq'Ata Assassin", 69, Rarity.UNCOMMON, mage.cards.s.SuqAtaAssassin.class));
        cards.add(new SetCardInfo("Suq'Ata Lancer", 96, Rarity.COMMON, mage.cards.s.SuqAtaLancer.class));
        cards.add(new SetCardInfo("Talruum Champion", 97, Rarity.COMMON, mage.cards.t.TalruumChampion.class));
        cards.add(new SetCardInfo("Talruum Piper", 98, Rarity.UNCOMMON, mage.cards.t.TalruumPiper.class));
        cards.add(new SetCardInfo("Tar Pit Warrior", 70, Rarity.COMMON, mage.cards.t.TarPitWarrior.class));
        cards.add(new SetCardInfo("Teferi's Honor Guard", 22, Rarity.UNCOMMON, mage.cards.t.TeferisHonorGuard.class));
        cards.add(new SetCardInfo("Teferi's Puzzle Box", 156, Rarity.RARE, mage.cards.t.TeferisPuzzleBox.class));
        cards.add(new SetCardInfo("Teferi's Realm", 44, Rarity.RARE, mage.cards.t.TeferisRealm.class));
        cards.add(new SetCardInfo("Tempest Drake", 139, Rarity.UNCOMMON, mage.cards.t.TempestDrake.class));
        cards.add(new SetCardInfo("Three Wishes", 45, Rarity.RARE, mage.cards.t.ThreeWishes.class));
        cards.add(new SetCardInfo("Tin-Wing Chimera", 157, Rarity.UNCOMMON, mage.cards.t.TinWingChimera.class));
        cards.add(new SetCardInfo("Tithe", 23, Rarity.RARE, mage.cards.t.Tithe.class));
        cards.add(new SetCardInfo("Tremor", 99, Rarity.COMMON, mage.cards.t.Tremor.class));
        cards.add(new SetCardInfo("Triangle of War", 158, Rarity.RARE, mage.cards.t.TriangleOfWar.class));
        cards.add(new SetCardInfo("Uktabi Orangutan", 123, Rarity.UNCOMMON, mage.cards.u.UktabiOrangutan.class));
        cards.add(new SetCardInfo("Undiscovered Paradise", 167, Rarity.RARE, mage.cards.u.UndiscoveredParadise.class));
        cards.add(new SetCardInfo("Undo", 47, Rarity.COMMON, mage.cards.u.Undo.class));
        cards.add(new SetCardInfo("Urborg Mindsucker", 71, Rarity.COMMON, mage.cards.u.UrborgMindsucker.class));
        cards.add(new SetCardInfo("Vampiric Tutor", 72, Rarity.RARE, mage.cards.v.VampiricTutor.class));
        cards.add(new SetCardInfo("Vampirism", 73, Rarity.UNCOMMON, mage.cards.v.Vampirism.class));
        cards.add(new SetCardInfo("Vanishing", 48, Rarity.COMMON, mage.cards.v.Vanishing.class));
        cards.add(new SetCardInfo("Viashino Sandstalker", 100, Rarity.UNCOMMON, mage.cards.v.ViashinoSandstalker.class));
        cards.add(new SetCardInfo("Viashivan Dragon", 140, Rarity.RARE, mage.cards.v.ViashivanDragon.class));
        cards.add(new SetCardInfo("Vision Charm", 49, Rarity.COMMON, mage.cards.v.VisionCharm.class));
        cards.add(new SetCardInfo("Wake of Vultures", 74, Rarity.COMMON, mage.cards.w.WakeOfVultures.class));
        cards.add(new SetCardInfo("Wand of Denial", 159, Rarity.RARE, mage.cards.w.WandOfDenial.class));
        cards.add(new SetCardInfo("Warrior's Honor", 24, Rarity.COMMON, mage.cards.w.WarriorsHonor.class));
        cards.add(new SetCardInfo("Warthog", 124, Rarity.COMMON, mage.cards.w.Warthog.class));
        cards.add(new SetCardInfo("Waterspout Djinn", 50, Rarity.UNCOMMON, mage.cards.w.WaterspoutDjinn.class));
        cards.add(new SetCardInfo("Wicked Reward", 75, Rarity.COMMON, mage.cards.w.WickedReward.class));
        cards.add(new SetCardInfo("Wind Shear", 125, Rarity.UNCOMMON, mage.cards.w.WindShear.class));
        cards.add(new SetCardInfo("Zhalfirin Crusader", 25, Rarity.RARE, mage.cards.z.ZhalfirinCrusader.class));
    }
}
