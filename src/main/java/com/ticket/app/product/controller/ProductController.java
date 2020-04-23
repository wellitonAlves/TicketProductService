package com.ticket.app.product.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/status/check")
	public String status() {
		return "working";
	}
	
	@GetMapping(path="/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String getProducts(@PathVariable String id) {
		return "Lista de Produtos do usuário id: "+id;
	}

}
