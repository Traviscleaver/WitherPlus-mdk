package net.travis.firstmod.datagen;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, firstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        handheldItem(ModItems.WITHER_SWORD);
        handheldItem(ModItems.WITHER_PICKAXE);
        handheldItem(ModItems.WITHER_AXE);
        handheldItem(ModItems.WITHER_SHOVEL);
        handheldItem(ModItems.WITHER_BATTLEAXE);


        simpleItem(ModItems.WITHER_INGOT);
        simpleItem(ModItems.WITHER_ARROW);
        simpleItem(ModItems.HARDENED_WITHER_INGOT);
        simpleItem(ModItems.WITHER_COAL);
        simpleItem(ModItems.WITHER_SHARD);
        simpleItem(ModItems.BONE_MARROW);
        simpleItem(ModItems.WITHER_STEW);
        simpleItem(ModItems.WITHER_CHARM);
        simpleItem(ModItems.BLAZE_CHARM);
        simpleItem(ModItems.HEART_CHARM);
        simpleItem(ModItems.SPEED_CHARM);
        simpleItem(ModItems.NIGHT_CHARM);

        trimmedArmorItem(ModItems.WITHER_HELMET);
        trimmedArmorItem(ModItems.WITHER_CHESTPLATE);
        trimmedArmorItem(ModItems.WITHER_LEGGINGS);
        trimmedArmorItem(ModItems.WITHER_BOOTS);

        saplingItem(ModBlocks.WITHER_SAPLING);

        simpleBlockItemBlockTexture(ModBlocks.CATMINT);

        simpleBlockItem(ModBlocks.WITHER_DOOR);

        fenceItem(ModBlocks.WITHER_FENCE, ModBlocks.WITHER_PLANKS);
        buttonItem(ModBlocks.WITHER_BUTTON, ModBlocks.WITHER_PLANKS);
        wallItem(ModBlocks.WITHER_WALL, ModBlocks.WITHER_PLANKS);

        evenSimplerBlockItem(ModBlocks.WITHER_STAIRS);
        evenSimplerBlockItem(ModBlocks.WITHER_SLAB);
        evenSimplerBlockItem(ModBlocks.WITHER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.WITHER_FENCE_GATE);

        trapdoorItem(ModBlocks.WITHER_TRAPDOOR);


        ResourceLocation soulSand = new ResourceLocation("firstmod:block/soul_sand_block");
        ResourceLocation soulSoil = new ResourceLocation("firstmod:block/soul_soil_block");

        simpleFenceItem(ModBlocks.SOUL_SAND_FENCE, soulSand);
        simpleButtonItem(ModBlocks.SOUL_SAND_BUTTON, soulSand);
        simpleWallItem(ModBlocks.SOUL_SAND_WALL, soulSand);
        evenSimplerBlockItem(ModBlocks.SOUL_SAND_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SOUL_SAND_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.SOUL_SAND_SLAB);
        evenSimplerBlockItem(ModBlocks.SOUL_SAND_STAIRS);

        simpleFenceItem(ModBlocks.SOUL_SOIL_FENCE, soulSoil);
        simpleButtonItem(ModBlocks.SOUL_SOIL_BUTTON, soulSoil);
        simpleWallItem(ModBlocks.SOUL_SOIL_WALL, soulSoil);
        evenSimplerBlockItem(ModBlocks.SOUL_SOIL_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SOUL_SOIL_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.SOUL_SOIL_SLAB);
        evenSimplerBlockItem(ModBlocks.SOUL_SOIL_STAIRS);









        withExistingParent(ModItems.WITHER_BOW.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(firstMod.MOD_ID, "item/" + ModItems.WITHER_BOW.getId().getPath()))


                .transforms()

                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)
                .rotation(-80, 260, -40)
                .translation(-1, -2, 2.5F)
                .scale(0.9F, 0.9F, 0.9F)
                .end()

                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND)
                .rotation(-80, -280, 40)
                .translation(-1, -2, 2.5F)
                .scale(0.9F, 0.9F, 0.9F)
                .end()

                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND)
                .rotation(0, -90, 25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()

                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND)
                .rotation(0, 90, -25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()
                .end()


                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/wither_bow_pulling_0"), existingFileHelper))
                .end()

                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.65F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/wither_bow_pulling_1"), existingFileHelper))
                .end()

                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.9F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/wither_bow_pulling_2"), existingFileHelper))
                .end();


        withExistingParent(ModItems.REG_WITHER_BOW.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(firstMod.MOD_ID, "item/" + ModItems.REG_WITHER_BOW.getId().getPath()))


                .transforms()

                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)
                .rotation(-80, 260, -40)
                .translation(-1, -2, 2.5F)
                .scale(0.9F, 0.9F, 0.9F)
                .end()

                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND)
                .rotation(-80, -280, 40)
                .translation(-1, -2, 2.5F)
                .scale(0.9F, 0.9F, 0.9F)
                .end()

                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND)
                .rotation(0, -90, 25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()

                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND)
                .rotation(0, 90, -25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()
                .end()


                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/regwither_bow_pulling_0"), existingFileHelper))
                .end()

                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.65F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/regwither_bow_pulling_1"), existingFileHelper))
                .end()

                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.9F)
                .model(new ModelFile.ExistingModelFile(new ResourceLocation(firstMod.MOD_ID, "item/regwither_bow_pulling_2"), existingFileHelper))
                .end();


    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(firstMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = firstMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(firstMod.MOD_ID,"item/" + item.getId().getPath()));
    }


    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(firstMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(firstMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(firstMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));


    }
    public void simpleFenceItem(RegistryObject<Block> block, ResourceLocation blocktexture) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  blocktexture);
    }


    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(firstMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void simpleButtonItem(RegistryObject<Block> block, ResourceLocation blocktexture) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  blocktexture);
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(firstMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void simpleWallItem(RegistryObject<Block> block, ResourceLocation blocktexture) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  blocktexture);
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(firstMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(firstMod.MOD_ID,"item/" + item.getId().getPath()));
    }

}
