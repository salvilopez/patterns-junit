package com.patterns.behavioral.observer.observer2;

import config.Log4jPropertiesConfiguration;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public String notify(String handle, String tweet) {

        Log4jPropertiesConfiguration.logger.debug("'received Tweet notification from: '%s', Tweet message: '%"+name+ handle + tweet);
        return handle;
    }
}
