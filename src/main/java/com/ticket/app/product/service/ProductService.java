package com.ticket.app.product.service;


import java.util.List;

import com.ticket.app.product.shared.ProductDto;

public interface ProductService{
	List<ProductDto> getProductsByUserId(String userId);

}
