package javatest.entities;

import java.util.ArrayList;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "tb_users")
public class User implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
@JsonIgnore
@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	

	public User() {

	}
	public User( String name, String email) {
		super();
		this.id = null;
		this.name = name;
		this.email = email;
	}


	public User(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
   
	public void setId(Long id) {
		this.id = id;
	}
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
  
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [id:" + id + ", name:" + name + ", email:" + email + "]";
	}

}
