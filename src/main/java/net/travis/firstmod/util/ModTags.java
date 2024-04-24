package net.travis.firstmod.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.travis.firstmod.firstMod;


public class ModTags {
    public static class Blocks {


        public static final TagKey<Block> NEEDS_WITHER_TOOL = blockTag("needs_wither_tool");



        private static TagKey<Block> blockTag(String name) {
            return BlockTags.create(new ResourceLocation(firstMod.MOD_ID, name));

        }


    }
    public static class Biomes {
//        public static final TagKey<Biome> MODDED_BIOMES = biomeTag("modded_biomes");

        private static TagKey<Biome> biomeTag(String name) {
            return TagKey.create(Registries.BIOME, new ResourceLocation(firstMod.MOD_ID, name));

        }
    }
    public static class Items {

    }
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(firstMod.MOD_ID, name));
        }
    }