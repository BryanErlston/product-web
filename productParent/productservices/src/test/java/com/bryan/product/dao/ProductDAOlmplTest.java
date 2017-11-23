package com.bryan.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bryan.product.dto.Product;

public class ProductDAOlmplTest {

	@Test
	public void createShouldCreateProduct() {

		ProductDAO dao = new ProductDAOlmpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPad");
		product.setDescription("Awesome");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("IPad", result.getName());
		
	}

}
