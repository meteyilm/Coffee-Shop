package com.charlene.coffee.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.charlene.coffee.models.order.Order;
import com.charlene.coffee.models.product.Product;
import com.charlene.coffee.service.order.OrderService;
import com.charlene.coffee.service.order.impl.OrderServiceImpl;

public class CoffeeApplication {
	private OrderService orderService;

	public void generateProductsAndProcessOrders(String configPath) {
		if (configPath == null || configPath.trim().length() == 0) {
			throw new IllegalArgumentException(String.format("{0} is not a valid file path!", configPath));
		}
		var orders = setUpAndGetOrders(configPath);
		var orderMap = generateOrderMap(configPath);
		orderService = new OrderServiceImpl(orderMap);
		orderService.processOrders(orders);
	}

	private Map<String, Product> generateOrderMap(String configPath) {
		// TODO
		return null;
	}

	private List<Order> setUpAndGetOrders(String configPath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(configPath))) {

		} catch (IOException e) {

		}
		// TODO
		return null;
	}
}
