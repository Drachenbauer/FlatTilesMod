package drachenbauer32.flattilesmod.util;

import drachenbauer32.flattilesmod.FlatTiles;
import drachenbauer32.flattilesmod.init.FlatTilesItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class FlatTilesItemGroup extends ItemGroup
{
    public FlatTilesItemGroup()
    {
        super("flattiles");
    }
    
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(FlatTilesItems.BIRCH_PLANKS_TILE.get());
    }
    
    @Override
    public void fill(NonNullList<ItemStack> itemStacks)
    {
        super.fill(itemStacks);
        itemStacks.sort(FlatTiles.itemSorter);
    }
}
