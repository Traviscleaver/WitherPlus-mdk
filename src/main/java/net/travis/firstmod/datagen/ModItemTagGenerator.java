package net.travis.firstmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, firstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.WITHER_HELMET.get(),
                        ModItems.WITHER_CHESTPLATE.get(),
                        ModItems.WITHER_LEGGINGS.get(),
                        ModItems.WITHER_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WITHER_LOG.get().asItem())
                .add(ModBlocks.WITHER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WITHER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WITHER_WOOD.get().asItem());
        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WITHER_PLANKS.get().asItem() );



    }


}
