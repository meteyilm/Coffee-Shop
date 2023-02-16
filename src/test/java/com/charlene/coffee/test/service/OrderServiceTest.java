package com.charlene.coffee.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.charlene.coffee.service.order.OrderService;
import com.charlene.coffee.service.order.impl.OrderServiceImpl;

class OrderServiceTest {

	private OrderService orderService;

	@BeforeEach
	void setUp() throws Exception {
		orderService = new OrderServiceImpl();
	}

	@Test
	void testMe() {
		//TODO 
		//Assertions.fail("Not yet implemented");
	}

}
