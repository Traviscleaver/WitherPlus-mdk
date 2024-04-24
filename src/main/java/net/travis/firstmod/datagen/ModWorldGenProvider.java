package net.travis.firstmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.worldgen.ModBiomeModifers;
import net.travis.firstmod.worldgen.ModConfiguredFeatures;
import net.travis.firstmod.worldgen.ModPlacedFeatured;
import net.travis.firstmod.worldgen.biome.ModBiomes;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatured::bootStrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifers::bootstrap)
            .add(Registries.BIOME, ModBiomes::boostrap);


    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(firstMod.MOD_ID));
    }
}
