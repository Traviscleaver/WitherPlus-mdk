package net.travis.firstmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.util.ModTags;
import net.travis.firstmod.worldgen.biome.ModBiomes;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, firstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        this.tag(BlockTags.NEEDS_STONE_TOOL);
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(
                        ModBlocks.WITHER_SHARD_ORE.get()
                );


        this.tag(ModTags.Blocks.NEEDS_WITHER_TOOL)
                .add(ModBlocks.WITHER_SHARD_ORE.get());



        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WITHER_FENCE.get())
                .add(ModBlocks.SOUL_SOIL_FENCE.get())
                .add(ModBlocks.SOUL_SAND_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WITHER_FENCE_GATE.get())
                .add(ModBlocks.SOUL_SOIL_FENCE_GATE.get())
                .add(ModBlocks.SOUL_SAND_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.WITHER_WALL.get())
                .add(ModBlocks.SOUL_SOIL_WALL.get())
                .add(ModBlocks.SOUL_SAND_WALL.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WITHER_SHARD_ORE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WITHER_LOG.get())
                .add(ModBlocks.WITHER_WOOD.get())
                .add(ModBlocks.STRIPPED_WITHER_LOG.get())
                .add(ModBlocks.STRIPPED_WITHER_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WITHER_PLANKS.get());

        this.tag(BlockTags.DIRT)
                .add(ModBlocks.SOUL_BLOCK.get());


        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.WITHER_BLOCK.get());
    }
}
