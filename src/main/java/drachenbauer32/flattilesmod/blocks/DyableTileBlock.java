package drachenbauer32.flattilesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;

public class DyableTileBlock extends TileBlock
{
    private final DyeColor COLOR;
    
    public DyableTileBlock(String name, DyeColor color, Block.Properties properties)
    {
        super(name, properties);
        this.COLOR = color;
    }
    
    public DyeColor getColor()
    {
        return this.COLOR;
    }
}