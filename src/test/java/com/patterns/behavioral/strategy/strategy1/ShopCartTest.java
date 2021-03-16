package com.patterns.behavioral.strategy.strategy1;

import com.patterns.solid.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class ShopCartTest {

    @BeforeEach
    void setUp() {
        ShopCart trolley = new ShopCart();
    }

@Test
@DisplayName("shopcard")
public void shopcard() {
    Car car= new Car();
    assertNotNull(car);

}

}