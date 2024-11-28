package io.github.buyiomc.moregemmod.item.custom;

import com.google.common.collect.ImmutableMap;
import io.github.buyiomc.moregemmod.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
//    private static final Map<ArmorMaterial, List<StatusEffectInstance>> map = (new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
//            .put(ModArmorMaterials.RED_GEM.value(), Arrays.asList(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0, false, false,true),
//                    new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0, false, false, true))).build());
private static final Map<ArmorMaterial, List<StatusEffectInstance>> map = new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
        .put(ModArmorMaterials.RED_GEM.value(), Arrays.asList(
                new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0, false, false, true),
                new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0, false, false, true)
        ))
        .put(ModArmorMaterials.BLACK_GEM.value(), Arrays.asList(
                new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 0, false, false, true),
                new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0, false, false, true)
        ))
        .build();


    public ModArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player && hasFullSuitOfArmor(player)) {
            evaluateArmorEffects(player);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : map.entrySet()) {
            ArmorMaterial material = entry.getKey();
            List<StatusEffectInstance> effectInstance = entry.getValue();
            if (hasCorrectArmorSet(player, material)) {
                for (StatusEffectInstance statusEffects : effectInstance) {
                    addStatusEffect(player, statusEffects);
                }
            }
        }
    }

    private void addStatusEffect(PlayerEntity player, StatusEffectInstance effectInstance) {
        boolean hasEffect = player.hasStatusEffect(effectInstance.getEffectType());
        if (!hasEffect) {
            player.addStatusEffect(new StatusEffectInstance(effectInstance));
        }
    }

    private boolean hasCorrectArmorSet(PlayerEntity player, ArmorMaterial material) {
        for (ItemStack stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        ArmorItem helmet  = (ArmorItem) player.getInventory().  getArmorStack(3).getItem();
        ArmorItem chestplate  = (ArmorItem) player.getInventory().  getArmorStack(2).getItem();
        ArmorItem legging  = (ArmorItem) player.getInventory().  getArmorStack(1).getItem();
        ArmorItem boots  = (ArmorItem) player.getInventory().  getArmorStack(0).getItem();

        return helmet.getMaterial().value() == material
                && chestplate.getMaterial().value() == material
                && legging.getMaterial().value() == material
                && boots.getMaterial().value() == material;
    }

    private boolean hasFullSuitOfArmor(PlayerEntity player) {
        ItemStack helmet = player.getInventory().getArmorStack(3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }
}
