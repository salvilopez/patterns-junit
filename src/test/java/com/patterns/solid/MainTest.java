package com.patterns.solid;

import config.Log4jPropertiesConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
class MainTest {

@Test
@DisplayName("PruebaTest")
public void pruebaTest() {

    Log4jPropertiesConfiguration.logger.debug("Test de prueba Creado");

    Car car= new Car();
    assertNotNull(car);
}




}