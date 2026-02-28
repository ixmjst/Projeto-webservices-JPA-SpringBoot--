package javatest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import  java.util.List;
import javatest.repositories.OrderRepository;

import javatest.entities.Order;
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional <Order> obj= repository.findById(id);
		return obj.get();
	}
}
