package com.charlene.coffee.models.order;

import java.util.List;

public class Order {
	private List<OrderItem> items;

	public Order(List<OrderItem> items) {
		if (items == null || items.size() == 0) {
			throw new IllegalArgumentException("An order must have at least one item!");
		}
		this.items = items;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

}


