package io.github.buyiomc.moregemmod.datagen;

import io.github.buyiomc.moregemmod.MoreGemMod;
import io.github.buyiomc.moregemmod.block.ModBlocks;
import io.github.buyiomc.moregemmod.item.ModItems;
import io.github.buyiomc.moregemmod.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
//    private static final List<ItemConvertible> aba;

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.RED_GEM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_GEM_ORE, 1)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.STONE))
                .input('@', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_ore"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_GEM_POWDER, 9)
                .input(Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_power"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_GEM, 1)
                .input(ModItemTags.GEM_LIST)
                .input(ModItems.RED_GEM_POWDER)
                .criterion("red_gem_powder", RecipeProvider.conditionsFromTag(ModItemTags.GEM_LIST))
                .criterion("red_gem_powder", RecipeProvider.conditionsFromItem(ModItems.RED_GEM_POWDER))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_GEM_SUGAR, 1)
                .pattern("#@")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.SUGAR))
                .criterion("red_gem_sugar", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("red_gem_sugar", RecipeProvider.conditionsFromItem(Items.SUGAR))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_sugar"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_GEM, 1)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .input(ModItems.RED_GEM_POWDER)
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM_POWDER))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "powder_to_red_gem"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_PICKAXE, 1)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_AXE, 1)
                .pattern("## ")
                .pattern("#@ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_HOE, 1)
                .pattern("## ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_leggings"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_GEM_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.RED_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_red_gem_boots"));

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.BLACK_GEM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_GEM_ORE, 1)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.STONE))
                .input('@', Ingredient.ofItems(ModItems.BLACK_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_ore"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_GEM_POWDER, 9)
                .input(Ingredient.ofItems(ModItems.BLACK_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_power"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_GEM, 1)
                .input(ModItemTags.GEM_LIST)
                .input(ModItems.BLACK_GEM_POWDER)
                .criterion("black_gem_powder", RecipeProvider.conditionsFromTag(ModItemTags.GEM_LIST))
                .criterion("black_gem_powder", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM_POWDER))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_GEM_SUGAR, 1)
                .pattern("#@")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.SUGAR))
                .criterion("black_gem_sugar", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("black_gem_sugar", RecipeProvider.conditionsFromItem(Items.SUGAR))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_sugar"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_GEM, 1)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .input(ModItems.BLACK_GEM_POWDER)
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM_POWDER))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "powder_to_black_gem"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_PICKAXE, 1)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_AXE, 1)
                .pattern("## ")
                .pattern("#@ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_HOE, 1)
                .pattern("## ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', Ingredient.ofItems(ModItems.BLACK_GEM))
                .input('@', Ingredient.ofItems(Items.STICK))
                .criterion("red_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .criterion("stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_leggings"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_GEM_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.RED_GEM))
                .criterion("black_gem", RecipeProvider.conditionsFromItem(ModItems.BLACK_GEM))
                .offerTo(recipeExporter, Identifier.of(MoreGemMod.MOD_ID, "to_black_gem_boots"));
    }
}
