package com.patterns.behavioral.state.state2;

import config.Log4jPropertiesConfiguration;

public class On extends RemoteControl{
    @Override
    public void toggle(Device device) {
        Log4jPropertiesConfiguration.logger.debug("Turn OFF the device");
        device.setState(new Off());
    }
}
