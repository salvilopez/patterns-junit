package com.patterns.creational.factory;

import com.patterns.creational.factory.error.FiguraNotFoundException;
import config.Log4jPropertiesConfiguration;

public class Main {

    public static void main(String[] args) throws FiguraNotFoundException {

        Figura triangulo = FiguraFactory.crearFigura("triangulo");
        Figura circulo = FiguraFactory.crearFigura("circulo");
        Figura rectangulo = FiguraFactory.crearFigura("rectangulo");

        Log4jPropertiesConfiguration.logger.debug(triangulo);
        Log4jPropertiesConfiguration.logger.debug(circulo);
        Log4jPropertiesConfiguration.logger.debug(rectangulo);
    }
}
