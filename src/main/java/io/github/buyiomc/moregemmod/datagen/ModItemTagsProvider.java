package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.item.ModItems;
import io.github.buyiomc.moregemmod.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.GEM_LIST)
                .add(Items.EMERALD)
                .add(ModItems.RED_GEM)
                .add(ModItems.BLACK_GEM);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RED_GEM_HELMET)
                .add(ModItems.RED_GEM_CHESTPLATE)
                .add(ModItems.RED_GEM_LEGGINGS)
                .add(ModItems.RED_GEM_BOOTS);
    }
}
