package com.shirisha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
Integer orderid;
	@Column(length = 25)
String nm;
Integer qty;
double price;
public Integer getOrderid() {
	return orderid;
}
public void setOrderid(Integer orderid) {
	this.orderid = orderid;
}
public String getNm() {
	return nm;
}
public void setNm(String nm) {
	this.nm = nm;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
