package com.capgemini.dao;



import com.capgemini.entity.Product;

public interface DaoInterface {

	Product deleteById(int productid);

	Product getProductById(int productid);

	Product UpdateProduct(Product p);

	Product ProductCreation(Product p);
}