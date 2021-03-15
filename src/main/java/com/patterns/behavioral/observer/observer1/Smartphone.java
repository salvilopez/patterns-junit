package com.patterns.behavioral.observer.observer1;

import config.Log4jPropertiesConfiguration;

public class Smartphone implements WeatherObserver{
    @Override
    public void update(WeatherType type) {
        Log4jPropertiesConfiguration.logger.debug("Smartphone has been notified of weather change: " + type);
    }
}
