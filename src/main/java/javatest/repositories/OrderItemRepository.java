package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import javatest.entities.OrderItem;
import javatest.entities.User;
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
