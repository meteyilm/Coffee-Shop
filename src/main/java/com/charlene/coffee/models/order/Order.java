package com.charlene.coffee.models.order;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.charlene.coffee.util.string.StringUtils;

public class Order {
	private final UUID id;
	private final List<OrderItem> items;

	public Order(List<OrderItem> items) {
		if (items == null || items.size() == 0) {
			throw new IllegalArgumentException("An order must have at least one item!");
		}
		Set<String> productCodes = new HashSet<>();
		for (OrderItem item : items) {
			if (StringUtils.isBlank(item.productCode()) || item.quantity() <= 0) {
				throw new IllegalArgumentException("An order item must have a valid product identifier and quantity!");
			}
		}
		id = UUID.randomUUID();
		this.items = items;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public UUID getId() {
		return id;
	}

}
