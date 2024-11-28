package io.github.buyiomc.moregemmod.item;

import io.github.buyiomc.moregemmod.MoreGemMod;
import io.github.buyiomc.moregemmod.item.custom.ModArmorItem;
import io.github.buyiomc.moregemmod.item.custom.Test;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RED_GEM = registerItems("red_gem", new Item(new Item.Settings()));
    public static final Item RED_GEM_POWDER = registerItems("red_gem_powder", new Item(new Item.Settings()));
    public static final Item RED_GEM_SUGAR = registerItems("red_gem_sugar", new Item(new Item.Settings().food(ModFoodComponents.RED_GEM_SUGAR)));
    public static final Item BLACK_GEM = registerItems("black_gem", new Item(new Item.Settings()));
    public static final Item BLACK_GEM_POWDER = registerItems("black_gem_powder", new Item(new Item.Settings()));
    public static final Item BLACK_GEM_SUGAR = registerItems("black_gem_sugar", new Item(new Item.Settings().food(ModFoodComponents.BLACK_GEM_SUGAR)));
    public static final Item RED_GEM_SWORD = registerItems("red_gem_sword", new SwordItem(ModToolMaterials.RED_GEM, new Item.Settings()
            .fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RED_GEM, 8, -3.0f))));
    public static final Item RED_GEM_SHOVEL = registerItems("red_gem_shovel", new ShovelItem(ModToolMaterials.RED_GEM, new Item.Settings()
            .fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RED_GEM, 2f, -2.0f))));
    public static final Item RED_GEM_PICKAXE = registerItems("red_gem_pickaxe", new PickaxeItem(ModToolMaterials.RED_GEM, new Item.Settings()
            .fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RED_GEM, 2f, -2.0f))));
    public static final Item RED_GEM_AXE = registerItems("red_gem_axe", new AxeItem(ModToolMaterials.RED_GEM, new Item.Settings()
            .fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RED_GEM, 10f, -3.0f))));
    public static final Item RED_GEM_HOE = registerItems("red_gem_hoe", new HoeItem(ModToolMaterials.RED_GEM, new Item.Settings()
            .fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RED_GEM, 2f, -1f))));
    public static final Item BLACK_GEM_SWORD = registerItems("black_gem_sword", new SwordItem(ModToolMaterials.BLACK_GEM, new Item.Settings()
            .fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLACK_GEM, 5, -3.2f))));
    public static final Item BLACK_GEM_SHOVEL = registerItems("black_gem_shovel", new ShovelItem(ModToolMaterials.BLACK_GEM, new Item.Settings()
            .fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLACK_GEM, 3f, -3.0f))));
    public static final Item BLACK_GEM_PICKAXE = registerItems("black_gem_pickaxe", new PickaxeItem(ModToolMaterials.BLACK_GEM, new Item.Settings()
            .fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLACK_GEM, 4f, -3.0f))));
    public static final Item BLACK_GEM_AXE = registerItems("black_gem_axe", new AxeItem(ModToolMaterials.BLACK_GEM, new Item.Settings()
            .fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLACK_GEM, 7f, -3.2f))));
    public static final Item BLACK_GEM_HOE = registerItems("black_gem_hoe", new HoeItem(ModToolMaterials.BLACK_GEM, new Item.Settings()
            .fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLACK_GEM, 2f, -2f))));

    public static final Item RED_GEM_HELMET = registerItems("red_gem_helmet",new ModArmorItem(ModArmorMaterials.RED_GEM, ArmorItem.Type.HELMET,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item RED_GEM_CHESTPLATE = registerItems("red_gem_clestplate",new ModArmorItem(ModArmorMaterials.RED_GEM, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item RED_GEM_LEGGINGS = registerItems("red_gem_leggings",new ModArmorItem(ModArmorMaterials.RED_GEM, ArmorItem.Type.LEGGINGS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item RED_GEM_BOOTS = registerItems("red_gem_boots",new ModArmorItem(ModArmorMaterials.RED_GEM, ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    public static final Item BLACK_GEM_HELMET = registerItems("black_gem_helmet",new ModArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.HELMET,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item BLACK_GEM_CHESTPLATE = registerItems("black_gem_clestplate",new ModArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item BLACK_GEM_LEGGINGS = registerItems("black_gem_leggings",new ModArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.LEGGINGS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item BLACK_GEM_BOOTS = registerItems("black_gem_boots",new ModArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    //Test
    public static final Item TEST = registerItems("test", new Test(new Item.Settings().maxCount(1).maxDamage(127)));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreGemMod.MOD_ID, id), item);
    }

    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(RED_GEM);
        fabricItemGroupEntries.add(RED_GEM_POWDER);
        fabricItemGroupEntries.add(RED_GEM_SUGAR);
        fabricItemGroupEntries.add(BLACK_GEM);
        fabricItemGroupEntries.add(BLACK_GEM_POWDER);
        fabricItemGroupEntries.add(BLACK_GEM_SUGAR);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);

        MoreGemMod.LOGGER.info("Registering Items");
    }
}
