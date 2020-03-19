package drachenbauer32.flattilesmod.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class WoodTileBlockItem extends BlockItem
{

    public WoodTileBlockItem(Block blockIn, Properties builder)
    {
        super(blockIn, builder);
        
    }
    
    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 20;
    }
}
