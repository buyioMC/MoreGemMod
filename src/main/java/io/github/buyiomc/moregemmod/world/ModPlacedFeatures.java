package io.github.buyiomc.moregemmod.world;

import io.github.buyiomc.moregemmod.MoreGemMod;
import io.github.buyiomc.moregemmod.world.tree.ModOrePlacements;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_GEM_ORE_PLACED_KEY = of("red_gem_ore_placed");
    public static final RegistryKey<PlacedFeature> BLACK_GEM_ORE_PLACED_KEY = of("black_gem_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(featureRegisterable, RED_GEM_ORE_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_GEM_ORE_KEY),
                ModOrePlacements.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(featureRegisterable, BLACK_GEM_ORE_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_GEM_ORE_KEY),
                ModOrePlacements.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            List<PlacementModifier> modifiers
    ) {
        featureRegisterable.register(key, new PlacedFeature(feature, List.copyOf(modifiers)));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            PlacementModifier... modifiers
    ) {
        register(featureRegisterable, key, feature, List.of(modifiers));
    }

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreGemMod.MOD_ID, id));
    }
}
