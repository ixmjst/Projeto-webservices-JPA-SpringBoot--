package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import javatest.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
