package com.shaunabram.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles(profiles = "test")
public class CustomerRepositoryTest {
	@Autowired
	private CustomerRepository repository;

	@Test
	public void test() {
		Customer customer = new Customer("shaun", "abram");
		repository.save(customer);
		List<Customer> customers = repository.findByLastName("abram");
		assertThat(customers).hasSize(1);
		Customer customer1 = customers.get(0);
		assertThat(customer1.getFirstName()).isEqualTo("shaun");
	}
}
