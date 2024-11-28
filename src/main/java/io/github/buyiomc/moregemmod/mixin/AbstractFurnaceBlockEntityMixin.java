package io.github.buyiomc.moregemmod.mixin;

import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public abstract class AbstractFurnaceBlockEntityMixin {
    @Shadow private static volatile @Nullable Map<Item, Integer> fuelTimes;

    @Inject(method = "createFuelTimeMap",  at = @At("TAIL"))
    private static void addFuelTimeMap(CallbackInfoReturnable<Map<Item, Integer>> info) {
        fuelTimes.put(ModItems.BLACK_GEM, 800);
        fuelTimes.put(Item.fromBlock(ModBlocks.BLACK_GEM_BLOCK), 1600);
    }
}
