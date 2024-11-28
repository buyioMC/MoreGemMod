package io.github.buyiomc.moregemmod.util;

import io.github.buyiomc.moregemmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerModCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RED_GEM, 5, 12, 5, 4));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BLACK_GEM, 5, 12, 7, 4));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_HELMET, 12, 1, 7, 4, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_BOOTS, 6, 1, 7, 2, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_BOOTS, 6, 1, 7, 2, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_HELMET, 12, 1, 7, 4, 0.7f));


        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_CHESTPLATE, 21, 1, 7, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_LEGGINGS, 12, 1, 7, 5, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_CHESTPLATE, 21, 1, 7, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_LEGGINGS, 12, 1, 7, 5, 0.7f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_HOE, 15, 1, 10, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_HOE, 15, 1, 10, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_SHOVEL, 10, 1, 10, 5, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_SHOVEL, 10, 1, 10, 5, 0.7f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_PICKAXE, 15, 1, 10, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_PICKAXE, 15, 1, 10, 6, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_AXE, 18, 1, 10, 5, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_AXE, 18, 1, 10, 5, 0.7f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_SWORD, 20, 1, 10, 5, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_SWORD, 20, 1, 10, 5, 0.7f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.RED_GEM_AXE, 20, 1, 10, 5, 0.7f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.BLACK_GEM_AXE, 20, 1, 10, 5, 0.7f));
        });
    }
}
