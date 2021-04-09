package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author XIAO JIN
 * @date 2021/04/09/ 16:18
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
