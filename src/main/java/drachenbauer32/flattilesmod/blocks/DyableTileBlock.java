package drachenbauer32.flattilesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;

public class DyableTileBlock extends TileBlock
{
    private final DyeColor color;
    
    public DyableTileBlock(String name, DyeColor p_i48290_1_, Block.Properties properties)
    {
        super(name, properties);
        this.color = p_i48290_1_;
    }
    
    public DyeColor getColor()
    {
        return this.color;
    }
}