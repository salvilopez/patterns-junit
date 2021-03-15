package com.patterns.solid;

import config.Log4jPropertiesConfiguration;

public class Car implements ICar{

    @Override
    public void accelerate() {

        Log4jPropertiesConfiguration.logger.debug("accelerating the car");
    }

    @Override
    public void stop() {
        Log4jPropertiesConfiguration.logger.debug("stopping the car");
    }
}
