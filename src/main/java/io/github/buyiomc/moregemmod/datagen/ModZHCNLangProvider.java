package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLangProvider extends FabricLanguageProvider {
    public ModZHCNLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RED_GEM, "红宝石");
        translationBuilder.add(ModItems.RED_GEM_POWDER, "红宝石粉末");
        translationBuilder.add(ModItems.RED_GEM_SUGAR, "红宝石糖");
        translationBuilder.add(ModItems.BLACK_GEM, "黑宝石");
        translationBuilder.add(ModItems.BLACK_GEM_POWDER, "黑宝石粉末");
        translationBuilder.add(ModItems.BLACK_GEM_SUGAR, "黑宝石糖");

        translationBuilder.add(ModBlocks.RED_GEM_BLOCK, "红宝石块");
        translationBuilder.add(ModBlocks.RED_GEM_ORE, "红宝石矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_RED_GEM_ORE, "深层红宝石");
        translationBuilder.add(ModBlocks.BLACK_GEM_BLOCK, "黑宝石块");
        translationBuilder.add(ModBlocks.BLACK_GEM_ORE, "黑宝石矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_BLACK_GEM_ORE, "深层黑宝石");

        translationBuilder.add(ModItems.RED_GEM_SWORD, "红宝石剑");
        translationBuilder.add(ModItems.RED_GEM_AXE, "红宝石斧");
        translationBuilder.add(ModItems.RED_GEM_HOE, "红宝石锄");
        translationBuilder.add(ModItems.RED_GEM_PICKAXE, "红宝石镐");
        translationBuilder.add(ModItems.RED_GEM_SHOVEL, "红宝石铲");

        translationBuilder.add(ModItems.BLACK_GEM_SWORD, "黑宝石剑");
        translationBuilder.add(ModItems.BLACK_GEM_AXE, "黑宝石斧");
        translationBuilder.add(ModItems.BLACK_GEM_HOE, "黑宝石锄");
        translationBuilder.add(ModItems.BLACK_GEM_PICKAXE, "黑宝石镐");
        translationBuilder.add(ModItems.BLACK_GEM_SHOVEL, "黑宝石铲");

        translationBuilder.add(ModItems.RED_GEM_HELMET, "红宝石头盔");
        translationBuilder.add(ModItems.RED_GEM_CHESTPLATE, "红宝石胸甲");
        translationBuilder.add(ModItems.RED_GEM_LEGGINGS, "红宝石护腿");
        translationBuilder.add(ModItems.RED_GEM_BOOTS, "红宝石靴子");

        translationBuilder.add(ModItems.BLACK_GEM_HELMET, "黑宝石头盔");
        translationBuilder.add(ModItems.BLACK_GEM_CHESTPLATE, "黑宝石胸甲");
        translationBuilder.add(ModItems.BLACK_GEM_LEGGINGS, "黑宝石护腿");
        translationBuilder.add(ModItems.BLACK_GEM_BOOTS, "黑宝石靴子");

        translationBuilder.add("itemGroup.more_gem_group", "更多宝石");
    }
}
