package com.charlene.coffee.service.order.impl;

import java.util.List;

import com.charlene.coffee.enums.ProductTypeEnum;
import com.charlene.coffee.models.order.Order;
import com.charlene.coffee.models.order.OrderItem;
import com.charlene.coffee.models.product.Product;
import com.charlene.coffee.service.order.OrderService;

public class OrderServiceImpl implements OrderService {

	private final int freeBeverageThreshold = 5;
	
	public void processOrders(List<Order> orders) {
		if (orders == null || orders.size() == 0) {
			throw new IllegalArgumentException("There needs to be at least one order to process!");
		}
		int beverageCount = 0;
		boolean hasBeverage = false;
		int freeBeverageCount = 0;
		int freeExtraCount = 0;
		for (Order order : orders) {
			hasBeverage = false;
			for (OrderItem orderItem : order.getItems()) {
				if (orderItem.getProduct().getProductType() == ProductTypeEnum.BEVERAGE) {
					//TODO
					
				} else if (orderItem.getProduct().getProductType() == ProductTypeEnum.SNACK) {
					//TODO
					
				}
			}
		}
	}
	
	private Product getRandomExtra() {
		return null;
	}


}


