package com.reignbit.modularcompute;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularCompute.MOD_ID);
    public static final RegistryObject<Block> COMPUTER = BLOCKS.register("computer_block", Computer::new);
}
