package drachenbauer32.flattilesmod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import drachenbauer32.flattilesmod.blocks.DyableTileBlock;
import drachenbauer32.flattilesmod.init.FlatTilesBlocks;
import drachenbauer32.flattilesmod.init.FlatTilesItems;
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
        List<Item> items = Arrays.asList(FlatTilesItems.red_concrete_tile,
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
                                         FlatTilesItems.white_concrete_tile);
        
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
            event.getRegistry().registerAll(FlatTilesBlocks.black_concrete_tile = new DyableTileBlock("black_concrete_tile", DyeColor.BLACK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLACK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.blue_concrete_tile = new DyableTileBlock("blue_concrete_tile", DyeColor.BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.brown_concrete_tile = new DyableTileBlock("brown_concrete_tile", DyeColor.BROWN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BROWN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.cyan_concrete_tile = new DyableTileBlock("cyan_concrete_tile", DyeColor.CYAN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.CYAN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.gray_concrete_tile = new DyableTileBlock("gray_concrete_tile", DyeColor.GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.green_concrete_tile = new DyableTileBlock("green_concrete_tile", DyeColor.GREEN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.GREEN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.light_blue_concrete_tile = new DyableTileBlock("light_blue_concrete_tile", DyeColor.LIGHT_BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.light_gray_concrete_tile = new DyableTileBlock("light_gray_concrete_tile", DyeColor.LIGHT_GRAY,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.lime_concrete_tile = new DyableTileBlock("lime_concrete_tile", DyeColor.LIME,
                                            Block.Properties.create(Material.ROCK, MaterialColor.LIME).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.magenta_concrete_tile = new DyableTileBlock("magenta_concrete_tile", DyeColor.MAGENTA,
                                            Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.orange_concrete_tile = new DyableTileBlock("orange_concrete_tile", DyeColor.ORANGE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.pink_concrete_tile = new DyableTileBlock("pink_concrete_tile", DyeColor.PINK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PINK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.purple_concrete_tile = new DyableTileBlock("purple_concrete_tile", DyeColor.PURPLE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.red_concrete_tile = new DyableTileBlock("red_concrete_tile", DyeColor.RED,
                                            Block.Properties.create(Material.ROCK, MaterialColor.RED).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.white_concrete_tile = new DyableTileBlock("white_concrete_tile", DyeColor.WHITE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.SNOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.yellow_concrete_tile = new DyableTileBlock("yellow_concrete_tile", DyeColor.YELLOW,
                                            Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()));
        }
        
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(FlatTilesItems.black_concrete_tile = new BlockItem(FlatTilesBlocks.black_concrete_tile,
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
                                            setNoRepair()).setRegistryName("yellow_concrete_tile"));
        }
        
    }
}
