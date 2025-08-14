package com.reignbit.modularcompute;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularCompute.MOD_ID);
    public static final RegistryObject<Item> COMPUTER = ITEMS.register("computer", () -> new BlockItem(ModBlocks.COMPUTER.get(), new Item.Properties()));
}
