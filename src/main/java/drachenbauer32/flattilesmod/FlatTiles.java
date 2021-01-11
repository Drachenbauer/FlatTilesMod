package drachenbauer32.flattilesmod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import drachenbauer32.flattilesmod.init.FlatTilesBlocks;
import drachenbauer32.flattilesmod.init.FlatTilesItems;
import drachenbauer32.flattilesmod.util.FlatTilesItemGroup;
import drachenbauer32.flattilesmod.util.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class FlatTiles
{   
    public static final ItemGroup FLAT_TILES = new FlatTilesItemGroup();
    
    public static Comparator<ItemStack> itemSorter;
    
    public FlatTiles() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        
        FlatTilesItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FlatTilesBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        List<Item> items = Arrays.asList(FlatTilesItems.ACACIA_LOG_TILE.get(),
                                         FlatTilesItems.ACACIA_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_ACACIA_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_ACACIA_WOOD_TILE.get(),
                                         FlatTilesItems.ACACIA_PLANKS_TILE.get(),
                                         FlatTilesItems.BIRCH_LOG_TILE.get(),
                                         FlatTilesItems.BIRCH_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_BIRCH_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_BIRCH_WOOD_TILE.get(),
                                         FlatTilesItems.BIRCH_PLANKS_TILE.get(),
                                         FlatTilesItems.DARK_OAK_LOG_TILE.get(),
                                         FlatTilesItems.DARK_OAK_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_DARK_OAK_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_DARK_OAK_WOOD_TILE.get(),
                                         FlatTilesItems.DARK_OAK_PLANKS_TILE.get(),
                                         FlatTilesItems.JUNGLE_LOG_TILE.get(),
                                         FlatTilesItems.JUNGLE_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_JUNGLE_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_JUNGLE_WOOD_TILE.get(),
                                         FlatTilesItems.JUNGLE_PLANKS_TILE.get(),
                                         FlatTilesItems.OAK_LOG_TILE.get(),
                                         FlatTilesItems.OAK_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_OAK_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_OAK_WOOD_TILE.get(),
                                         FlatTilesItems.OAK_PLANKS_TILE.get(),
                                         FlatTilesItems.SPRUCE_LOG_TILE.get(),
                                         FlatTilesItems.SPRUCE_WOOD_TILE.get(),
                                         FlatTilesItems.STRIPPED_SPRUCE_LOG_TILE.get(),
                                         FlatTilesItems.STRIPPED_SPRUCE_WOOD_TILE.get(),
                                         FlatTilesItems.SPRUCE_PLANKS_TILE.get(),
                                         
                                         FlatTilesItems.STONE_TILE.get(),
                                         FlatTilesItems.GRANITE_TILE.get(),
                                         FlatTilesItems.POLISHED_GRANITE_TILE.get(),
                                         FlatTilesItems.DIORITE_TILE.get(),
                                         FlatTilesItems.POLISHED_DIORITE_TILE.get(),
                                         FlatTilesItems.ANDESITE_TILE.get(),
                                         FlatTilesItems.POLISHED_ANDESITE_TILE.get(),
                                         FlatTilesItems.COBBLESTONE_TILE.get(),
                                         FlatTilesItems.SMOOTH_QUARTZ_TILE.get(),
                                         FlatTilesItems.SMOOTH_RED_SANDSTONE_TILE.get(),
                                         FlatTilesItems.SMOOTH_SANDSTONE_TILE.get(),
                                         FlatTilesItems.SMOOTH_STONE_TILE.get(),
                                         FlatTilesItems.BRICK_TILE.get(),
                                         FlatTilesItems.MOSSY_COBBLESTONE_TILE.get(),
                                         FlatTilesItems.PURPUR_TILE.get(),
                                         FlatTilesItems.STONE_BRICK_TILE.get(),
                                         FlatTilesItems.MOSSY_STONE_BRICK_TILE.get(),
                                         FlatTilesItems.NETHER_BRICK_TILE.get(),
                                         FlatTilesItems.END_STONE_BRICK_TILE.get(),
                                         FlatTilesItems.QUARTZ_TILE.get(),
                                         FlatTilesItems.PRISMARINE_TILE.get(),
                                         FlatTilesItems.PRISMARINE_BRICK_TILE.get(),
                                         FlatTilesItems.DARK_PRISMARINE_TILE.get(),
                                         FlatTilesItems.RED_NETHER_BRICK_TILE.get(),
                                         
                                         FlatTilesItems.RED_CONCRETE_TILE.get(),
                                         FlatTilesItems.ORANGE_CONCRETE_TILE.get(),
                                         FlatTilesItems.YELLOW_CONCRETE_TILE.get(),
                                         FlatTilesItems.LIME_CONCRETE_TILE.get(),
                                         FlatTilesItems.CYAN_CONCRETE_TILE.get(),
                                         FlatTilesItems.BLUE_CONCRETE_TILE.get(),
                                         FlatTilesItems.PURPLE_CONCRETE_TILE.get(),
                                         FlatTilesItems.MAGENTA_CONCRETE_TILE.get(),
                                         FlatTilesItems.PINK_CONCRETE_TILE.get(),
                                         FlatTilesItems.LIGHT_BLUE_CONCRETE_TILE.get(),
                                         FlatTilesItems.GREEN_CONCRETE_TILE.get(),
                                         FlatTilesItems.BROWN_CONCRETE_TILE.get(),
                                         FlatTilesItems.BLACK_CONCRETE_TILE.get(),
                                         FlatTilesItems.GRAY_CONCRETE_TILE.get(),
                                         FlatTilesItems.LIGHT_GRAY_CONCRETE_TILE.get(),
                                         FlatTilesItems.WHITE_CONCRETE_TILE.get(),
                                         
                                         FlatTilesItems.RED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.ORANGE_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.YELLOW_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIME_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.CYAN_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BLUE_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.PURPLE_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.MAGENTA_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.PINK_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIGHT_BLUE_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.GREEN_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BROWN_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BLACK_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.GRAY_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIGHT_GRAY_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.WHITE_TERRACOTTA_TILE.get(),
                                         
                                         FlatTilesItems.RED_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.ORANGE_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.YELLOW_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIME_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.CYAN_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BLUE_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.PURPLE_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.MAGENTA_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.PINK_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIGHT_BLUE_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.GREEN_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BROWN_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.BLACK_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.GRAY_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.LIGHT_GRAY_GLAZED_TERRACOTTA_TILE.get(),
                                         FlatTilesItems.WHITE_GLAZED_TERRACOTTA_TILE.get());
        
        itemSorter = Ordering.explicit(items).onResultOf(ItemStack::getItem);
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        
    }
}
