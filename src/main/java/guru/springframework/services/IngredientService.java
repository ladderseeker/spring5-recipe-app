package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author XIAO JIN
 * @date 2021/04/16/ 16:30
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
