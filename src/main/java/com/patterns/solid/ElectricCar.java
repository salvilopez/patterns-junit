package com.patterns.solid;

import config.Log4jPropertiesConfiguration;

public class ElectricCar implements ICar{

    private int battery;

    @Override
    public void accelerate() {
        if (hasBattery()) {
            Log4jPropertiesConfiguration.logger.debug("accelerating the car");

        } else {
            Log4jPropertiesConfiguration.logger.debug("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        Log4jPropertiesConfiguration.logger.debug("stop the car");
    }

    public boolean hasBattery() {
        Log4jPropertiesConfiguration.logger.debug("checking battery");
        if (battery < 95) {
            Log4jPropertiesConfiguration.logger.debug("the battery is very low :(");

            return false;
        } else {
            Log4jPropertiesConfiguration.logger.debug("battery ok :)");
            return true;
        }
    }
}
