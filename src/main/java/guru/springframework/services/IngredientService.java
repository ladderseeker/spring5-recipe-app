package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author XIAO JIN
 * @date 2021/04/16/ 16:30
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
