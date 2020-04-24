package com.capgemini.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product")
public class Product {
@Id
private int productId;
private String productName;
private String productBrand;
private Float productPrice;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductBrand() {
	return productBrand;
}
public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
public Float getProductPrice() {
	return productPrice;
}
public void setProductPrice(Float productPrice) {
	this.productPrice = productPrice;
}

}
