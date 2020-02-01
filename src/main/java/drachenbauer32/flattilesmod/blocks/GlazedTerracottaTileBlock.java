package drachenbauer32.flattilesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public class GlazedTerracottaTileBlock extends DyableTileBlock
{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    
    public GlazedTerracottaTileBlock(String name, DyeColor p_i48290_1_, Properties properties)
    {
        super(name, p_i48290_1_, properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }
    
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }
    
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    
    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }
}
