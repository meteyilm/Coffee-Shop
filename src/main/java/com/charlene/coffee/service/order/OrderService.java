package com.charlene.coffee.service.order;

import java.util.List;

import com.charlene.coffee.models.order.Order;

public interface OrderService {
	public void processOrders(List<Order> orders);
}

