/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.recipe.RecipeService;

@RestController

public class RecipeController {
    RecipeService RecipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return RecipeService.getRecipes();

    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return RecipeService.getRecipeById(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addPlayer(@RequestBody Recipe recipe) {
        return RecipeService.addRecipe(recipe);
    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return RecipeService.updateRecipe(recipeId, recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
        RecipeService.deleteRecipe(recipeId);
    }

}
