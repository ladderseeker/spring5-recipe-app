package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author XIAO JIN
 * @date 2021/04/09/ 18:05
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
