package javatest.entities;

import javatest.entities.pk.OrderItemPK;

public class OrderItem {
private OrderItemPK id ;
private Integer quantity;
private Double price;
public OrderItem() {
	super();
}
public OrderItem(Integer quantity, Double price) {
	super();
	this.quantity = quantity;
	this.price = price;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}


}
