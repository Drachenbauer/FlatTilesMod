package drachenbauer32.flattilesmod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import drachenbauer32.flattilesmod.blocks.DyableTileBlock;
import drachenbauer32.flattilesmod.blocks.GlazedTerracottaTileBlock;
import drachenbauer32.flattilesmod.blocks.RotatebleWoodTileBlock;
import drachenbauer32.flattilesmod.blocks.TileBlock;
import drachenbauer32.flattilesmod.init.FlatTilesBlocks;
import drachenbauer32.flattilesmod.init.FlatTilesItems;
import drachenbauer32.flattilesmod.items.WoodTileBlockItem;
import drachenbauer32.flattilesmod.util.FlatTilesItemGroup;
import drachenbauer32.flattilesmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class FlatTiles
{   
    public static Comparator<ItemStack> itemSorter;
    
    public FlatTiles() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        List<Item> items = Arrays.asList(FlatTilesItems.acacia_log_tile,
                                         FlatTilesItems.acacia_wood_tile,
                                         FlatTilesItems.stripped_acacia_log_tile,
                                         FlatTilesItems.stripped_acacia_wood_tile,
                                         FlatTilesItems.acacia_planks_tile,
                                         FlatTilesItems.birch_log_tile,
                                         FlatTilesItems.birch_wood_tile,
                                         FlatTilesItems.stripped_birch_log_tile,
                                         FlatTilesItems.stripped_birch_wood_tile,
                                         FlatTilesItems.birch_planks_tile,
                                         FlatTilesItems.dark_oak_log_tile,
                                         FlatTilesItems.dark_oak_wood_tile,
                                         FlatTilesItems.stripped_dark_oak_log_tile,
                                         FlatTilesItems.stripped_dark_oak_wood_tile,
                                         FlatTilesItems.dark_oak_planks_tile,
                                         FlatTilesItems.jungle_log_tile,
                                         FlatTilesItems.jungle_wood_tile,
                                         FlatTilesItems.stripped_jungle_log_tile,
                                         FlatTilesItems.stripped_jungle_wood_tile,
                                         FlatTilesItems.jungle_planks_tile,
                                         FlatTilesItems.oak_log_tile,
                                         FlatTilesItems.oak_wood_tile,
                                         FlatTilesItems.stripped_oak_log_tile,
                                         FlatTilesItems.stripped_oak_wood_tile,
                                         FlatTilesItems.oak_planks_tile,
                                         FlatTilesItems.spruce_log_tile,
                                         FlatTilesItems.spruce_wood_tile,
                                         FlatTilesItems.stripped_spruce_log_tile,
                                         FlatTilesItems.stripped_spruce_wood_tile,
                                         FlatTilesItems.spruce_planks_tile,
                                         
                                         FlatTilesItems.stone_tile,
                                         FlatTilesItems.granite_tile,
                                         FlatTilesItems.polished_granite_tile,
                                         FlatTilesItems.diorite_tile,
                                         FlatTilesItems.polished_diorite_tile,
                                         FlatTilesItems.andesite_tile,
                                         FlatTilesItems.polished_andesite_tile,
                                         FlatTilesItems.cobblestone_tile,
                                         FlatTilesItems.smooth_quartz_tile,
                                         FlatTilesItems.smooth_red_sandstone_tile,
                                         FlatTilesItems.smooth_sandstone_tile,
                                         FlatTilesItems.smooth_stone_tile,
                                         FlatTilesItems.brick_tile,
                                         FlatTilesItems.mossy_cobblestone_tile,
                                         FlatTilesItems.purpur_tile,
                                         FlatTilesItems.stone_brick_tile,
                                         FlatTilesItems.mossy_stone_brick_tile,
                                         FlatTilesItems.nether_brick_tile,
                                         FlatTilesItems.end_stone_brick_tile,
                                         FlatTilesItems.quartz_tile,
                                         FlatTilesItems.prismarine_tile,
                                         FlatTilesItems.prismarine_brick_tile,
                                         FlatTilesItems.dark_prismarine_tile,
                                         FlatTilesItems.red_nether_brick_tile,
                                         
                                         FlatTilesItems.red_concrete_tile,
                                         FlatTilesItems.orange_concrete_tile,
                                         FlatTilesItems.yellow_concrete_tile,
                                         FlatTilesItems.lime_concrete_tile,
                                         FlatTilesItems.cyan_concrete_tile,
                                         FlatTilesItems.blue_concrete_tile,
                                         FlatTilesItems.purple_concrete_tile,
                                         FlatTilesItems.magenta_concrete_tile,
                                         FlatTilesItems.pink_concrete_tile,
                                         FlatTilesItems.light_blue_concrete_tile,
                                         FlatTilesItems.green_concrete_tile,
                                         FlatTilesItems.brown_concrete_tile,
                                         FlatTilesItems.black_concrete_tile,
                                         FlatTilesItems.gray_concrete_tile,
                                         FlatTilesItems.light_gray_concrete_tile,
                                         FlatTilesItems.white_concrete_tile,
                                         FlatTilesItems.red_terracotta_tile,
                                         FlatTilesItems.orange_terracotta_tile,
                                         FlatTilesItems.yellow_terracotta_tile,
                                         FlatTilesItems.lime_terracotta_tile,
                                         FlatTilesItems.cyan_terracotta_tile,
                                         FlatTilesItems.blue_terracotta_tile,
                                         FlatTilesItems.purple_terracotta_tile,
                                         FlatTilesItems.magenta_terracotta_tile,
                                         FlatTilesItems.pink_terracotta_tile,
                                         FlatTilesItems.light_blue_terracotta_tile,
                                         FlatTilesItems.green_terracotta_tile,
                                         FlatTilesItems.brown_terracotta_tile,
                                         FlatTilesItems.black_terracotta_tile,
                                         FlatTilesItems.gray_terracotta_tile,
                                         FlatTilesItems.light_gray_terracotta_tile,
                                         FlatTilesItems.white_terracotta_tile,
                                         FlatTilesItems.red_glazed_terracotta_tile,
                                         FlatTilesItems.orange_glazed_terracotta_tile,
                                         FlatTilesItems.yellow_glazed_terracotta_tile,
                                         FlatTilesItems.lime_glazed_terracotta_tile,
                                         FlatTilesItems.cyan_glazed_terracotta_tile,
                                         FlatTilesItems.blue_glazed_terracotta_tile,
                                         FlatTilesItems.purple_glazed_terracotta_tile,
                                         FlatTilesItems.magenta_glazed_terracotta_tile,
                                         FlatTilesItems.pink_glazed_terracotta_tile,
                                         FlatTilesItems.light_blue_glazed_terracotta_tile,
                                         FlatTilesItems.green_glazed_terracotta_tile,
                                         FlatTilesItems.brown_glazed_terracotta_tile,
                                         FlatTilesItems.black_glazed_terracotta_tile,
                                         FlatTilesItems.gray_glazed_terracotta_tile,
                                         FlatTilesItems.light_gray_glazed_terracotta_tile,
                                         FlatTilesItems.white_glazed_terracotta_tile);
        
        itemSorter = Ordering.explicit(items).onResultOf(ItemStack::getItem);
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        
    }
    
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        public static final ItemGroup FLAT_TILES = new FlatTilesItemGroup();
        
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(FlatTilesBlocks.acacia_log_tile = new TileBlock("acacia_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.birch_log_tile = new TileBlock("birch_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.dark_oak_log_tile = new TileBlock("dark_oak_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.jungle_log_tile = new TileBlock("jungle_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.oak_log_tile = new TileBlock("oak_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.spruce_log_tile = new TileBlock("spruce_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.acacia_wood_tile = new RotatebleWoodTileBlock("acacia_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.STONE).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.birch_wood_tile = new RotatebleWoodTileBlock("birch_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.QUARTZ).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.dark_oak_wood_tile = new RotatebleWoodTileBlock("dark_oak_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.jungle_wood_tile = new RotatebleWoodTileBlock("jungle_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.oak_wood_tile = new RotatebleWoodTileBlock("oak_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.spruce_wood_tile = new RotatebleWoodTileBlock("spruce_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_acacia_log_tile = new TileBlock("stripped_acacia_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_birch_log_tile = new TileBlock("stripped_birch_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_dark_oak_log_tile = new TileBlock("stripped_dark_oak_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_jungle_log_tile = new TileBlock("stripped_jungle_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_oak_log_tile = new TileBlock("stripped_oak_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_spruce_log_tile = new TileBlock("stripped_spruce_log_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_acacia_wood_tile = new RotatebleWoodTileBlock("stripped_acacia_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_birch_wood_tile = new RotatebleWoodTileBlock("stripped_birch_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_dark_oak_wood_tile = new RotatebleWoodTileBlock("stripped_dark_oak_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_jungle_wood_tile = new RotatebleWoodTileBlock("stripped_jungle_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_oak_wood_tile = new RotatebleWoodTileBlock("stripped_oak_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F).variableOpacity()),
                                            FlatTilesBlocks.stripped_spruce_wood_tile = new RotatebleWoodTileBlock("stripped_spruce_wood_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.acacia_planks_tile = new TileBlock("acacia_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.birch_planks_tile = new TileBlock("birch_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.dark_oak_planks_tile = new TileBlock("dark_oak_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.jungle_planks_tile = new TileBlock("jungle_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.oak_planks_tile = new TileBlock("oak_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            FlatTilesBlocks.spruce_planks_tile = new TileBlock("spruce_planks_tile",
                                            Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).sound(SoundType.WOOD).
                                            lightValue(0).hardnessAndResistance(2.0F, 3.0F).variableOpacity()),
                                            
                                            FlatTilesBlocks.andesite_tile = new TileBlock("andesite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.STONE).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.brick_tile = new TileBlock("brick_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.RED).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.cobblestone_tile = new TileBlock("cobblestone_tile",
                                            Block.Properties.create(Material.ROCK).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.dark_prismarine_tile = new TileBlock("dark_prismarine_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.diorite_tile = new TileBlock("diorite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.end_stone_brick_tile = new TileBlock("end_stone_brick_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.SAND).
                                            lightValue(0).hardnessAndResistance(3.0F, 9.0F).variableOpacity()),
                                            FlatTilesBlocks.granite_tile = new TileBlock("granite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.DIRT).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.mossy_cobblestone_tile = new TileBlock("mossy_cobblestone_tile",
                                            Block.Properties.create(Material.ROCK).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.mossy_stone_brick_tile = new TileBlock("mossy_stone_brick_tile",
                                            Block.Properties.create(Material.ROCK).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.nether_brick_tile = new TileBlock("nether_brick_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.polished_andesite_tile = new TileBlock("polished_andesite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.STONE).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.polished_diorite_tile = new TileBlock("polished_diorite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.polished_granite_tile = new TileBlock("polished_granite_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.DIRT).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.prismarine_brick_tile = new TileBlock("prismarine_brick_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.prismarine_tile = new TileBlock("prismarine_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.CYAN).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.purpur_tile = new TileBlock("purpur_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.quartz_tile = new TileBlock("quartz_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).
                                            lightValue(0).hardnessAndResistance(0.8F).variableOpacity()),
                                            FlatTilesBlocks.red_nether_brick_tile = new TileBlock("red_nether_brick_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.smooth_quartz_tile = new TileBlock("smooth_quartz_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.smooth_red_sandstone_tile = new TileBlock("smooth_red_sandstone_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.smooth_sandstone_tile = new TileBlock("smooth_sandstone_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.SAND).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.smooth_stone_tile = new TileBlock("smooth_stone_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.STONE).
                                            lightValue(0).hardnessAndResistance(2.0F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.stone_brick_tile = new TileBlock("stone_brick_tile",
                                            Block.Properties.create(Material.ROCK).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            FlatTilesBlocks.stone_tile = new TileBlock("stone_tile",
                                            Block.Properties.create(Material.ROCK, MaterialColor.STONE).
                                            lightValue(0).hardnessAndResistance(1.5F, 6.0F).variableOpacity()),
                                            
                                            FlatTilesBlocks.black_concrete_tile = new DyableTileBlock("black_concrete_tile", DyeColor.BLACK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLACK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.blue_concrete_tile = new DyableTileBlock("blue_concrete_tile", DyeColor.BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.brown_concrete_tile = new DyableTileBlock("brown_concrete_tile", DyeColor.BROWN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BROWN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.cyan_concrete_tile = new DyableTileBlock("cyan_concrete_tile", DyeColor.CYAN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.CYAN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.gray_concrete_tile = new DyableTileBlock("gray_concrete_tile", DyeColor.GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.green_concrete_tile = new DyableTileBlock("green_concrete_tile", DyeColor.GREEN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GREEN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.light_blue_concrete_tile = new DyableTileBlock("light_blue_concrete_tile", DyeColor.LIGHT_BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.light_gray_concrete_tile = new DyableTileBlock("light_gray_concrete_tile", DyeColor.LIGHT_GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.lime_concrete_tile = new DyableTileBlock("lime_concrete_tile", DyeColor.LIME,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIME).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.magenta_concrete_tile = new DyableTileBlock("magenta_concrete_tile", DyeColor.MAGENTA,
                                            Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.orange_concrete_tile = new DyableTileBlock("orange_concrete_tile", DyeColor.ORANGE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.pink_concrete_tile = new DyableTileBlock("pink_concrete_tile", DyeColor.PINK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PINK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.purple_concrete_tile = new DyableTileBlock("purple_concrete_tile", DyeColor.PURPLE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.red_concrete_tile = new DyableTileBlock("red_concrete_tile", DyeColor.RED,
                                            Block.Properties.create(Material.ROCK, MaterialColor.RED).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.white_concrete_tile = new DyableTileBlock("white_concrete_tile", DyeColor.WHITE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.SNOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.yellow_concrete_tile = new DyableTileBlock("yellow_concrete_tile", DyeColor.YELLOW,
                                            Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8F).variableOpacity()),
                                            FlatTilesBlocks.black_terracotta_tile = new DyableTileBlock("black_terracotta_tile", DyeColor.BLACK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.blue_terracotta_tile = new DyableTileBlock("blue_terracotta_tile", DyeColor.BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.brown_terracotta_tile = new DyableTileBlock("brown_terracotta_tile", DyeColor.BROWN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.cyan_terracotta_tile = new DyableTileBlock("cyan_terracotta_tile", DyeColor.CYAN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.gray_terracotta_tile = new DyableTileBlock("gray_terracotta_tile", DyeColor.GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.green_terracotta_tile = new DyableTileBlock("green_terracotta_tile", DyeColor.GREEN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.light_blue_terracotta_tile = new DyableTileBlock("light_blue_terracotta_tile", DyeColor.LIGHT_BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.light_gray_terracotta_tile = new DyableTileBlock("light_gray_terracotta_tile", DyeColor.LIGHT_GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.lime_terracotta_tile = new DyableTileBlock("lime_terracotta_tile", DyeColor.LIME,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.magenta_terracotta_tile = new DyableTileBlock("magenta_terracotta_tile", DyeColor.MAGENTA,
                                            Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.orange_terracotta_tile = new DyableTileBlock("orange_terracotta_tile", DyeColor.ORANGE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.pink_terracotta_tile = new DyableTileBlock("pink_terracotta_tile", DyeColor.PINK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.purple_terracotta_tile = new DyableTileBlock("purple_terracotta_tile", DyeColor.PURPLE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.red_terracotta_tile = new DyableTileBlock("red_terracotta_tile", DyeColor.RED,
                                            Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.white_terracotta_tile = new DyableTileBlock("white_terracotta_tile", DyeColor.WHITE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.yellow_terracotta_tile = new DyableTileBlock("yellow_terracotta_tile", DyeColor.YELLOW,
                                            Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.25F, 4.2F).variableOpacity()),
                                            FlatTilesBlocks.black_glazed_terracotta_tile = new GlazedTerracottaTileBlock("black_glazed_terracotta_tile", DyeColor.BLACK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLACK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.blue_glazed_terracotta_tile = new GlazedTerracottaTileBlock("blue_glazed_terracotta_tile", DyeColor.BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.brown_glazed_terracotta_tile = new GlazedTerracottaTileBlock("brown_glazed_terracotta_tile", DyeColor.BROWN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BROWN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.cyan_glazed_terracotta_tile = new GlazedTerracottaTileBlock("cyan_glazed_terracotta_tile", DyeColor.CYAN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.CYAN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.gray_glazed_terracotta_tile = new GlazedTerracottaTileBlock("gray_glazed_terracotta_tile", DyeColor.GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.green_glazed_terracotta_tile = new GlazedTerracottaTileBlock("green_glazed_terracotta_tile", DyeColor.GREEN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GREEN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.light_blue_glazed_terracotta_tile = new GlazedTerracottaTileBlock("light_blue_glazed_terracotta_tile", DyeColor.LIGHT_BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.light_gray_glazed_terracotta_tile = new GlazedTerracottaTileBlock("light_gray_glazed_terracotta_tile", DyeColor.LIGHT_GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.lime_glazed_terracotta_tile = new GlazedTerracottaTileBlock("lime_glazed_terracotta_tile", DyeColor.LIME,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIME).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.magenta_glazed_terracotta_tile = new GlazedTerracottaTileBlock("magenta_glazed_terracotta_tile", DyeColor.MAGENTA,
                                            Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.orange_glazed_terracotta_tile = new GlazedTerracottaTileBlock("orange_glazed_terracotta_tile", DyeColor.ORANGE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.pink_glazed_terracotta_tile = new GlazedTerracottaTileBlock("pink_glazed_terracotta_tile", DyeColor.PINK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PINK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.purple_glazed_terracotta_tile = new GlazedTerracottaTileBlock("purple_glazed_terracotta_tile", DyeColor.PURPLE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.red_glazed_terracotta_tile = new GlazedTerracottaTileBlock("red_glazed_terracotta_tile", DyeColor.RED,
                                            Block.Properties.create(Material.ROCK, MaterialColor.RED).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.white_glazed_terracotta_tile = new GlazedTerracottaTileBlock("white_glazed_terracotta_tile", DyeColor.WHITE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.SNOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()),
                                            FlatTilesBlocks.yellow_glazed_terracotta_tile = new GlazedTerracottaTileBlock("yellow_glazed_terracotta_tile", DyeColor.YELLOW,
                                            Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.4F).variableOpacity()));
        }
        
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(FlatTilesItems.acacia_log_tile = new WoodTileBlockItem(FlatTilesBlocks.acacia_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("acacia_log_tile"),
                                            FlatTilesItems.birch_log_tile = new WoodTileBlockItem(FlatTilesBlocks.birch_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("birch_log_tile"),
                                            FlatTilesItems.dark_oak_log_tile = new WoodTileBlockItem(FlatTilesBlocks.dark_oak_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("dark_oak_log_tile"),
                                            FlatTilesItems.jungle_log_tile = new WoodTileBlockItem(FlatTilesBlocks.jungle_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("jungle_log_tile"),
                                            FlatTilesItems.oak_log_tile = new WoodTileBlockItem(FlatTilesBlocks.oak_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("oak_log_tile"),
                                            FlatTilesItems.spruce_log_tile = new WoodTileBlockItem(FlatTilesBlocks.spruce_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("spruce_log_tile"),
                                            FlatTilesItems.acacia_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.acacia_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("acacia_wood_tile"),
                                            FlatTilesItems.birch_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.birch_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("birch_wood_tile"),
                                            FlatTilesItems.dark_oak_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.dark_oak_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("dark_oak_wood_tile"),
                                            FlatTilesItems.jungle_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.jungle_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("jungle_wood_tile"),
                                            FlatTilesItems.oak_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.oak_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("oak_wood_tile"),
                                            FlatTilesItems.spruce_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.spruce_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("spruce_wood_tile"),
                                            FlatTilesItems.stripped_acacia_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_acacia_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_acacia_log_tile"),
                                            FlatTilesItems.stripped_birch_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_birch_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_birch_log_tile"),
                                            FlatTilesItems.stripped_dark_oak_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_dark_oak_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_dark_oak_log_tile"),
                                            FlatTilesItems.stripped_jungle_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_jungle_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_jungle_log_tile"),
                                            FlatTilesItems.stripped_oak_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_oak_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_oak_log_tile"),
                                            FlatTilesItems.stripped_spruce_log_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_spruce_log_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_spruce_log_tile"),
                                            FlatTilesItems.stripped_acacia_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_acacia_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_acacia_wood_tile"),
                                            FlatTilesItems.stripped_birch_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_birch_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_birch_wood_tile"),
                                            FlatTilesItems.stripped_dark_oak_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_dark_oak_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_dark_oak_wood_tile"),
                                            FlatTilesItems.stripped_jungle_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_jungle_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_jungle_wood_tile"),
                                            FlatTilesItems.stripped_oak_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_oak_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_oak_wood_tile"),
                                            FlatTilesItems.stripped_spruce_wood_tile = new WoodTileBlockItem(FlatTilesBlocks.stripped_spruce_wood_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stripped_spruce_wood_tile"),
                                            FlatTilesItems.acacia_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.acacia_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("acacia_planks_tile"),
                                            FlatTilesItems.birch_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.birch_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("birch_planks_tile"),
                                            FlatTilesItems.dark_oak_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.dark_oak_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("dark_oak_planks_tile"),
                                            FlatTilesItems.jungle_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.jungle_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("jungle_planks_tile"),
                                            FlatTilesItems.oak_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.oak_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("oak_planks_tile"),
                                            FlatTilesItems.spruce_planks_tile = new WoodTileBlockItem(FlatTilesBlocks.spruce_planks_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("spruce_planks_tile"),
                                            
                                            FlatTilesItems.andesite_tile = new BlockItem(FlatTilesBlocks.andesite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("andesite_tile"),
                                            FlatTilesItems.brick_tile = new BlockItem(FlatTilesBlocks.brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("brick_tile"),
                                            FlatTilesItems.cobblestone_tile = new BlockItem(FlatTilesBlocks.cobblestone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("cobblestone_tile"),
                                            FlatTilesItems.dark_prismarine_tile = new BlockItem(FlatTilesBlocks.dark_prismarine_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("dark_prismarine_tile"),
                                            FlatTilesItems.diorite_tile = new BlockItem(FlatTilesBlocks.diorite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("diorite_tile"),
                                            FlatTilesItems.end_stone_brick_tile = new BlockItem(FlatTilesBlocks.end_stone_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("end_stone_brick_tile"),
                                            FlatTilesItems.granite_tile = new BlockItem(FlatTilesBlocks.granite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("granite_tile"),
                                            FlatTilesItems.mossy_cobblestone_tile = new BlockItem(FlatTilesBlocks.mossy_cobblestone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("mossy_cobblestone_tile"),
                                            FlatTilesItems.mossy_stone_brick_tile = new BlockItem(FlatTilesBlocks.mossy_stone_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("mossy_stone_brick_tile"),
                                            FlatTilesItems.nether_brick_tile = new BlockItem(FlatTilesBlocks.nether_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("nether_brick_tile"),
                                            FlatTilesItems.polished_andesite_tile = new BlockItem(FlatTilesBlocks.polished_andesite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("polished_andesite_tile"),
                                            FlatTilesItems.polished_diorite_tile = new BlockItem(FlatTilesBlocks.polished_diorite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("polished_diorite_tile"),
                                            FlatTilesItems.polished_granite_tile = new BlockItem(FlatTilesBlocks.polished_granite_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("polished_granite_tile"),
                                            FlatTilesItems.prismarine_brick_tile = new BlockItem(FlatTilesBlocks.prismarine_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("prismarine_brick_tile"),
                                            FlatTilesItems.prismarine_tile = new BlockItem(FlatTilesBlocks.prismarine_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("prismarine_tile"),
                                            FlatTilesItems.purpur_tile = new BlockItem(FlatTilesBlocks.purpur_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("purpur_tile"),
                                            FlatTilesItems.quartz_tile = new BlockItem(FlatTilesBlocks.quartz_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("quartz_tile"),
                                            FlatTilesItems.red_nether_brick_tile = new BlockItem(FlatTilesBlocks.red_nether_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("red_nether_brick_tile"),
                                            FlatTilesItems.smooth_quartz_tile = new BlockItem(FlatTilesBlocks.smooth_quartz_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("smooth_quartz_tile"),
                                            FlatTilesItems.smooth_red_sandstone_tile = new BlockItem(FlatTilesBlocks.smooth_red_sandstone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("smooth_red_sandstone_tile"),
                                            FlatTilesItems.smooth_sandstone_tile = new BlockItem(FlatTilesBlocks.smooth_sandstone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("smooth_sandstone_tile"),
                                            FlatTilesItems.smooth_stone_tile = new BlockItem(FlatTilesBlocks.smooth_stone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("smooth_stone_tile"),
                                            FlatTilesItems.stone_brick_tile = new BlockItem(FlatTilesBlocks.stone_brick_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stone_brick_tile"),
                                            FlatTilesItems.stone_tile = new BlockItem(FlatTilesBlocks.stone_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("stone_tile"),
                                            
                                            FlatTilesItems.black_concrete_tile = new BlockItem(FlatTilesBlocks.black_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("black_concrete_tile"),
                                            FlatTilesItems.blue_concrete_tile = new BlockItem(FlatTilesBlocks.blue_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("blue_concrete_tile"),
                                            FlatTilesItems.brown_concrete_tile = new BlockItem(FlatTilesBlocks.brown_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("brown_concrete_tile"),
                                            FlatTilesItems.cyan_concrete_tile = new BlockItem(FlatTilesBlocks.cyan_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("cyan_concrete_tile"),
                                            FlatTilesItems.gray_concrete_tile = new BlockItem(FlatTilesBlocks.gray_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("gray_concrete_tile"),
                                            FlatTilesItems.green_concrete_tile = new BlockItem(FlatTilesBlocks.green_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("green_concrete_tile"),
                                            FlatTilesItems.light_blue_concrete_tile = new BlockItem(FlatTilesBlocks.light_blue_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_blue_concrete_tile"),
                                            FlatTilesItems.light_gray_concrete_tile = new BlockItem(FlatTilesBlocks.light_gray_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_gray_concrete_tile"),
                                            FlatTilesItems.lime_concrete_tile = new BlockItem(FlatTilesBlocks.lime_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("lime_concrete_tile"),
                                            FlatTilesItems.magenta_concrete_tile = new BlockItem(FlatTilesBlocks.magenta_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("magenta_concrete_tile"),
                                            FlatTilesItems.orange_concrete_tile = new BlockItem(FlatTilesBlocks.orange_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("orange_concrete_tile"),
                                            FlatTilesItems.pink_concrete_tile = new BlockItem(FlatTilesBlocks.pink_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("pink_concrete_tile"),
                                            FlatTilesItems.purple_concrete_tile = new BlockItem(FlatTilesBlocks.purple_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("purple_concrete_tile"),
                                            FlatTilesItems.red_concrete_tile = new BlockItem(FlatTilesBlocks.red_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("red_concrete_tile"),
                                            FlatTilesItems.white_concrete_tile = new BlockItem(FlatTilesBlocks.white_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("white_concrete_tile"),
                                            FlatTilesItems.yellow_concrete_tile = new BlockItem(FlatTilesBlocks.yellow_concrete_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("yellow_concrete_tile"),
                                            FlatTilesItems.black_terracotta_tile = new BlockItem(FlatTilesBlocks.black_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("black_terracotta_tile"),
                                            FlatTilesItems.blue_terracotta_tile = new BlockItem(FlatTilesBlocks.blue_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("blue_terracotta_tile"),
                                            FlatTilesItems.brown_terracotta_tile = new BlockItem(FlatTilesBlocks.brown_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("brown_terracotta_tile"),
                                            FlatTilesItems.cyan_terracotta_tile = new BlockItem(FlatTilesBlocks.cyan_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("cyan_terracotta_tile"),
                                            FlatTilesItems.gray_terracotta_tile = new BlockItem(FlatTilesBlocks.gray_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("gray_terracotta_tile"),
                                            FlatTilesItems.green_terracotta_tile = new BlockItem(FlatTilesBlocks.green_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("green_terracotta_tile"),
                                            FlatTilesItems.light_blue_terracotta_tile = new BlockItem(FlatTilesBlocks.light_blue_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_blue_terracotta_tile"),
                                            FlatTilesItems.light_gray_terracotta_tile = new BlockItem(FlatTilesBlocks.light_gray_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_gray_terracotta_tile"),
                                            FlatTilesItems.lime_terracotta_tile = new BlockItem(FlatTilesBlocks.lime_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("lime_terracotta_tile"),
                                            FlatTilesItems.magenta_terracotta_tile = new BlockItem(FlatTilesBlocks.magenta_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("magenta_terracotta_tile"),
                                            FlatTilesItems.orange_terracotta_tile = new BlockItem(FlatTilesBlocks.orange_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("orange_terracotta_tile"),
                                            FlatTilesItems.pink_terracotta_tile = new BlockItem(FlatTilesBlocks.pink_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("pink_terracotta_tile"),
                                            FlatTilesItems.purple_terracotta_tile = new BlockItem(FlatTilesBlocks.purple_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("purple_terracotta_tile"),
                                            FlatTilesItems.red_terracotta_tile = new BlockItem(FlatTilesBlocks.red_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("red_terracotta_tile"),
                                            FlatTilesItems.white_terracotta_tile = new BlockItem(FlatTilesBlocks.white_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("white_terracotta_tile"),
                                            FlatTilesItems.yellow_terracotta_tile = new BlockItem(FlatTilesBlocks.yellow_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("yellow_terracotta_tile"),
                                            FlatTilesItems.black_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.black_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("black_glazed_terracotta_tile"),
                                            FlatTilesItems.blue_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.blue_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("blue_glazed_terracotta_tile"),
                                            FlatTilesItems.brown_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.brown_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("brown_glazed_terracotta_tile"),
                                            FlatTilesItems.cyan_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.cyan_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("cyan_glazed_terracotta_tile"),
                                            FlatTilesItems.gray_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.gray_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("gray_glazed_terracotta_tile"),
                                            FlatTilesItems.green_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.green_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("green_glazed_terracotta_tile"),
                                            FlatTilesItems.light_blue_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.light_blue_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_blue_glazed_terracotta_tile"),
                                            FlatTilesItems.light_gray_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.light_gray_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("light_gray_glazed_terracotta_tile"),
                                            FlatTilesItems.lime_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.lime_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("lime_glazed_terracotta_tile"),
                                            FlatTilesItems.magenta_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.magenta_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("magenta_glazed_terracotta_tile"),
                                            FlatTilesItems.orange_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.orange_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("orange_glazed_terracotta_tile"),
                                            FlatTilesItems.pink_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.pink_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("pink_glazed_terracotta_tile"),
                                            FlatTilesItems.purple_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.purple_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("purple_glazed_terracotta_tile"),
                                            FlatTilesItems.red_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.red_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("red_glazed_terracotta_tile"),
                                            FlatTilesItems.white_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.white_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("white_glazed_terracotta_tile"),
                                            FlatTilesItems.yellow_glazed_terracotta_tile = new BlockItem(FlatTilesBlocks.yellow_glazed_terracotta_tile,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName("yellow_glazed_terracotta_tile"));
        }
    }
}
