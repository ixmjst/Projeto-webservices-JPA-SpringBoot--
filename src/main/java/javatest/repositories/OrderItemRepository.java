package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import javatest.entities.OrderItem;
import javatest.entities.User;
import javatest.entities.pk.OrderItemPK;
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
