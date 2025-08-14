package com.reignbit.modularcompute;

import com.reignbit.modularcompute.blockentity.ComputerTestBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ModularCompute.MOD_ID);

    public static final RegistryObject<BlockEntityType<ComputerTestBlockEntity>> COMPUTER = ENTITIES.register("computer_test",
            () -> BlockEntityType.Builder.of(ComputerTestBlockEntity::new, ModBlocks.COMPUTER.get()).build(null));
}
