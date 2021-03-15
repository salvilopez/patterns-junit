package com.patterns.behavioral.mediator;

import config.Log4jPropertiesConfiguration;

public class User extends AbstractUser{

    public User(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        this.mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message)
    {
        Log4jPropertiesConfiguration.logger.debug(this.name + ": message received " + message);
    }
}
