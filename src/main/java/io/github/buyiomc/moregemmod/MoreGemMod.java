package io.github.buyiomc.moregemmod;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.datagen.ModWorldGen;
import io.github.buyiomc.moregemmod.item.ModItemGroups;
import io.github.buyiomc.moregemmod.item.ModItems;
import io.github.buyiomc.moregemmod.tags.ModBlockTags;
import io.github.buyiomc.moregemmod.tags.ModItemTags;
import io.github.buyiomc.moregemmod.util.ModCustomTrades;
import io.github.buyiomc.moregemmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGemMod implements ModInitializer {
//	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("moregemmod","ore_custom"));

	public static final String MOD_ID = "moregemmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockTags.registerBlockTags();
		ModItemTags.registerItemTags();
		ModCustomTrades.registerModCustomTrades();

		ModWorldGeneration.registerWorldGenerations();

//		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

		LOGGER.info("Hello Fabric world!");
	}
}