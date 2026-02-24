package javatest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import javatest.entities.User;
public interface UserRepository extends JpaRepository<User,Long> {

}
