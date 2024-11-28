package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLangProvider extends FabricLanguageProvider {
    public ModENUSLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RED_GEM, "Red Gem");
        translationBuilder.add(ModItems.RED_GEM_POWDER, "Red Gem Powder");
        translationBuilder.add(ModItems.RED_GEM_SUGAR, "Red Gem Sugar");
        translationBuilder.add(ModItems.BLACK_GEM, "Black Gem");
        translationBuilder.add(ModItems.BLACK_GEM_POWDER, "Black Gem Powder");
        translationBuilder.add(ModItems.BLACK_GEM_SUGAR, "Black Gem Sugar");

        translationBuilder.add(ModBlocks.RED_GEM_BLOCK, "Red Gem Block");
        translationBuilder.add(ModBlocks.RED_GEM_ORE, "Red Gem Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RED_GEM_ORE, "Deepslate Black Gem Block");
        translationBuilder.add(ModBlocks.BLACK_GEM_BLOCK, "Black Gem Block");
        translationBuilder.add(ModBlocks.BLACK_GEM_ORE, "Black Gem Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_BLACK_GEM_ORE, "Deepslate Black Gem Block");

        translationBuilder.add(ModItems.RED_GEM_SWORD, "Red Gem Sword");
        translationBuilder.add(ModItems.RED_GEM_AXE, "Red Gem Axe");
        translationBuilder.add(ModItems.RED_GEM_HOE, "Red Gem Hoe");
        translationBuilder.add(ModItems.RED_GEM_PICKAXE, "Red Gem Pickaxe");
        translationBuilder.add(ModItems.RED_GEM_SHOVEL, "Red Gem Shovel");

        translationBuilder.add(ModItems.BLACK_GEM_SWORD, "Black Gem Sword");
        translationBuilder.add(ModItems.BLACK_GEM_AXE, "Black Gem Axe");
        translationBuilder.add(ModItems.BLACK_GEM_HOE, "Black Gem Hoe");
        translationBuilder.add(ModItems.BLACK_GEM_PICKAXE, "Black Gem Pickaxe");
        translationBuilder.add(ModItems.BLACK_GEM_SHOVEL, "Black Gem Shovel");

        translationBuilder.add(ModItems.RED_GEM_HELMET, "Red Gem Helmet");
        translationBuilder.add(ModItems.RED_GEM_CHESTPLATE, "Red Gem Chestplate");
        translationBuilder.add(ModItems.RED_GEM_LEGGINGS, "Red Gem Leggings");
        translationBuilder.add(ModItems.RED_GEM_BOOTS, "Red Gem Boots");


        translationBuilder.add(ModItems.BLACK_GEM_HELMET, "Black Gem Helmet");
        translationBuilder.add(ModItems.BLACK_GEM_CHESTPLATE, "Black Gem Chestplate");
        translationBuilder.add(ModItems.BLACK_GEM_LEGGINGS, "Black Gem Leggings");
        translationBuilder.add(ModItems.BLACK_GEM_BOOTS, "Black Gem Boots");

        translationBuilder.add("itemGroup.more_gem_group", "More Gem");
    }
}
