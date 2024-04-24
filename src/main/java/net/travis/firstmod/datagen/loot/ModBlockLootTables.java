package net.travis.firstmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.WITHER_BLOCK.get());

        this.dropSelf(ModBlocks.CATMINT.get());
        this.add(ModBlocks.POTTED_CATMINT.get(), createPotFlowerItemTable(ModBlocks.CATMINT.get()));

        this.dropSelf(ModBlocks.ENTITY_BEACON.get());

        this.dropSelf(ModBlocks.WITHER_STAIRS.get());
        this.dropSelf(ModBlocks.WITHER_BUTTON.get());
        this.dropSelf(ModBlocks.WITHER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WITHER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WITHER_FENCE.get());
        this.dropSelf(ModBlocks.WITHER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WITHER_WALL.get());

        this.add(ModBlocks.WITHER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WITHER_SLAB.get()));
        this.add(ModBlocks.WITHER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WITHER_DOOR.get()));
        this.add(ModBlocks.SOUL_BLOCK.get(),
                block -> createDoorTable(Blocks.DIRT));



        this.dropSelf(ModBlocks.WITHER_WOOD.get());
        this.dropSelf(ModBlocks.WITHER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WITHER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WITHER_WOOD.get());
        this.dropSelf(ModBlocks.WITHER_PLANKS.get());
        this.dropSelf(ModBlocks.WITHER_SAPLING.get());

        this.add(ModBlocks.WITHER_LEAVES.get(), block ->
                createLeavesDrops(block,ModBlocks.WITHER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //

        this.add(ModBlocks.WITHER_SHARD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.WITHER_SHARD_ORE.get(), ModItems.WITHER_SHARD.get()));



        this.dropSelf(ModBlocks.SOUL_SOIL_BLOCK.get());
        this.dropSelf(ModBlocks.SOUL_SAND_BLOCK.get());

        this.dropSelf(ModBlocks.SOUL_SAND_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SOUL_SAND_BUTTON.get());
        this.dropSelf(ModBlocks.SOUL_SAND_FENCE.get());
        this.dropSelf(ModBlocks.SOUL_SAND_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SOUL_SAND_WALL.get());

        this.add(ModBlocks.SOUL_SAND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SOUL_SAND_SLAB.get()));
        this.dropSelf(ModBlocks.SOUL_SAND_STAIRS.get());



        this.dropSelf(ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_BUTTON.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_FENCE.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_WALL.get());

        this.add(ModBlocks.SOUL_SOIL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SOUL_SOIL_SLAB.get()));
        this.dropSelf(ModBlocks.SOUL_SOIL_STAIRS.get());


    }











    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock,Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionCondition(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1,2)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
