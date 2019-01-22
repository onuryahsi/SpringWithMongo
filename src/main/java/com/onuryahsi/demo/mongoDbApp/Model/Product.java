package com.onuryahsi.demo.mongoDbApp.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private ObjectId _id;
	private String productBrand;
	private String productModel;
	private int productWeight;
	private int productPurchasePrice;
	private int productSalePrice;
	
	public Product(String productBrand, String productModel, Integer productWeight, Integer productPurchasePrice,
			Integer productSalePrice) {
		this.productBrand = productBrand;
		this.productModel = productModel;
		this.productWeight = productWeight;
		this.productPurchasePrice = productPurchasePrice;
		this.productSalePrice = productSalePrice;
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return _id.toHexString();
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}

	/**
	 * @param productBrand the productBrand to set
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	/**
	 * @return the productModel
	 */
	public String getProductModel() {
		return productModel;
	}

	/**
	 * @param productModel the productModel to set
	 */
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	/**
	 * @return the productWeight
	 */
	public Integer getProductWeight() {
		return productWeight;
	}

	/**
	 * @param productWeight the productWeight to set
	 */
	public void setProductWeight(Integer productWeight) {
		this.productWeight = productWeight;
	}

	/**
	 * @return the productPurchasePrice
	 */
	public int getProductPurchasePrice() {
		return productPurchasePrice;
	}

	/**
	 * @param productPurchasePrice the productPurchasePrice to set
	 */
	public void setProductPurchasePrice(int productPurchasePrice) {
		this.productPurchasePrice = productPurchasePrice;
	}

	/**
	 * @return the productSalePrice
	 */
	public int getProductSalePrice() {
		return productSalePrice;
	}

	/**
	 * @param productSalePrice the productSalePrice to set
	 */
	public void setProductSalePrice(int productSalePrice) {
		this.productSalePrice = productSalePrice;
	}
}
