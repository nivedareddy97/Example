package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Product;
@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Product ProductCreation(Product p) {
		// TODO Auto-generated method stub
		Product e=em.merge(p);
		return e;
	}
	
	@Override
	public Product getProductById(int productid) {
		
		return em.find(Product.class,productid);
	}
	@Override
	public Product UpdateProduct(Product p) {
		Product e=em.find(Product.class,p.getProductId());
		if(e!=null)
		{
			e.setProductName(p.getProductName());
			e.setProductBrand(p.getProductBrand());
			e.setProductPrice(p.getProductPrice());
			
		}
		return e;
			
	}
	@Override	
	public Product deleteById(int productId) {
		Product e=em.find(Product.class,productId);
		if(e!=null)
			{em.remove(e);
			}
        return e;
	}
}

