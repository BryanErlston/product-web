package com.bryan.product.bo;

import com.bryan.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
}
