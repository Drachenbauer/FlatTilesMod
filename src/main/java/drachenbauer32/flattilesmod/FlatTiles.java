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
        List<Item> items = Arrays.asList(FlatTilesItems.blue_concrete_tile_block,
                                         FlatTilesItems.brown_concrete_tile_block,
                                         FlatTilesItems.black_concrete_tile_block);
        
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
            event.getRegistry().registerAll(FlatTilesBlocks.black_concrete_tile_block = new DyableTileBlock("black_concrete_tile_block", DyeColor.BLACK,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLACK).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.blue_concrete_tile_block = new DyableTileBlock("blue_concrete_tile_block", DyeColor.BLUE,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BLUE).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()),
                                            FlatTilesBlocks.brown_concrete_tile_block = new DyableTileBlock("brown_concrete_tile_block", DyeColor.BROWN,
                                            Block.Properties.create(Material.ROCK, MaterialColor.BROWN).sound(SoundType.STONE).
                                            lightValue(0).hardnessAndResistance(1.8f, 9f).variableOpacity()));
        }
        
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(FlatTilesItems.black_concrete_tile_block = new BlockItem(FlatTilesBlocks.black_concrete_tile_block,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName(FlatTilesBlocks.black_concrete_tile_block.getRegistryName()),
                                            FlatTilesItems.blue_concrete_tile_block = new BlockItem(FlatTilesBlocks.blue_concrete_tile_block,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName(FlatTilesBlocks.blue_concrete_tile_block.getRegistryName()),
                                            FlatTilesItems.brown_concrete_tile_block = new BlockItem(FlatTilesBlocks.brown_concrete_tile_block,
                                            new Item.Properties().defaultMaxDamage(0).group(FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).
                                            setNoRepair()).setRegistryName(FlatTilesBlocks.brown_concrete_tile_block.getRegistryName()));
        }
        
    }
}
