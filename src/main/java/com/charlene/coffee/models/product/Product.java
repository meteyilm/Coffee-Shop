package com.charlene.coffee.models.product;

import com.charlene.coffee.enums.ProductTypeEnum;
import com.charlene.coffee.util.string.StringUtils;

public class Product {

	private final String identifier;
	private final String name;
	// Can be split to whole number(int) and cents(int or short) for accuracy
	private final double price;
	private final ProductTypeEnum productType;

	public Product(String name, String identifier, double price, ProductTypeEnum productType) {
		if (StringUtils.isBlank(name) || StringUtils.isBlank(identifier)) {
			throw new IllegalArgumentException("Product name and identifier must not be blank!");
		}
		if (price <= 0) {
			throw new IllegalArgumentException("A product must have a price to make us earn money!");
		}
		if (productType == null) {
			throw new IllegalArgumentException("A product must have a type!");
		}
		this.identifier = identifier;
		this.name = name;
		this.price = price;
		this.productType = productType;
	}

	@Override
	public String toString() {
		return name;
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

	public String getIdentifier() {
		return identifier;
	}

}
