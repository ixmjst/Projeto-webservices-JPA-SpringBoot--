package javatest.users.resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javatest.entities.User;
 
@RestController 
@RequestMapping(value = "/user")
public class UserResources {
	
@GetMapping
public ResponseEntity <User>findAll(){
	 User p1=new User(2L,"Jorge","jorge@gmail.com");
	 return ResponseEntity.ok().body(p1);
}
}