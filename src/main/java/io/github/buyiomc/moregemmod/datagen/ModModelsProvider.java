package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_GEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RED_GEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_GEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLACK_GEM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RED_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_GEM_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_GEM_SUGAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_GEM_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_GEM_SUGAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_GEM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_GEM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_GEM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_GEM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_GEM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_GEM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_GEM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_GEM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_GEM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_GEM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RED_GEM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RED_GEM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RED_GEM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RED_GEM_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLACK_GEM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLACK_GEM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLACK_GEM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLACK_GEM_BOOTS);
    }
}
