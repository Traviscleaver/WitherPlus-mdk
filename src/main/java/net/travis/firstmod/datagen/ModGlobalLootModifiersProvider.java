package net.travis.firstmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;
import net.travis.firstmod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, firstMod.MOD_ID);
    }

    @Override
    protected void start() {

        add("wither_shard_from_wither_skeleton", new AddItemModifier(new LootItemCondition[] {
             new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
            LootItemRandomChanceCondition.randomChance(1).build()}, ModItems.WITHER_SHARD.get()));
        add("bone_marrow_from_wither_skeleton", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()}, ModItems.BONE_MARROW.get()));
        add("wither_shard_from_wither", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build()}, ModItems.WITHER_SHARD.get()));





        //ADDS TO BLOCK DROP!
       // add("wither_shard_from_wither", new AddItemModifier(new LootItemCondition[] {
         //       LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
        //        LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.WITHER_SHARD.get()));
        }

    }

