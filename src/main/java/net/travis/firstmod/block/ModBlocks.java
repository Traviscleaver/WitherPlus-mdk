package net.travis.firstmod.block;

import net.minecraft.client.renderer.blockentity.BeaconRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.travis.firstmod.block.custom.ModFlammableRotatedBlock;
import net.travis.firstmod.firstMod;
import net.travis.firstmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.firstmod.block.custom.CustomBeaconBlock;
import net.travis.firstmod.worldgen.biome.surface.ModSurfaceRules;
import net.travis.firstmod.worldgen.tree.SoulTreeGrower;
import terrablender.api.SurfaceRuleManager;

import java.util.function.Supplier;

public class ModBlocks {




    private static void registerSurfaceRules()
    {


    }



    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, firstMod.MOD_ID);




    public static final RegistryObject<Block> WITHER_BLOCK = registerBlock("wither_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_BRICKS)));


    public static final RegistryObject<Block> ENTITY_BEACON = registerBlock("entity_beacon",
            () -> new CustomBeaconBlock(BlockBehaviour.Properties.copy(Blocks.BEACON).dynamicShape()));




    public static final RegistryObject<Block> WITHER_LOG = registerBlock("wither_log",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).strength(3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WITHER_WOOD = registerBlock("wither_wood",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).strength(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SOUL_BLOCK = registerBlock("soul_block",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.MYCELIUM).strength(3f).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> WITHER_STAIRS = registerBlock("wither_stairs",
            () -> new StairBlock(() -> ModBlocks.WITHER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WITHER_SLAB = registerBlock("wither_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WITHER_BUTTON = registerBlock("wither_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> WITHER_PRESSURE_PLATE = registerBlock("wither_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> WITHER_FENCE = registerBlock("wither_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WITHER_FENCE_GATE = registerBlock("wither_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WITHER_WALL = registerBlock("wither_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WITHER_DOOR = registerBlock("wither_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WITHER_TRAPDOOR = registerBlock("wither_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion(), BlockSetType.OAK));



    public static final RegistryObject<Block> SOUL_SAND_BLOCK = registerBlock("soul_sand_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SOIL_BLOCK = registerBlock("soul_soil_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL)));






    public static final RegistryObject<Block> SOUL_SAND_STAIRS = registerBlock("soul_sand_stairs",
            () -> new StairBlock(() -> Blocks.SOUL_SAND.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SAND_SLAB = registerBlock("soul_sand_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SAND_BUTTON = registerBlock("soul_sand__button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> SOUL_SAND_PRESSURE_PLATE = registerBlock("soul_sand_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SOUL_SAND),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> SOUL_SAND_FENCE = registerBlock("soul_sand_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.SOUL_SAND).sound(SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SAND_FENCE_GATE = registerBlock("soul_sand_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> SOUL_SAND_WALL = registerBlock("soul_sand_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.SOUL_SAND)));


    public static final RegistryObject<Block> SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs",
            () -> new StairBlock(() -> Blocks.SOUL_SOIL.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL)));
    public static final RegistryObject<Block> SOUL_SOIL_SLAB = registerBlock("soul_soil_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL)));
    public static final RegistryObject<Block> SOUL_SOIL_BUTTON = registerBlock("soul_soil_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> SOUL_SOIL_PRESSURE_PLATE = registerBlock("soul_soil_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> SOUL_SOIL_FENCE = registerBlock("soul_soil_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL).sound(SoundType.SOUL_SOIL)));
    public static final RegistryObject<Block> SOUL_SOIL_FENCE_GATE = registerBlock("soul_soil_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> SOUL_SOIL_WALL = registerBlock("soul_soil_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).sound(SoundType.SOUL_SOIL)));









    public static final RegistryObject<Block> CATMINT = registerBlock("catmint",
            () -> new FlowerBlock(() -> MobEffects.LUCK,5,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CATMINT = BLOCKS.register("potted_catmint",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CATMINT,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> WITHER_SAPLING = registerBlock("wither_sapling",
            () -> new SaplingBlock(new SoulTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> STRIPPED_WITHER_LOG = registerBlock("stripped_wither_log",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM).strength(3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_WITHER_WOOD = registerBlock("stripped_wither_wood",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).strength(3f).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> WITHER_SHARD_ORE = registerBlock("wither_shard_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(), UniformInt.of(1,1)));



    public static final RegistryObject<Block> WITHER_PLANKS = registerBlock("wither_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)){
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
            });
    public static final RegistryObject<Block> WITHER_LEAVES = registerBlock("wither_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
            });




    public static<T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
