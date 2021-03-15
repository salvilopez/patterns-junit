package com.patterns.behavioral.state.state1;

import config.Log4jPropertiesConfiguration;

public class OffState implements State{
    @Override
    public void doAction() {
        Log4jPropertiesConfiguration.logger.debug("Apagando");
    }
}
