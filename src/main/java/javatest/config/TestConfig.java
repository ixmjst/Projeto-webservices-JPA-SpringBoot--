package javatest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import javatest.repositories.UserRepository;
import javatest.entities.User;
import java.util.Arrays;
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
    @Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1=new User(null,"Maria","maria@gmail.com");
		User u2=new User(null,"Alex","alex@gmail.com");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
      
}
