package net.Lex.sd.data.client.provider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

public class RecipesProviderSD extends RecipeProvider {
    public RecipesProviderSD(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    public String getName() {
        return "Spatial Distruption - Recipes";
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer){
        //
    }
}
