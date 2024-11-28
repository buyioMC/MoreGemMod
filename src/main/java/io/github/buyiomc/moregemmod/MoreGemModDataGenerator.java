package io.github.buyiomc.moregemmod;

import io.github.buyiomc.moregemmod.datagen.*;
import io.github.buyiomc.moregemmod.world.ModConfiguredFeatures;
import io.github.buyiomc.moregemmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class MoreGemModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModENUSLangProvider::new);
		pack.addProvider(ModZHCNLangProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModWorldGen::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
	}
}
