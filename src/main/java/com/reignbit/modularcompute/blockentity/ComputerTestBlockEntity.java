package com.reignbit.modularcompute.blockentity;

import com.reignbit.modularcompute.ModBlockEntities;
import com.reignbit.modularcompute.ModularCompute;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ComputerTestBlockEntity extends BlockEntity {
    public ComputerTestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COMPUTER.get(), pos, state);
    }

    public static <T extends BlockEntity> void tick(Level level, BlockPos blockPos, BlockState blockState, T t) {
        ModularCompute.LOGGER.info("Hello?");
    }
}
