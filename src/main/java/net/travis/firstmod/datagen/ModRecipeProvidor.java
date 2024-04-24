package net.travis.firstmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.world.item.Items.*;


public class ModRecipeProvidor extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> WITHER_SHARD_SMELTABLES = List.of(ModItems.WITHER_SHARD.get(),
            ModBlocks.WITHER_SHARD_ORE.get());


    public ModRecipeProvidor(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
    oreSmelting(pWriter,WITHER_SHARD_SMELTABLES,RecipeCategory.MISC,ModItems.WITHER_SHARD.get(),0.25f,200,"sapphire");
    oreBlasting(pWriter,WITHER_SHARD_SMELTABLES,RecipeCategory.MISC,ModItems.WITHER_SHARD.get(),0.25f,100,"sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_SLAB.get(),6)
                .pattern("   ")
                .pattern("   ")
                .pattern("SSS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_FENCE.get(),3)
                .pattern("   ")
                .pattern("ASA")
                .pattern("ASA")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .define('A', STICK)
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_TRAPDOOR.get(),2)
                .pattern("   ")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_STAIRS.get(),4)
                .pattern("  S")
                .pattern(" SS")
                .pattern("SSS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_FENCE_GATE.get())
                .pattern("   ")
                .pattern("SAS")
                .pattern("SAS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .define('A', STICK)
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_PRESSURE_PLATE.get())
                .pattern("SS ")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_DOOR.get(),3)
                .pattern(" SS")
                .pattern(" SS")
                .pattern(" SS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_WALL.get(),3)
                .pattern("   ")
                .pattern("SSS")
                .pattern("SAS")
                .define('S', ModBlocks.WITHER_PLANKS.get())
                .define('A',STICK)
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WITHER_BUTTON.get())
                .requires(ModBlocks.WITHER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_PLANKS.get()), has(ModBlocks.WITHER_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_INGOT.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', NETHERITE_INGOT)
                .define('S', ModItems.WITHER_SHARD.get())
                .unlockedBy(getHasName(ModItems.WITHER_SHARD.get()), has(ModItems.WITHER_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" A ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_BATTLEAXE.get())
                .pattern(" SS")
                .pattern(" AS")
                .pattern("A  ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_AXE.get())
                .pattern(" SS")
                .pattern(" AS")
                .pattern(" A ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_SHOVEL.get())
                .pattern(" S ")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_HELMET.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("   ")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.WITHER_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.WITHER_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.WITHER_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WITHER_SHARD.get(), 9)
                .requires(ModBlocks.WITHER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_BLOCK.get()), has(ModBlocks.WITHER_BLOCK.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WITHER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.WITHER_SHARD.get())
                .unlockedBy(getHasName(ModItems.WITHER_SHARD.get()), has(ModItems.WITHER_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_COAL.get())
                .pattern(" S ")
                .pattern("SAS")
                .pattern(" S ")
                .define('S', ModItems.WITHER_SHARD.get())
                .define('A', COAL)
                .unlockedBy(getHasName(ModItems.WITHER_SHARD.get()), has(ModItems.WITHER_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,WITHER_SKELETON_SKULL)
                .pattern("SS ")
                .pattern("SS ")
                .define('S', ModItems.WITHER_SHARD.get())
                .unlockedBy(getHasName(ModItems.WITHER_SHARD.get()), has(ModItems.WITHER_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.HARDENED_WITHER_INGOT.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.WITHER_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_CHARM.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', NETHER_STAR)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.BLAZE_CHARM.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', BLAZE_ROD)
                .define('A', NETHER_STAR)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.HEART_CHARM.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', WITHER_ROSE)
                .define('A', NETHER_STAR)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.NIGHT_CHARM.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ENDER_EYE)
                .define('A', NETHER_STAR)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.SPEED_CHARM.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', FEATHER)
                .define('A', NETHER_STAR)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_ARROW.get(),4)
                .pattern(" S ")
                .pattern("SAS")
                .pattern(" S ")
                .define('S', ModItems.WITHER_SHARD.get())
                .define('A', ARROW)
                .unlockedBy(getHasName(ModItems.WITHER_SHARD.get()), has(ModItems.WITHER_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_BOW.get(),1)
                .pattern(" SB")
                .pattern("CAB")
                .pattern(" SB")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('A', NETHER_STAR)
                .define('B', BLAZE_ROD)
                .define('C', ModItems.HARDENED_WITHER_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.REG_WITHER_BOW.get(),1)
                .pattern(" SB")
                .pattern("S B")
                .pattern(" SB")
                .define('S', ModItems.WITHER_INGOT.get())
                .define('B', BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.WITHER_INGOT.get()), has(ModItems.WITHER_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WITHER_STEW.get(),1)
                .pattern("S ")
                .pattern("AB")
                .define('S', WITHER_ROSE)
                .define('A', BOWL)
                .define('B', ModItems.BONE_MARROW.get())
                .unlockedBy(getHasName(WITHER_ROSE), has(WITHER_ROSE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WITHER_PLANKS.get(), 4)
                .requires(ModBlocks.WITHER_LOG.get())
                .unlockedBy(getHasName(ModBlocks.WITHER_LOG.get()), has(ModBlocks.WITHER_LOG.get()))
                .save(pWriter);

    }






    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, firstMod.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
