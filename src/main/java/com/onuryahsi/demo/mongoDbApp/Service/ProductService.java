package com.onuryahsi.demo.mongoDbApp.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onuryahsi.demo.mongoDbApp.Interface.IProductService;
import com.onuryahsi.demo.mongoDbApp.Model.Product;
import com.onuryahsi.demo.mongoDbApp.Repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	private ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository repository)
	{
		this.productRepository = repository;
	}
	@Override
	public Iterable<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(ObjectId _id) {
		// TODO Auto-generated method stub
		return productRepository.findBy_id(_id);
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(ObjectId _id) {
		// TODO Auto-generated method stub
		Product product = productRepository.findBy_id(_id);
		productRepository.delete(product);
	}

}
