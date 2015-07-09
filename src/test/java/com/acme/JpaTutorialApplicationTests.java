package com.acme;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acme.order.customer.Customer;
import com.acme.order.customer.CustomerRepository;
import com.acme.order.customer.CustomerType;
import com.acme.order.pizza.PizzaOrderService;
import com.acme.order.pizza.PizzaType;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTutorialApplication.class)
public class JpaTutorialApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	PizzaOrderService pizzaOrderService;

	@Test
	public void dataLoads() {

		Customer customer1 = new Customer(null, "jan", "jan@email.com", "zielona");
		Customer customer2 = new Customer(null, "zosia", "zosia@email.com", "czerowna");

		customerRepository.save(Lists.newArrayList(customer1, customer2));

		pizzaOrderService.createOrder(customer1, PizzaType.BIG);
		pizzaOrderService.createOrder(customer2, PizzaType.SMALL);
	}
	
	@Test
	public void givenNormaCustomer(){
		CustomerType customerType  = new CustomerType();
		Customer customer1 = new Customer(null, "jan", "jan@email.com", "zielona");
		
		

}
