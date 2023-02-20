package com.charlene.coffee.models.order;

public record OrderItem(String productCode, int quantity) {

	public OrderItem {
		if (productCode == null) {
			throw new IllegalArgumentException("An order must have a valid product!");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("An order must have at least item!");
		}

	}

}