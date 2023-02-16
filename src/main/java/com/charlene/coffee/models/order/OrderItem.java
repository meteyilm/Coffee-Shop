package com.charlene.coffee.models.order;

import com.charlene.coffee.models.product.Product;

public class OrderItem {
	private Product product;
	private int quantity;

	public OrderItem(Product product, int quantity) {
		if (product == null) {
			throw new IllegalArgumentException("An order must have a valid product!");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("An order must have at least item!");
		}
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

