package com.example.demo.entities;

public class Apple {
private String name;
private Long price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getPrice() {
	return price;
}
public void setPrice(Long price) {
	this.price = price;
}
@Override
public String toString() {
	return "Apple [name=" + name + ", price=" + price + "]";
}
public Apple(String name, Long price) {
	super();
	this.name = name;
	this.price = price;
}
public Apple() {
	super();
}

}
