package com.onuryahsi.demo.mongoDbApp.Interface;

import org.bson.types.ObjectId;

import com.onuryahsi.demo.mongoDbApp.Model.Product;

public interface IProductService {
	
	Iterable<Product> getAllProducts();

	Product getProductById(ObjectId _id);

	Product saveProduct(Product product);

	void deleteProduct(ObjectId _id);
	
}
