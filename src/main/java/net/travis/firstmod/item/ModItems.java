package net.travis.firstmod.item;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.BeaconBlock;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.custom.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, firstMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> WITHER_SHARD = ITEMS.register("wither_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_INGOT = ITEMS.register("wither_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_WITHER_INGOT = ITEMS.register("hardened_wither_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_COAL = ITEMS.register("wither_coal",
            () -> new FuelItem(new Item.Properties(), 6400));
    public static final RegistryObject<Item> BONE_MARROW = ITEMS.register("bone_marrow",
            () -> new Item(new Item.Properties().food(ModFoods.BONE_MARROW)));
    public static final RegistryObject<Item> WITHER_STEW = ITEMS.register("wither_stew",
            () -> new WitherStewItem(new Item.Properties().food(ModFoods.WITHER_STEW)));
    public static final RegistryObject<Item> WITHER_CHARM = ITEMS.register("wither_charm",
            () -> new WitherCharmItem(new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_CHARM = ITEMS.register("blaze_charm",
            () -> new BlazeCharmItem(new Item.Properties()));
    public static final RegistryObject<Item> HEART_CHARM = ITEMS.register("heart_charm",
            () -> new HeartCharmItem(new Item.Properties()));
    public static final RegistryObject<Item> NIGHT_CHARM = ITEMS.register("night_charm",
            () -> new NightCharmItem(new Item.Properties()));
    public static final RegistryObject<Item> SPEED_CHARM = ITEMS.register("speed_charm",
            () -> new SpeedCharmItem(new Item.Properties()));




    public static final RegistryObject<Item> WITHER_SWORD = ITEMS.register("wither_sword",
            () -> new WitherSwordItem(ModToolTiers.WITHER, 3,-2.4f,new Item.Properties()));
    public static final RegistryObject<Item> WITHER_BATTLEAXE = ITEMS.register("wither_battleaxe",
            () -> new WitherAxeItem(ModToolTiers.WITHER, 7,-2.8f,new Item.Properties()));
    public static final RegistryObject<Item> WITHER_PICKAXE = ITEMS.register("wither_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WITHER, 1,-2.4f,new Item.Properties()));
    public static final RegistryObject<Item> WITHER_SHOVEL = ITEMS.register("wither_shovel",
            () -> new ShovelItem(ModToolTiers.WITHER, 1,-2.4f,new Item.Properties()));
    public static final RegistryObject<Item> WITHER_AXE = ITEMS.register("wither_axe",
            () -> new AxeItem(ModToolTiers.WITHER, 4,-2.6f,new Item.Properties()));


    public static final RegistryObject<Item> WITHER_BOW = ITEMS.register("wither_bow",
            () -> new WitherBowItem(new Item.Properties()));
    public static final RegistryObject<Item> REG_WITHER_BOW = ITEMS.register("regwither_bow",
            () -> new CustomBowItem(new Item.Properties()));


    public static final RegistryObject<Item> WITHER_ARROW = ITEMS.register("wither_arrow",
            () -> new ArrowItem(new Item.Properties()));

    public static final RegistryObject<Item> WITHER_HELMET = ITEMS.register("wither_helmet",
            () -> new ModArmorItem(ModArmorMaterials.WITHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WITHER_CHESTPLATE = ITEMS.register("wither_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WITHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WITHER_LEGGINGS = ITEMS.register("wither_leggings",
            () -> new ArmorItem(ModArmorMaterials.WITHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WITHER_BOOTS = ITEMS.register("wither_boots",
            () -> new ArmorItem(ModArmorMaterials.WITHER, ArmorItem.Type.BOOTS, new Item.Properties()));
}
