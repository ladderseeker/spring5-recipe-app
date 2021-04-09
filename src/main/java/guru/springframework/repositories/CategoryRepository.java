package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author XIAO JIN
 * @date 2021/04/09/ 16:19
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
