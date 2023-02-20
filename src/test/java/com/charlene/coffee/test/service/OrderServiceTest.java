package com.charlene.coffee.test.service;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.charlene.coffee.constants.ProductConstants;
import com.charlene.coffee.enums.ProductSizeEnum;
import com.charlene.coffee.enums.ProductTypeEnum;
import com.charlene.coffee.models.product.Beverage;
import com.charlene.coffee.models.product.Product;
import com.charlene.coffee.service.order.OrderService;
import com.charlene.coffee.service.order.impl.OrderServiceImpl;

class OrderServiceTest {

	private OrderService orderService;
	private final String nameSuffix = "_name";
	private final String p1Code = "p1";
	private final String p2Code = "p2";
	private final String smallBeverageCode = "b1";
	private final String bigBeverageCode = "b2";
	private final String p1Name = p1Code + nameSuffix;
	private final String p2Name = p2Code + nameSuffix;
	private final String e1Name = ProductConstants.EXTRA_MILK + nameSuffix;
	private final String e2Name = ProductConstants.FOAMED_MILK + nameSuffix;
	private final String e3Name = ProductConstants.SPECIAL_ROAST_COFFEE + nameSuffix;
	private final String smallBeverageName = smallBeverageCode + nameSuffix;
	private final String bigBeverageName = bigBeverageCode + nameSuffix;
	private final double p1Price = 10;
	private final double p2Price = 19;
	private final double smallBeveragePrice = 7;
	private final double bigBeveragePrice = 11;
	private final double e1Price = .4d;
	private final double e2Price = .5d;
	private final double e3Price = .7d;

	@BeforeEach
	void setUp() throws Exception {
		orderService = new OrderServiceImpl(Map.of(p1Code, new Product(p1Name, p1Code, p1Price, ProductTypeEnum.SNACK),
				p2Code, new Product(p2Name, p2Code, p2Price, ProductTypeEnum.SNACK), ProductConstants.EXTRA_MILK,
				new Product(e1Name, ProductConstants.EXTRA_MILK, e1Price, ProductTypeEnum.EXTRA),
				ProductConstants.FOAMED_MILK,
				new Product(e2Name, ProductConstants.FOAMED_MILK, e2Price, ProductTypeEnum.EXTRA),
				ProductConstants.SPECIAL_ROAST_COFFEE,
				new Product(e3Name, ProductConstants.SPECIAL_ROAST_COFFEE, e3Price, ProductTypeEnum.EXTRA),
				smallBeverageCode,
				new Beverage(smallBeverageName, smallBeverageCode, smallBeveragePrice, ProductSizeEnum.SMALL),
				bigBeverageCode,
				new Beverage(bigBeverageName, bigBeverageCode, bigBeveragePrice, ProductSizeEnum.BIG)));
	}

	@Test
	void testMe() {
		// Assertions.fail("Not yet implemented");
	}

	@Test
	void testSimpleBeverage() {
		// Assertions.fail("Not yet implemented");
	}

	@Test
	void testSimpleBeverageWithSnack() {
		// Assertions.fail("Not yet implemented");
	}
	@Test
	void testComplexBeverages() {
		// Assertions.fail("Not yet implemented");
	}

}
