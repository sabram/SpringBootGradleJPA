package com.shaunabram.springboot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloControllerTest {
    @Test
    public void shouldAnswerWithTrue() {
		HelloController helloController = new HelloController();
        assertEquals("Greetings from Spring Boot!", helloController.index());
    }
}
