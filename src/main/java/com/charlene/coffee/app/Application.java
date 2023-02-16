package com.charlene.coffee.app;

import java.util.List;

import com.charlene.coffee.models.order.Order;
import com.charlene.coffee.service.order.OrderService;
import com.charlene.coffee.service.order.impl.OrderServiceImpl;


public class Application {

	private static OrderService orderService;
	
	public static void main(String[] args) {
		if (args == null || args.length != 1) {
			System.out.println("Please provide path to file that contains order information. Sample usage java -jar <jar_file_name> <absolute_or_relative_folder_name>");
			return;
		}
		var orders = setUpAndGetOrders(args[0]);
		orderService = new OrderServiceImpl();
		orderService.processOrders(orders);
	}
	
	private static List<Order> setUpAndGetOrders(String configPath) {
		//TODO to be implemented. Another 3-4 hours of work
		return null;
	}
	
}
