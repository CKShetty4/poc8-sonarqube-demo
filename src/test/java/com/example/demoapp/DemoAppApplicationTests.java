package com.example.demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoAppApplicationTests {

    @Test
    void testHomePage() {

        HelloController controller = new HelloController();

        String response = controller.home();

        assertTrue(response.contains("chinmay.kshetty"));
    }
}
