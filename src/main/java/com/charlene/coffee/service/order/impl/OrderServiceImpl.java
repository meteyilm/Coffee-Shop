package com.charlene.coffee.service.order.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;

import com.charlene.coffee.constants.ProductConstants;
import com.charlene.coffee.enums.ProductTypeEnum;
import com.charlene.coffee.models.order.Order;
import com.charlene.coffee.models.order.OrderItem;
import com.charlene.coffee.models.product.Product;
import com.charlene.coffee.service.order.OrderService;
import com.charlene.coffee.util.string.StringUtils;

public class OrderServiceImpl implements OrderService {

	private final int freeBeverageThreshold = 5;
	private final int extraRandomSetSize = 3;
	private final int extraMilk = 0;
	private final int foamMilk = 1;
	private final int specialRoastCoffee = 2;
	private final Map<String, Product> productMap;
	private final Map<Integer, String> extraMap;
	private final Random beverageRandom;

	public OrderServiceImpl(Map<String, Product> productMap) {
		if (productMap == null || productMap.isEmpty()) {
			throw new IllegalArgumentException("ProductMap must be valid!");
		}
		this.productMap = productMap;
		this.beverageRandom = new Random();
		extraMap = Map.of(extraMilk, ProductConstants.EXTRA_MILK, foamMilk, ProductConstants.FOAMED_MILK,
				specialRoastCoffee, ProductConstants.SPECIAL_ROAST_COFFEE);
	}

	public StringBuilder processOrders(List<Order> orders) {
		if (orders == null || orders.size() == 0) {
			throw new IllegalArgumentException("There needs to be at least one order to process!");
		}
		final StringBuilder builder = new StringBuilder();
		int beverageCount = 0;
		int earnedExtraCount = 0;
		int snackCount = 0;
		double total = 0;
		Product currentProduct;
		for (Order order : orders) {
			beverageCount = 0;
			earnedExtraCount = 0;
			total = 0;
			for (OrderItem orderItem : order.getItems()) {
				currentProduct = productMap.get(orderItem.productCode());
				// If it's food and beverage, do not stamp card for beverage. If it's fifth
				// beverage, next order with a beverage(without snack) or same order with
				// another beverage will have one of its beverages free
				if (currentProduct == null) {
					throw new NoSuchElementException(
							String.format("{0} is not a valid product!", orderItem.productCode()));
				}
				if (currentProduct.getProductType() == ProductTypeEnum.BEVERAGE) {
					beverageCount += orderItem.quantity();
					builder.append();
				} else if (currentProduct.getProductType() == ProductTypeEnum.SNACK) {
					snackCount += orderItem.quantity();
				}
				total += addInvoiceDetailsAndGetSubtotal(orderItem, builder);
			}
			builder.append("Order total: ").append(formatToCents(total)).append(" CHF").append(System.lineSeparator()).append(System.lineSeparator());
		}
		System.out.println(builder.toString());
		return builder;
	}

	private double addInvoiceDetailsAndGetSubtotal(OrderItem item, StringBuilder builder) {
		var product = productMap.get(item.productCode());
		var subTotal = product.getPrice() * item.quantity();
		builder.append(StringUtils.padString(product.getName())).append(" x ").append(item.quantity()).append(": ")
				.append(formatToCents(subTotal)).append(System.lineSeparator());
		return subTotal;
	}

	private String formatToCents(double subTotal) {
		return String.format(Locale.GERMAN, "%,.2f", subTotal);
	}

	private String getRandomExtra() {
		return extraMap.get(beverageRandom.nextInt(extraRandomSetSize));
	}

}
