package com.patterns.structural.decorator;

import config.Log4jPropertiesConfiguration;

public class Circle implements Shape{

    @Override
    public void draw() {
        Log4jPropertiesConfiguration.logger.debug("Drawing circle");

    }

    @Override
    public void resize() {
        Log4jPropertiesConfiguration.logger.debug("Resizing circle");

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
