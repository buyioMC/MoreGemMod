package io.github.buyiomc.moregemmod.world;

import io.github.buyiomc.moregemmod.MoreGemMod;
import io.github.buyiomc.moregemmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_GEM_ORE_KEY = of("red_gem_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_GEM_ORE_KEY = of("black_gem_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreGemMod.MOD_ID, id));
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest DeepslateStoneReplace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overWorldTargetsRedGem = List.of(
                OreFeatureConfig.createTarget(stoneReplace, ModBlocks.RED_GEM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(DeepslateStoneReplace, ModBlocks.DEEPSLATE_RED_GEM_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overWorldTargetsBlackGem = List.of(
                OreFeatureConfig.createTarget(stoneReplace, ModBlocks.BLACK_GEM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(DeepslateStoneReplace, ModBlocks.DEEPSLATE_BLACK_GEM_ORE.getDefaultState())
        );

        register(featureRegisterable, RED_GEM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldTargetsRedGem, 8));
        register(featureRegisterable, BLACK_GEM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldTargetsBlackGem, 16));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> registerable, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config
    ) {
      registerable.register(key, new ConfiguredFeature<FC, F>(feature, config));
    }
}
