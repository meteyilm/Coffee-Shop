package com.charlene.coffee.service.order;

import java.util.List;

import com.charlene.coffee.models.order.Order;

public interface OrderService {
	public StringBuilder processOrders(List<Order> orders);
}
