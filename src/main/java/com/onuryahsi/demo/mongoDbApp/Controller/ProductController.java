package com.onuryahsi.demo.mongoDbApp.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.onuryahsi.demo.mongoDbApp.Model.Product;
import com.onuryahsi.demo.mongoDbApp.Repository.ProductRepository;
//import com.onuryahsi.demo.mongoDbApp.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository repository;
	// @Autowired
	// private ProductService productService;

	public ProductController(ProductRepository repository) {
		this.repository = repository;
//		repository.save(new Product("pr1","pr1",1,1,1));
//		repository.save(new Product("pr2","pr2",2,2,2));
//		repository.save(new Product("pr3","pr3",3,3,3));
//		repository.save(new Product("pr4","pr4",4,4,4));
//		repository.save(new Product("pr5","pr5",5,5,5));
	}

	@GetMapping(value = "/api/product")
	public List<Product> Get() {
		return repository.findAll();
	}

	@GetMapping(value = "/api/product/{_id}")
	public Product Get(@RequestParam ObjectId _id) {
		// use @RequestParam instead of @PathVariable
		return repository.findBy_id(_id);
	}
	
	@PostMapping(value = "/api/product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Product Post(@ModelAttribute Product product) {
		return repository.save(product);
	}

	@DeleteMapping(value = "/api/product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void Delete(@RequestParam ObjectId _id) {
		Product pr = repository.findBy_id(_id);
		repository.delete(pr);
	}

}
