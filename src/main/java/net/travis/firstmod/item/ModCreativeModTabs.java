package net.travis.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, firstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("creativetab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WITHER_INGOT.get()))
                    .title(Component.translatable("creativetab.creativetab"))
                    .displayItems((pParameters, pOutput) -> {



                        pOutput.accept(ModItems.WITHER_HELMET.get());
                        pOutput.accept(ModItems.WITHER_CHESTPLATE.get());
                        pOutput.accept(ModItems.WITHER_LEGGINGS.get());
                        pOutput.accept(ModItems.WITHER_BOOTS.get());

                        pOutput.accept(ModItems.WITHER_INGOT.get());
                        pOutput.accept(ModItems.WITHER_ARROW.get());
                        pOutput.accept(ModItems.HARDENED_WITHER_INGOT.get());
                        pOutput.accept(ModItems.WITHER_SHARD.get());
                        pOutput.accept(ModItems.WITHER_COAL.get());
                        pOutput.accept(ModItems.BONE_MARROW.get());
                        pOutput.accept(ModItems.WITHER_STEW.get());
                        pOutput.accept(ModItems.WITHER_CHARM.get());
                        pOutput.accept(ModItems.BLAZE_CHARM.get());
                        pOutput.accept(ModItems.HEART_CHARM.get());
                        pOutput.accept(ModItems.NIGHT_CHARM.get());
                        pOutput.accept(ModItems.SPEED_CHARM.get());
                        pOutput.accept(ModBlocks.WITHER_BLOCK.get());



                        pOutput.accept(ModBlocks.SOUL_SAND_WALL.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_FENCE.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_BUTTON.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_STAIRS.get());
                        pOutput.accept(ModBlocks.SOUL_SAND_SLAB.get());




                        pOutput.accept(ModBlocks.SOUL_SOIL_BUTTON.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_FENCE.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_WALL.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_STAIRS.get());
                        pOutput.accept(ModBlocks.SOUL_SOIL_SLAB.get());


                        pOutput.accept(ModBlocks.ENTITY_BEACON.get());
                        pOutput.accept(ModBlocks.SOUL_BLOCK.get());

                        pOutput.accept(ModItems.WITHER_SWORD.get());
                        pOutput.accept(ModItems.WITHER_BATTLEAXE.get());
                        pOutput.accept(ModItems.WITHER_PICKAXE.get());
                        pOutput.accept(ModItems.WITHER_SHOVEL.get());
                        pOutput.accept(ModItems.WITHER_AXE.get());
                        pOutput.accept(ModItems.WITHER_BOW.get());
                        pOutput.accept(ModItems.REG_WITHER_BOW.get());


                        pOutput.accept(ModBlocks.WITHER_BUTTON.get());
                        pOutput.accept(ModBlocks.WITHER_DOOR.get());
                        pOutput.accept(ModBlocks.WITHER_FENCE.get());
                        pOutput.accept(ModBlocks.WITHER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WITHER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WITHER_WALL.get());
                        pOutput.accept(ModBlocks.WITHER_SLAB.get());
                        pOutput.accept(ModBlocks.WITHER_STAIRS.get());
                        pOutput.accept(ModBlocks.WITHER_TRAPDOOR.get());


                        pOutput.accept(ModBlocks.WITHER_LOG.get());
                        pOutput.accept(ModBlocks.WITHER_SAPLING.get());
                        pOutput.accept(ModBlocks.WITHER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WITHER_LOG.get());
                        pOutput.accept(ModBlocks.WITHER_LEAVES.get());
                        pOutput.accept(ModBlocks.WITHER_PLANKS.get());
                        pOutput.accept(ModBlocks.STRIPPED_WITHER_WOOD.get());
                        pOutput.accept(ModBlocks.WITHER_SHARD_ORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
