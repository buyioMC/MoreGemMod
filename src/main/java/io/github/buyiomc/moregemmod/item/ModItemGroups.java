package io.github.buyiomc.moregemmod.item;

import io.github.buyiomc.moregemmod.MoreGemMod;
import io.github.buyiomc.moregemmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_GEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MoreGemMod.MOD_ID, "more_gem_mod"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.more_gem_group"))
                    .icon(() -> new ItemStack(ModItems.RED_GEM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_GEM);
                        entries.add(ModItems.RED_GEM_POWDER);
                        entries.add(ModItems.RED_GEM_SUGAR);
                        entries.add(ModBlocks.RED_GEM_BLOCK);
                        entries.add(ModBlocks.RED_GEM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RED_GEM_ORE);
                        entries.add(ModItems.RED_GEM_SWORD);
                        entries.add(ModItems.RED_GEM_PICKAXE);
                        entries.add(ModItems.RED_GEM_AXE);
                        entries.add(ModItems.RED_GEM_SHOVEL);
                        entries.add(ModItems.RED_GEM_HOE);
                        entries.add(ModItems.RED_GEM_HELMET);
                        entries.add(ModItems.RED_GEM_CHESTPLATE);
                        entries.add(ModItems.RED_GEM_LEGGINGS);
                        entries.add(ModItems.RED_GEM_BOOTS);

                        entries.add(ModItems.BLACK_GEM);
                        entries.add(ModItems.BLACK_GEM_POWDER);
                        entries.add(ModItems.BLACK_GEM_SUGAR);
                        entries.add(ModBlocks.BLACK_GEM_BLOCK);
                        entries.add(ModBlocks.BLACK_GEM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BLACK_GEM_ORE);
                        entries.add(ModItems.BLACK_GEM_SWORD);
                        entries.add(ModItems.BLACK_GEM_PICKAXE);
                        entries.add(ModItems.BLACK_GEM_AXE);
                        entries.add(ModItems.BLACK_GEM_SHOVEL);
                        entries.add(ModItems.BLACK_GEM_HOE);
                        entries.add(ModItems.BLACK_GEM_HELMET);
                        entries.add(ModItems.BLACK_GEM_CHESTPLATE);
                        entries.add(ModItems.BLACK_GEM_LEGGINGS);
                        entries.add(ModItems.BLACK_GEM_BOOTS);
                    }).build());

    public static void registerModItemGroups() {
        MoreGemMod.LOGGER.info("Registering Item Groups");
    }
}
