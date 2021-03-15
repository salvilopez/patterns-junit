package com.patterns.structural.decorator;

import config.Log4jPropertiesConfiguration;

public class Rectangle implements Shape{

    @Override
    public void draw() {

        Log4jPropertiesConfiguration.logger.debug("Drawing rectangle");

    }

    @Override
    public void resize() {
        Log4jPropertiesConfiguration.logger.debug("Resizing rectangle");

    }

    @Override
    public String description() {
        return "Hey there! I'm using Decorator!";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
