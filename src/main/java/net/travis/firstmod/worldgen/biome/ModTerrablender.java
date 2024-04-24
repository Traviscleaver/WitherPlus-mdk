package net.travis.firstmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.travis.firstmod.firstMod;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiome() {
        Regions.register(new ModNetherRegion(new ResourceLocation(firstMod.MOD_ID, "nether"), 5));
    }
}
