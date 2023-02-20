package com.charlene.coffee.models.product;

import com.charlene.coffee.enums.ProductSizeEnum;
import com.charlene.coffee.enums.ProductTypeEnum;

public class Beverage extends Product {

	private final ProductSizeEnum size;

	public Beverage(String name, String identifier, double price, ProductSizeEnum size) {
		super(name, identifier, price, ProductTypeEnum.BEVERAGE);
		if (size == null) {
			throw new IllegalArgumentException("A beverage must have a size!");
		}
		this.size = size;
	}

	public ProductSizeEnum getSize() {
		return size;
	}
}
