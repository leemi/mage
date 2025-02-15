package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ModernHorizons2 extends ExpansionSet {

    private static final ModernHorizons2 instance = new ModernHorizons2();

    public static ModernHorizons2 getInstance() {
        return instance;
    }

    private ModernHorizons2() {
        super("Modern Horizons 2", "MH2", ExpansionSet.buildDate(2021, 6, 11), SetType.SUPPLEMENTAL_MODERN_LEGAL);
        this.blockName = "Modern Horizons 2";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 303;

        cards.add(new SetCardInfo("Abundant Harvest", 147, Rarity.COMMON, mage.cards.a.AbundantHarvest.class));
        cards.add(new SetCardInfo("Aeromoeba", 37, Rarity.COMMON, mage.cards.a.Aeromoeba.class));
        cards.add(new SetCardInfo("Arcbound Mouser", 3, Rarity.COMMON, mage.cards.a.ArcboundMouser.class));
        cards.add(new SetCardInfo("Arcbound Shikari", 184, Rarity.UNCOMMON, mage.cards.a.ArcboundShikari.class));
        cards.add(new SetCardInfo("Arcbound Whelp", 113, Rarity.UNCOMMON, mage.cards.a.ArcboundWhelp.class));
        cards.add(new SetCardInfo("Archfiend of Sorrows", 74, Rarity.UNCOMMON, mage.cards.a.ArchfiendOfSorrows.class));
        cards.add(new SetCardInfo("Arid Mesa", 244, Rarity.RARE, mage.cards.a.AridMesa.class));
        cards.add(new SetCardInfo("Asmoranomardicadaistinaculdacar", 186, Rarity.RARE, mage.cards.a.Asmoranomardicadaistinaculdacar.class));
        cards.add(new SetCardInfo("Battle Plan", 114, Rarity.COMMON, mage.cards.b.BattlePlan.class));
        cards.add(new SetCardInfo("Bone Shards", 76, Rarity.COMMON, mage.cards.b.BoneShards.class));
        cards.add(new SetCardInfo("Bottle Golems", 222, Rarity.COMMON, mage.cards.b.BottleGolems.class));
        cards.add(new SetCardInfo("Brainstone", 223, Rarity.UNCOMMON, mage.cards.b.Brainstone.class));
        cards.add(new SetCardInfo("Break Ties", 8, Rarity.COMMON, mage.cards.b.BreakTies.class));
        cards.add(new SetCardInfo("Breya's Apprentice", 117, Rarity.RARE, mage.cards.b.BreyasApprentice.class));
        cards.add(new SetCardInfo("Cabal Coffers", 301, Rarity.MYTHIC, mage.cards.c.CabalCoffers.class));
        cards.add(new SetCardInfo("Calibrated Blast", 118, Rarity.RARE, mage.cards.c.CalibratedBlast.class));
        cards.add(new SetCardInfo("Chance Encounter", 277, Rarity.RARE, mage.cards.c.ChanceEncounter.class));
        cards.add(new SetCardInfo("Chatterstorm", 152, Rarity.COMMON, mage.cards.c.Chatterstorm.class));
        cards.add(new SetCardInfo("Counterspell", 267, Rarity.UNCOMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Dakkon, Shadow Slayer", 192, Rarity.MYTHIC, mage.cards.d.DakkonShadowSlayer.class));
        cards.add(new SetCardInfo("Darkmoss Bridge", 245, Rarity.COMMON, mage.cards.d.DarkmossBridge.class));
        cards.add(new SetCardInfo("Diamond Lion", 225, Rarity.RARE, mage.cards.d.DiamondLion.class));
        cards.add(new SetCardInfo("Discerning Taste", 82, Rarity.COMMON, mage.cards.d.DiscerningTaste.class));
        cards.add(new SetCardInfo("Dragon's Rage Channeler", 121, Rarity.UNCOMMON, mage.cards.d.DragonsRageChanneler.class));
        cards.add(new SetCardInfo("Drey Keeper", 194, Rarity.COMMON, mage.cards.d.DreyKeeper.class));
        cards.add(new SetCardInfo("Drossforge Bridge", 246, Rarity.COMMON, mage.cards.d.DrossforgeBridge.class));
        cards.add(new SetCardInfo("Enchantress's Presence", 283, Rarity.RARE, mage.cards.e.EnchantresssPresence.class));
        cards.add(new SetCardInfo("Extruder", 296, Rarity.UNCOMMON, mage.cards.e.Extruder.class));
        cards.add(new SetCardInfo("Flame Rift", 278, Rarity.UNCOMMON, mage.cards.f.FlameRift.class));
        cards.add(new SetCardInfo("Flametongue Yearling", 125, Rarity.UNCOMMON, mage.cards.f.FlametongueYearling.class));
        cards.add(new SetCardInfo("Flay Essence", 85, Rarity.UNCOMMON, mage.cards.f.FlayEssence.class));
        cards.add(new SetCardInfo("Forest", 489, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fractured Sanity", 44, Rarity.RARE, mage.cards.f.FracturedSanity.class));
        cards.add(new SetCardInfo("Goblin Bombardment", 279, Rarity.RARE, mage.cards.g.GoblinBombardment.class));
        cards.add(new SetCardInfo("Goldmire Bridge", 247, Rarity.COMMON, mage.cards.g.GoldmireBridge.class));
        cards.add(new SetCardInfo("Greed", 274, Rarity.UNCOMMON, mage.cards.g.Greed.class));
        cards.add(new SetCardInfo("Grief", 87, Rarity.MYTHIC, mage.cards.g.Grief.class));
        cards.add(new SetCardInfo("Herd Baloth", 165, Rarity.UNCOMMON, mage.cards.h.HerdBaloth.class));
        cards.add(new SetCardInfo("Ignoble Hierarch", 166, Rarity.RARE, mage.cards.i.IgnobleHierarch.class));
        cards.add(new SetCardInfo("Imperial Recruiter", 281, Rarity.MYTHIC, mage.cards.i.ImperialRecruiter.class));
        cards.add(new SetCardInfo("Island", 483, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Junk Winder", 48, Rarity.UNCOMMON, mage.cards.j.JunkWinder.class));
        cards.add(new SetCardInfo("Kitchen Imp", 89, Rarity.COMMON, mage.cards.k.KitchenImp.class));
        cards.add(new SetCardInfo("Landscaper Colos", 18, Rarity.COMMON, mage.cards.l.LandscaperColos.class));
        cards.add(new SetCardInfo("Late to Dinner", 19, Rarity.COMMON, mage.cards.l.LateToDinner.class));
        cards.add(new SetCardInfo("Legion Vanguard", 90, Rarity.UNCOMMON, mage.cards.l.LegionVanguard.class));
        cards.add(new SetCardInfo("Lucid Dreams", 50, Rarity.UNCOMMON, mage.cards.l.LucidDreams.class));
        cards.add(new SetCardInfo("Marsh Flats", 248, Rarity.RARE, mage.cards.m.MarshFlats.class));
        cards.add(new SetCardInfo("Mental Journey", 51, Rarity.COMMON, mage.cards.m.MentalJourney.class));
        cards.add(new SetCardInfo("Mirari's Wake", 291, Rarity.MYTHIC, mage.cards.m.MirarisWake.class));
        cards.add(new SetCardInfo("Mishra's Factory", 302, Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Mistvault Bridge", 249, Rarity.COMMON, mage.cards.m.MistvaultBridge.class));
        cards.add(new SetCardInfo("Misty Rainforest", 250, Rarity.RARE, mage.cards.m.MistyRainforest.class));
        cards.add(new SetCardInfo("Mogg Salvage", 282, Rarity.UNCOMMON, mage.cards.m.MoggSalvage.class));
        cards.add(new SetCardInfo("Monoskelion", 229, Rarity.UNCOMMON, mage.cards.m.Monoskelion.class));
        cards.add(new SetCardInfo("Mountain", 487, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mystic Redaction", 53, Rarity.UNCOMMON, mage.cards.m.MysticRedaction.class));
        cards.add(new SetCardInfo("Necromancer's Familiar", 94, Rarity.UNCOMMON, mage.cards.n.NecromancersFamiliar.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 298, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Obsidian Charmaw", 137, Rarity.RARE, mage.cards.o.ObsidianCharmaw.class));
        cards.add(new SetCardInfo("Orchard Strider", 169, Rarity.COMMON, mage.cards.o.OrchardStrider.class));
        cards.add(new SetCardInfo("Patriarch's Bidding", 275, Rarity.RARE, mage.cards.p.PatriarchsBidding.class));
        cards.add(new SetCardInfo("Phantasmal Dreadmaw", 55, Rarity.COMMON, mage.cards.p.PhantasmalDreadmaw.class));
        cards.add(new SetCardInfo("Plains", 481, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Priest of Fell Rites", 208, Rarity.RARE, mage.cards.p.PriestOfFellRites.class));
        cards.add(new SetCardInfo("Prismatic Ending", 25, Rarity.UNCOMMON, mage.cards.p.PrismaticEnding.class));
        cards.add(new SetCardInfo("Profane Tutor", 97, Rarity.RARE, mage.cards.p.ProfaneTutor.class));
        cards.add(new SetCardInfo("Quirion Ranger", 285, Rarity.UNCOMMON, mage.cards.q.QuirionRanger.class));
        cards.add(new SetCardInfo("Ravenous Squirrel", 211, Rarity.UNCOMMON, mage.cards.r.RavenousSquirrel.class));
        cards.add(new SetCardInfo("Razortide Bridge", 252, Rarity.COMMON, mage.cards.r.RazortideBridge.class));
        cards.add(new SetCardInfo("Rift Sower", 170, Rarity.COMMON, mage.cards.r.RiftSower.class));
        cards.add(new SetCardInfo("Rishadan Dockhand", 59, Rarity.RARE, mage.cards.r.RishadanDockhand.class));
        cards.add(new SetCardInfo("Rustvale Bridge", 253, Rarity.COMMON, mage.cards.r.RustvaleBridge.class));
        cards.add(new SetCardInfo("Sanctum Prelate", 491, Rarity.MYTHIC, mage.cards.s.SanctumPrelate.class));
        cards.add(new SetCardInfo("Scalding Tarn", 254, Rarity.RARE, mage.cards.s.ScaldingTarn.class));
        cards.add(new SetCardInfo("Scurry Oak", 172, Rarity.UNCOMMON, mage.cards.s.ScurryOak.class));
        cards.add(new SetCardInfo("Scuttletide", 61, Rarity.UNCOMMON, mage.cards.s.Scuttletide.class));
        cards.add(new SetCardInfo("Seal of Cleansing", 264, Rarity.UNCOMMON, mage.cards.s.SealOfCleansing.class));
        cards.add(new SetCardInfo("Seal of Removal", 269, Rarity.UNCOMMON, mage.cards.s.SealOfRemoval.class));
        cards.add(new SetCardInfo("Silverbluff Bridge", 255, Rarity.COMMON, mage.cards.s.SilverbluffBridge.class));
        cards.add(new SetCardInfo("Skirge Familiar", 276, Rarity.UNCOMMON, mage.cards.s.SkirgeFamiliar.class));
        cards.add(new SetCardInfo("Skophos Reaver", 140, Rarity.COMMON, mage.cards.s.SkophosReaver.class));
        cards.add(new SetCardInfo("Slagwoods Bridge", 256, Rarity.COMMON, mage.cards.s.SlagwoodsBridge.class));
        cards.add(new SetCardInfo("Solitary Confinement", 265, Rarity.RARE, mage.cards.s.SolitaryConfinement.class));
        cards.add(new SetCardInfo("Solitude", 32, Rarity.MYTHIC, mage.cards.s.Solitude.class));
        cards.add(new SetCardInfo("Soul Snare", 266, Rarity.UNCOMMON, mage.cards.s.SoulSnare.class));
        cards.add(new SetCardInfo("Spreading Insurrection", 142, Rarity.UNCOMMON, mage.cards.s.SpreadingInsurrection.class));
        cards.add(new SetCardInfo("Squirrel Mob", 286, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Sanctuary", 174, Rarity.UNCOMMON, mage.cards.s.SquirrelSanctuary.class));
        cards.add(new SetCardInfo("Squirrel Sovereign", 175, Rarity.UNCOMMON, mage.cards.s.SquirrelSovereign.class));
        cards.add(new SetCardInfo("Step Through", 66, Rarity.COMMON, mage.cards.s.StepThrough.class));
        cards.add(new SetCardInfo("Sterling Grove", 293, Rarity.RARE, mage.cards.s.SterlingGrove.class));
        cards.add(new SetCardInfo("Subtlety", 67, Rarity.MYTHIC, mage.cards.s.Subtlety.class));
        cards.add(new SetCardInfo("Swamp", 485, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sweep the Skies", 70, Rarity.UNCOMMON, mage.cards.s.SweepTheSkies.class));
        cards.add(new SetCardInfo("Sylvan Anthem", 176, Rarity.RARE, mage.cards.s.SylvanAnthem.class));
        cards.add(new SetCardInfo("Tanglepool Bridge", 257, Rarity.COMMON, mage.cards.t.TanglepoolBridge.class));
        cards.add(new SetCardInfo("The Underworld Cookbook", 240, Rarity.UNCOMMON, mage.cards.t.TheUnderworldCookbook.class));
        cards.add(new SetCardInfo("Thornglint Bridge", 258, Rarity.COMMON, mage.cards.t.ThornglintBridge.class));
        cards.add(new SetCardInfo("Thrasta, Tempest's Roar", 178, Rarity.MYTHIC, mage.cards.t.ThrastaTempestsRoar.class));
        cards.add(new SetCardInfo("Timeless Dragon", 35, Rarity.RARE, mage.cards.t.TimelessDragon.class));
        cards.add(new SetCardInfo("Tormod's Cryptkeeper", 239, Rarity.COMMON, mage.cards.t.TormodsCryptkeeper.class));
        cards.add(new SetCardInfo("Tourach's Canticle", 103, Rarity.COMMON, mage.cards.t.TourachsCanticle.class));
        cards.add(new SetCardInfo("Underworld Hermit", 105, Rarity.UNCOMMON, mage.cards.u.UnderworldHermit.class));
        cards.add(new SetCardInfo("Unmarked Grave", 106, Rarity.RARE, mage.cards.u.UnmarkedGrave.class));
        cards.add(new SetCardInfo("Upheaval", 270, Rarity.RARE, mage.cards.u.Upheaval.class));
        cards.add(new SetCardInfo("Urban Daggertooth", 181, Rarity.COMMON, mage.cards.u.UrbanDaggertooth.class));
        cards.add(new SetCardInfo("Urza's Saga", 259, Rarity.RARE, mage.cards.u.UrzasSaga.class));
        cards.add(new SetCardInfo("Vectis Gloves", 241, Rarity.UNCOMMON, mage.cards.v.VectisGloves.class));
        cards.add(new SetCardInfo("Vedalken Infiltrator", 73, Rarity.UNCOMMON, mage.cards.v.VedalkenInfiltrator.class));
        cards.add(new SetCardInfo("Verdant Catacombs", 260, Rarity.RARE, mage.cards.v.VerdantCatacombs.class));
        cards.add(new SetCardInfo("Void Mirror", 242, Rarity.RARE, mage.cards.v.VoidMirror.class));
        cards.add(new SetCardInfo("Wonder", 271, Rarity.RARE, mage.cards.w.Wonder.class));
        cards.add(new SetCardInfo("World-Weary", 109, Rarity.COMMON, mage.cards.w.WorldWeary.class));
        cards.add(new SetCardInfo("Yusri, Fortune's Flame", 218, Rarity.RARE, mage.cards.y.YusriFortunesFlame.class));
        cards.add(new SetCardInfo("Zuran Orb", 300, Rarity.UNCOMMON, mage.cards.z.ZuranOrb.class));
    }
}
