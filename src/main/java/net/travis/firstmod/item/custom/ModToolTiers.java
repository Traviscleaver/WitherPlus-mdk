package net.travis.firstmod.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;
import net.travis.firstmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier WITHER = TierSortingRegistry.registerTier(
            new ForgeTier(5,2000,12,7f,25,
                    ModTags.Blocks.NEEDS_WITHER_TOOL, () -> Ingredient.of(ModItems.WITHER_INGOT.get())),
            new ResourceLocation(firstMod.MOD_ID, "wither"), List.of(Tiers.NETHERITE), List.of());

}
