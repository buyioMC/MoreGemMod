package io.github.buyiomc.moregemmod.tags;

import io.github.buyiomc.moregemmod.MoreGemMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreGemMod.MOD_ID, id));
    }
    public static void registerBlockTags() {
        MoreGemMod.LOGGER.info("Registering Block Tags");
    }
}
