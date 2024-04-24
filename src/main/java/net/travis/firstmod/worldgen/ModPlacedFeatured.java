package net.travis.firstmod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;

import java.util.List;

public class ModPlacedFeatured {


    public static final ResourceKey<PlacedFeature> WITHER_SHARD_ORE_KEY = registerKey("wither_shard_ore_placed");

    public static final ResourceKey<PlacedFeature> SOUL_PLACE_KEY = registerKey("soul_placed");


    public static void bootStrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, WITHER_SHARD_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WITHER_SHARD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(120))));

        register(context, SOUL_PLACE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SOUL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(5,0.1f,2),
                        ModBlocks.WITHER_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(firstMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
