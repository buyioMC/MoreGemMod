package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_GEM_BLOCK)
                .add(ModBlocks.RED_GEM_ORE)
                .add(ModBlocks.DEEPSLATE_RED_GEM_ORE)
                .add(ModBlocks.BLACK_GEM_BLOCK)
                .add(ModBlocks.BLACK_GEM_ORE)
                .add(ModBlocks.DEEPSLATE_BLACK_GEM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RED_GEM_BLOCK)
                .add(ModBlocks.RED_GEM_ORE)
                .add(ModBlocks.DEEPSLATE_RED_GEM_ORE)
                .add(ModBlocks.BLACK_GEM_BLOCK)
                .add(ModBlocks.BLACK_GEM_ORE)
                .add(ModBlocks.DEEPSLATE_BLACK_GEM_ORE);
    }
}
