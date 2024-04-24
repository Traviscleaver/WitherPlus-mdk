package net.travis.firstmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.block.ModBlocks;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, firstMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.WITHER_BLOCK);
        blockWithItem(ModBlocks.WITHER_SHARD_ORE);
        saplingBlock(ModBlocks.WITHER_SAPLING);


        simpleBlockWithItem(ModBlocks.CATMINT.get(), models().cross(blockTexture(ModBlocks.CATMINT.get()).getPath(),
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));


        simpleBlockWithItem(ModBlocks.POTTED_CATMINT.get(), models().singleTexture("potted_catmint", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));

        logBlock((RotatedPillarBlock) ModBlocks.WITHER_LOG.get());
        axisBlock(((RotatedPillarBlock) ModBlocks.WITHER_WOOD.get()), blockTexture(ModBlocks.WITHER_LOG.get()), blockTexture(ModBlocks.WITHER_LOG.get()));
        blockWithItem(ModBlocks.WITHER_PLANKS);


        stairsBlock(((StairBlock) ModBlocks.WITHER_STAIRS.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WITHER_SLAB.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.WITHER_BUTTON.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WITHER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.WITHER_FENCE.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WITHER_FENCE_GATE.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.WITHER_WALL.get()), blockTexture(ModBlocks.WITHER_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WITHER_DOOR.get()), modLoc("block/wither_door_bottom"), modLoc("block/wither_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WITHER_TRAPDOOR.get()), modLoc("block/wither_trapdoor"), true, "cutout");


        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WITHER_LOG.get()), blockTexture(ModBlocks.STRIPPED_WITHER_LOG.get()),
                new ResourceLocation(firstMod.MOD_ID, "block/stripped_wither_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WITHER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WITHER_LOG.get()), blockTexture(ModBlocks.STRIPPED_WITHER_LOG.get()));

        blockItem(ModBlocks.WITHER_LOG);
        blockItem(ModBlocks.WITHER_WOOD);
        blockItem(ModBlocks.STRIPPED_WITHER_LOG);
        blockItem(ModBlocks.STRIPPED_WITHER_WOOD);



        leavesBlock(ModBlocks.WITHER_LEAVES);



        buttonBlock(((ButtonBlock) ModBlocks.SOUL_SAND_BUTTON.get()), blockTexture(Blocks.SOUL_SAND));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SOUL_SAND_PRESSURE_PLATE.get()), blockTexture(Blocks.SOUL_SAND));
        fenceBlock(((FenceBlock) ModBlocks.SOUL_SAND_FENCE.get()), blockTexture(Blocks.SOUL_SAND));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SOUL_SAND_FENCE_GATE.get()), blockTexture(Blocks.SOUL_SAND));
        wallBlock(((WallBlock) ModBlocks.SOUL_SAND_WALL.get()), blockTexture(Blocks.SOUL_SAND));
        stairsBlock(((StairBlock) ModBlocks.SOUL_SAND_STAIRS.get()), blockTexture(Blocks.SOUL_SAND));
        slabBlock(((SlabBlock) ModBlocks.SOUL_SAND_SLAB.get()), blockTexture(Blocks.SOUL_SAND), blockTexture(Blocks.SOUL_SAND));


        stairsBlock(((StairBlock) ModBlocks.SOUL_SOIL_STAIRS.get()), blockTexture(Blocks.SOUL_SOIL));
        slabBlock(((SlabBlock) ModBlocks.SOUL_SOIL_SLAB.get()), blockTexture(Blocks.SOUL_SOIL), blockTexture(Blocks.SOUL_SOIL));
        buttonBlock(((ButtonBlock) ModBlocks.SOUL_SOIL_BUTTON.get()), blockTexture(Blocks.SOUL_SOIL));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get()), blockTexture(Blocks.SOUL_SOIL));
        fenceBlock(((FenceBlock) ModBlocks.SOUL_SOIL_FENCE.get()), blockTexture(Blocks.SOUL_SOIL));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SOUL_SOIL_FENCE_GATE.get()), blockTexture(Blocks.SOUL_SOIL));
        wallBlock(((WallBlock) ModBlocks.SOUL_SOIL_WALL.get()), blockTexture(Blocks.SOUL_SOIL));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(firstMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));

    }
}
