package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RED_GEM_BLOCK);
        addDrop(ModBlocks.RED_GEM_ORE, oreDrops(ModBlocks.RED_GEM_ORE, ModItems.RED_GEM));
        addDrop(ModBlocks.DEEPSLATE_RED_GEM_ORE, oreDrops(ModBlocks.DEEPSLATE_RED_GEM_ORE, ModItems.RED_GEM));
        addDrop(ModBlocks.BLACK_GEM_BLOCK);
        addDrop(ModBlocks.BLACK_GEM_ORE, oreDrops(ModBlocks.BLACK_GEM_ORE, ModItems.BLACK_GEM));
        addDrop(ModBlocks.DEEPSLATE_BLACK_GEM_ORE, oreDrops(ModBlocks.DEEPSLATE_BLACK_GEM_ORE, ModItems.BLACK_GEM));
    }
}
