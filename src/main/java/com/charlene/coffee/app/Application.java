package com.charlene.coffee.app;

import com.charlene.coffee.service.order.OrderService;

public class Application {

	private static OrderService orderService;

	public static void main(String[] args) {
		if (args == null || args.length != 1) {
			System.out.println(
					"Please provide path to file that contains order information. Sample usage java -jar <jar_file_name> <absolute_or_relative_folder_name>");
			return;
		}
		new CoffeeApplication().generateProductsAndProcessOrders(args[0]);
	}

}
