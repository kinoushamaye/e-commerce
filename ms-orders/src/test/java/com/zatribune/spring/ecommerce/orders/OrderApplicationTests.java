package com.zatribune.spring.ecommerce.orders;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // Charge la config de test si besoin
class OrderApplicationTests {

    @Test
    void contextLoads() {
    }
}
