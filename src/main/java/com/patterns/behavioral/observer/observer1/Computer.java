package com.patterns.behavioral.observer.observer1;

import config.Log4jPropertiesConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Computer implements WeatherObserver{

    private List<String> receivedMessages = new ArrayList<>();


    @Override
    public void update(WeatherType type) {
        receivedMessages.add("Computer has been notified of weather change: " + type);
        Log4jPropertiesConfiguration.logger.debug("Computer has been notified of weather change: " + type);
    }

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<String> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }
}
