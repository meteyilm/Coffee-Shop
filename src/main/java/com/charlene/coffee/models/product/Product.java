package com.charlene.coffee.models.product;

import com.charlene.coffee.enums.ProductSize;
import com.charlene.coffee.enums.ProductTypeEnum;

public class Product {

	private final String name;
	// Can be split to whole number(int) and cents(int or short) for accuracy
	private final double price;
	private final ProductTypeEnum productType;
	private final ProductSize size;

	public Product(String name, double price, ProductTypeEnum productType, ProductSize size) {
		if (name == null || name.trim().length() == 0) {
			throw new IllegalArgumentException("Product name must not be blank!");
		}
		if (price <= 0) {
			throw new IllegalArgumentException("A product must have a price to make us earn money!");
		}
		if (productType == null) {
			throw new IllegalArgumentException("A product must have a type!");
		}
		this.name = name;
		this.price = price;
		this.productType = productType;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public ProductTypeEnum getProductType() {
		return productType;
	}

	public ProductSize getSize() {
		return size;
	}


}

