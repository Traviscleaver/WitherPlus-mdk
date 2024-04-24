package net.travis.firstmod.worldgen.biome.surface;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.worldgen.biome.ModBiomes;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource DIAMONDBLOCK = makeStateRule(Blocks.DIAMOND_BLOCK);
    private static final SurfaceRules.RuleSource SOULGRASS = makeStateRule(ModBlocks.SOUL_BLOCK.get());
    private static final SurfaceRules.RuleSource SOULSAND = makeStateRule(Blocks.SOUL_SAND);




    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAbove30 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(30), 0);

        SurfaceRules.ConditionSource isBelow35 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(35), 0));
        SurfaceRules.ConditionSource isSuitablePatchNoise = SurfaceRules.noiseCondition(Noises.PATCH, -0.012D);
        SurfaceRules.ConditionSource isTop5Blocks = SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0);


        SurfaceRules.RuleSource roofBlock = SurfaceRules.ifTrue(isTop5Blocks, SurfaceRules.ifTrue(isTop5Blocks, SurfaceRules.ifTrue(isTop5Blocks, BEDROCK)));
        SurfaceRules.RuleSource tuffPatchRules = SurfaceRules.ifTrue(isSuitablePatchNoise, SurfaceRules.ifTrue(isAbove30, SurfaceRules.ifTrue(isBelow35, SOULSAND)));

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(ModBiomes.WITHERED_FOREST),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, SOULSAND),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(roofBlock, tuffPatchRules, SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SOULGRASS), DIRT
                                        )
                                )
                        )
                )

        );
    }
}

