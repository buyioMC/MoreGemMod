package io.github.buyiomc.moregemmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RED_GEM_SUGAR = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200), 1).alwaysEdible().build();

        public static final FoodComponent BLACK_GEM_SUGAR = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200), 1).alwaysEdible().build();
}
