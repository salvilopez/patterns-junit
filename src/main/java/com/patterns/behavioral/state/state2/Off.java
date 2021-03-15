package com.patterns.behavioral.state.state2;

import config.Log4jPropertiesConfiguration;

public class Off extends RemoteControl{
    @Override
    public void toggle(Device device) {
        Log4jPropertiesConfiguration.logger.debug("Turn On the device");
        device.setState(new On());
    }
}
