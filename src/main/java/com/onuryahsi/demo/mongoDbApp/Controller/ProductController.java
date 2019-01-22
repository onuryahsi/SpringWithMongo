package com.onuryahsi.demo.mongoDbApp.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onuryahsi.demo.mongoDbApp.Model.Product;
import com.onuryahsi.demo.mongoDbApp.Service.ProductService;
//import com.onuryahsi.demo.mongoDbApp.Service.ProductService;

@RestController
public class ProductController {
	private ProductService productService;

	@Autowired

	public ProductController(ProductService service) {
		this.productService = service;
//		repository.save(new Product("pr1","pr1",1,1,1));
//		repository.save(new Product("pr2","pr2",2,2,2));
//		repository.save(new Product("pr3","pr3",3,3,3));
//		repository.save(new Product("pr4","pr4",4,4,4));
//		productService.saveProduct(new Product("pr5t","pr5t",1,2,3));
	}

	@GetMapping(value = "/api/product")
	public List<Product> Get() {
		return (List<Product>) productService.getAllProducts();
	}

	@GetMapping(value = "/api/product/{_id}")
	public Product Get(@RequestParam ObjectId _id) {
		// use @RequestParam instead of @PathVariable
		return productService.getProductById(_id);
	}

	@PostMapping(value = "/api/product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Product Post(@ModelAttribute Product product) {
		return productService.saveProduct(product);
	}

	@DeleteMapping(value = "/api/product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void Delete(@RequestParam ObjectId _id) {
		productService.deleteProduct(_id);
	}

}
