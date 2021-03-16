package com.patterns.mockito;

import config.Log4jPropertiesConfiguration;
import org.junit.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

class SuiteTest {

 @Test
 @EnabledIfSystemProperty(named="os.arch", matches = "amd64")
 void runOnlyOnOsArch(){
  Log4jPropertiesConfiguration.logger.debug("Java Oracle");
 }

}
