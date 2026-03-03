package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import javatest.entities.Category;
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
