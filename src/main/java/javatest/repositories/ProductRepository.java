package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import javatest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
