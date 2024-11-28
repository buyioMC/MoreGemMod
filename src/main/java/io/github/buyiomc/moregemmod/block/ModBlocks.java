package io.github.buyiomc.moregemmod.block;

import io.github.buyiomc.moregemmod.MoreGemMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RED_GEM_BLOCK = register("red_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.5f)));
    public static final Block RED_GEM_ORE = register("red_gem_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.5f)));
    public static final Block BLACK_GEM_BLOCK = register("black_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.5f)));
    public static final Block BLACK_GEM_ORE = register("black_gem_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.5f)));
    public static final Block DEEPSLATE_RED_GEM_ORE = register("deepslate_red_gem_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0f, 5.5f)));
    public static final Block DEEPSLATE_BLACK_GEM_ORE = register("deepslate_black_gem_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0f, 5.5f)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreGemMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreGemMod.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        MoreGemMod.LOGGER.info("Registering Blocks");
    }
}
