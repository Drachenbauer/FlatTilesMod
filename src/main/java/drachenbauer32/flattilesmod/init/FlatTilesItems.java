package drachenbauer32.flattilesmod.init;

import drachenbauer32.flattilesmod.FlatTiles;
import drachenbauer32.flattilesmod.items.WoodTileBlockItem;
import drachenbauer32.flattilesmod.util.Reference;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FlatTilesItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    public static final RegistryObject<Item> ACACIA_LOG_TILE = ITEMS.register("acacia_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.ACACIA_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BIRCH_LOG_TILE = ITEMS.register("birch_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.BIRCH_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> DARK_OAK_LOG_TILE = ITEMS.register("dark_oak_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.DARK_OAK_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> JUNGLE_LOG_TILE = ITEMS.register("jungle_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.JUNGLE_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> OAK_LOG_TILE = ITEMS.register("oak_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.OAK_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SPRUCE_LOG_TILE = ITEMS.register("spruce_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.SPRUCE_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ACACIA_WOOD_TILE = ITEMS.register("acacia_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.ACACIA_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BIRCH_WOOD_TILE = ITEMS.register("birch_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.BIRCH_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> DARK_OAK_WOOD_TILE = ITEMS.register("dark_oak_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.DARK_OAK_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> JUNGLE_WOOD_TILE = ITEMS.register("jungle_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.JUNGLE_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> OAK_WOOD_TILE = ITEMS.register("oak_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.OAK_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SPRUCE_WOOD_TILE = ITEMS.register("spruce_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.SPRUCE_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_TILE = ITEMS.register("stripped_acacia_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_ACACIA_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_TILE = ITEMS.register("stripped_birch_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_BIRCH_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_TILE = ITEMS.register("stripped_dark_oak_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_DARK_OAK_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_TILE = ITEMS.register("stripped_jungle_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_JUNGLE_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_TILE = ITEMS.register("stripped_oak_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_OAK_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_TILE = ITEMS.register("stripped_spruce_log_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_SPRUCE_LOG_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_WOOD_TILE = ITEMS.register("stripped_acacia_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_ACACIA_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_WOOD_TILE = ITEMS.register("stripped_birch_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_BIRCH_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_WOOD_TILE = ITEMS.register("stripped_dark_oak_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_DARK_OAK_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_WOOD_TILE = ITEMS.register("stripped_jungle_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_JUNGLE_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_OAK_WOOD_TILE = ITEMS.register("stripped_oak_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_OAK_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_WOOD_TILE = ITEMS.register("stripped_spruce_wood_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.STRIPPED_SPRUCE_WOOD_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ACACIA_PLANKS_TILE = ITEMS.register("acacia_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.ACACIA_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BIRCH_PLANKS_TILE = ITEMS.register("birch_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.BIRCH_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_TILE = ITEMS.register("dark_oak_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.DARK_OAK_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> JUNGLE_PLANKS_TILE = ITEMS.register("jungle_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.JUNGLE_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> OAK_PLANKS_TILE = ITEMS.register("oak_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.OAK_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SPRUCE_PLANKS_TILE = ITEMS.register("spruce_planks_tile", () -> new WoodTileBlockItem(FlatTilesBlocks.SPRUCE_PLANKS_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    
    public static final RegistryObject<Item> ANDESITE_TILE = ITEMS.register("andesite_tile", () -> new BlockItem(FlatTilesBlocks.ANDESITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BRICK_TILE = ITEMS.register("brick_tile", () -> new BlockItem(FlatTilesBlocks.BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> COBBLESTONE_TILE = ITEMS.register("cobblestone_tile", () -> new BlockItem(FlatTilesBlocks.COBBLESTONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> DARK_PRISMARINE_TILE = ITEMS.register("dark_prismarine_tile", () -> new BlockItem(FlatTilesBlocks.DARK_PRISMARINE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> DIORITE_TILE = ITEMS.register("diorite_tile", () -> new BlockItem(FlatTilesBlocks.DIORITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> END_STONE_BRICK_TILE = ITEMS.register("end_stone_brick_tile", () -> new BlockItem(FlatTilesBlocks.END_STONE_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRANITE_TILE = ITEMS.register("granite_tile", () -> new BlockItem(FlatTilesBlocks.GRANITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_TILE = ITEMS.register("mossy_cobblestone_tile", () -> new BlockItem(FlatTilesBlocks.MOSSY_COBBLESTONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MOSSY_STONE_BRICK_TILE = ITEMS.register("mossy_stone_brick_tile", () -> new BlockItem(FlatTilesBlocks.MOSSY_STONE_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> NETHER_BRICK_TILE = ITEMS.register("nether_brick_tile", () -> new BlockItem(FlatTilesBlocks.NETHER_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> POLISHED_ANDESITE_TILE = ITEMS.register("polished_andesite_tile", () -> new BlockItem(FlatTilesBlocks.POLISHED_ANDESITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> POLISHED_DIORITE_TILE = ITEMS.register("polished_diorite_tile", () -> new BlockItem(FlatTilesBlocks.POLISHED_DIORITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> POLISHED_GRANITE_TILE = ITEMS.register("polished_granite_tile", () -> new BlockItem(FlatTilesBlocks.POLISHED_GRANITE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PRISMARINE_BRICK_TILE = ITEMS.register("prismarine_brick_tile", () -> new BlockItem(FlatTilesBlocks.PRISMARINE_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PRISMARINE_TILE = ITEMS.register("prismarine_tile", () -> new BlockItem(FlatTilesBlocks.PRISMARINE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPUR_TILE = ITEMS.register("purpur_tile", () -> new BlockItem(FlatTilesBlocks.PURPUR_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> QUARTZ_TILE = ITEMS.register("quartz_tile", () -> new BlockItem(FlatTilesBlocks.QUARTZ_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_NETHER_BRICK_TILE = ITEMS.register("red_nether_brick_tile", () -> new BlockItem(FlatTilesBlocks.RED_NETHER_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_TILE = ITEMS.register("smooth_quartz_tile", () -> new BlockItem(FlatTilesBlocks.SMOOTH_QUARTZ_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SMOOTH_RED_SANDSTONE_TILE = ITEMS.register("smooth_red_sandstone_tile", () -> new BlockItem(FlatTilesBlocks.SMOOTH_RED_SANDSTONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_TILE = ITEMS.register("smooth_sandstone_tile", () -> new BlockItem(FlatTilesBlocks.SMOOTH_SANDSTONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> SMOOTH_STONE_TILE = ITEMS.register("smooth_stone_tile", () -> new BlockItem(FlatTilesBlocks.SMOOTH_STONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STONE_BRICK_TILE = ITEMS.register("stone_brick_tile", () -> new BlockItem(FlatTilesBlocks.STONE_BRICK_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> STONE_TILE = ITEMS.register("stone_tile", () -> new BlockItem(FlatTilesBlocks.STONE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    
    public static final RegistryObject<Item> BLACK_CONCRETE_TILE = ITEMS.register("black_concrete_tile", () -> new BlockItem(FlatTilesBlocks.BLACK_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BLUE_CONCRETE_TILE = ITEMS.register("blue_concrete_tile", () -> new BlockItem(FlatTilesBlocks.BLUE_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BROWN_CONCRETE_TILE = ITEMS.register("brown_concrete_tile", () -> new BlockItem(FlatTilesBlocks.BROWN_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> CYAN_CONCRETE_TILE = ITEMS.register("cyan_concrete_tile", () -> new BlockItem(FlatTilesBlocks.CYAN_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRAY_CONCRETE_TILE = ITEMS.register("gray_concrete_tile", () -> new BlockItem(FlatTilesBlocks.GRAY_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GREEN_CONCRETE_TILE = ITEMS.register("green_concrete_tile", () -> new BlockItem(FlatTilesBlocks.GREEN_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_TILE = ITEMS.register("light_blue_concrete_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_BLUE_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_TILE = ITEMS.register("light_gray_concrete_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_GRAY_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIME_CONCRETE_TILE = ITEMS.register("lime_concrete_tile", () -> new BlockItem(FlatTilesBlocks.LIME_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_TILE = ITEMS.register("magenta_concrete_tile", () -> new BlockItem(FlatTilesBlocks.MAGENTA_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_TILE = ITEMS.register("orange_concrete_tile", () -> new BlockItem(FlatTilesBlocks.ORANGE_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PINK_CONCRETE_TILE = ITEMS.register("pink_concrete_tile", () -> new BlockItem(FlatTilesBlocks.PINK_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_TILE = ITEMS.register("purple_concrete_tile", () -> new BlockItem(FlatTilesBlocks.PURPLE_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_CONCRETE_TILE = ITEMS.register("red_concrete_tile", () -> new BlockItem(FlatTilesBlocks.RED_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> WHITE_CONCRETE_TILE = ITEMS.register("white_concrete_tile", () -> new BlockItem(FlatTilesBlocks.WHITE_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_TILE = ITEMS.register("yellow_concrete_tile", () -> new BlockItem(FlatTilesBlocks.YELLOW_CONCRETE_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    
    public static final RegistryObject<Item> BLACK_TERRACOTTA_TILE = ITEMS.register("black_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BLACK_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_TILE = ITEMS.register("blue_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BLUE_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_TILE = ITEMS.register("brown_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BROWN_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_TILE = ITEMS.register("cyan_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.CYAN_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_TILE = ITEMS.register("gray_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.GRAY_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_TILE = ITEMS.register("green_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.GREEN_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_TILE = ITEMS.register("light_blue_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_BLUE_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_TILE = ITEMS.register("light_gray_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_GRAY_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_TILE = ITEMS.register("lime_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIME_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_TILE = ITEMS.register("magenta_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.MAGENTA_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_TILE = ITEMS.register("orange_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.ORANGE_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_TILE = ITEMS.register("pink_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.PINK_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_TILE = ITEMS.register("purple_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.PURPLE_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_TERRACOTTA_TILE = ITEMS.register("red_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.RED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_TILE = ITEMS.register("white_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.WHITE_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_TILE = ITEMS.register("yellow_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.YELLOW_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_TILE = ITEMS.register("black_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BLACK_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_TILE = ITEMS.register("blue_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BLUE_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_TILE = ITEMS.register("brown_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.BROWN_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_TILE = ITEMS.register("cyan_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.CYAN_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_TILE = ITEMS.register("gray_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.GRAY_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_TILE = ITEMS.register("green_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.GREEN_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_TILE = ITEMS.register("light_blue_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_TILE = ITEMS.register("light_gray_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_TILE = ITEMS.register("lime_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.LIME_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_TILE = ITEMS.register("magenta_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.MAGENTA_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_TILE = ITEMS.register("orange_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.ORANGE_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_TILE = ITEMS.register("pink_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.PINK_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_TILE = ITEMS.register("purple_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.PURPLE_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_TILE = ITEMS.register("red_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.RED_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_TILE = ITEMS.register("white_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.WHITE_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_TILE = ITEMS.register("yellow_glazed_terracotta_tile", () -> new BlockItem(FlatTilesBlocks.YELLOW_GLAZED_TERRACOTTA_TILE.get(),
                        new Item.Properties().defaultMaxDamage(0).group(FlatTiles.FLAT_TILES).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
}
