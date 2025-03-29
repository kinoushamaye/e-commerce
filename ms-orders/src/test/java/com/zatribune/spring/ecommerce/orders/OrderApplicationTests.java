package com.zatribune.spring.ecommerce.orders;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // Charge application-test.yml
class OrderApplicationTests {

    @Test
    void contextLoads() {
    }
}
