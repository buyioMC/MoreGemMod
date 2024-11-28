package io.github.buyiomc.moregemmod.tags;

import io.github.buyiomc.moregemmod.MoreGemMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> GEM_LIST = of("gem_list");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreGemMod.MOD_ID, id));
    }
    public static void registerItemTags() {
        MoreGemMod.LOGGER.info("Registering Item Tags");
    }
}
