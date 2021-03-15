package com.patterns.creational.builder.builder2;

import config.Log4jPropertiesConfiguration;

/**
 * Abstract Builder
 *      Concrete Builder 1
 *      Concrete Builder 2
*
 *  Producto
 *  Director
 *  Cliente o Main
 *
 */
public class Main {

    public static void main(String[] args) {

        Cocina cocina = new Cocina();
        HamburguesaBuilder yankeeBuilder = new HamburguesaYankeeBuilder();
        HamburguesaBuilder cangreBuilder = new HamburguesaCangreburgerBuilder();


        cocina.setBuilder(yankeeBuilder);
        cocina.build();
        Hamburguesa yankee = cocina.getHamburguesa();
        Log4jPropertiesConfiguration.logger.debug(yankee);
        System.out.println(yankee);

        cocina.setBuilder(cangreBuilder);
        cocina.build();
        Hamburguesa cangreburger = cocina.getHamburguesa();
        Log4jPropertiesConfiguration.logger.debug(cangreburger);


    }
}
