package com.ticket.app.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket.app.product.service.ProductService;
import com.ticket.app.product.shared.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductDto> getProductsByUserId(String userId) {
		ProductDto product1 = new ProductDto();
		product1.setEventName("Cinema");
		product1.setPlace("São Paulo");
		product1.setPrice("R$:60,00");
		product1.setUserid(userId);
		
		ProductDto product2 = new ProductDto();
		product2.setEventName("Show");
		product2.setPlace("Pernambuco");
		product2.setPrice("R$:160,00");
		product2.setUserid(userId);
		
		List<ProductDto> products = new ArrayList<ProductDto>();
		products.add(product1);
		products.add(product2);

		return products;
	}

}
