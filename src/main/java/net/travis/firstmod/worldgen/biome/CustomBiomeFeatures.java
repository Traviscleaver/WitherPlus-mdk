package net.travis.firstmod.worldgen.biome;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class CustomBiomeFeatures extends BiomeDefaultFeatures {

    public static void caveSpawns(MobSpawnSettings.Builder pBuilder) {
        pBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.BLAZE, 10, 8, 8));
        pBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 10, 8, 8));
    }
}
