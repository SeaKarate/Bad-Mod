//package com.kjchillin.template.block.custom;
//
//import com.mojang.serialization.MapCodec;
//import net.minecraft.block.*;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.shape.VoxelShape;
//import net.minecraft.world.BlockView;
//import org.jetbrains.annotations.Nullable;
//
//public class GamemodeChangerBlock extends BlockWithEntity implements BlockEntityProvider {
//    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,13,16)
//    public GamemodeChangerBlock(Settings settings) {
//        super(settings);
//    }
//    @Override
//    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        return SHAPE;
//    }
//
//    @Override
//    protected BlockRenderType getRenderType(BlockState state) {
//        return BlockRenderType.MODEL;
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
//        return
//    }
//
//    @Override
//    protected MapCodec<? extends BlockWithEntity> getCodec() {
//        return null;
//    }
//}
