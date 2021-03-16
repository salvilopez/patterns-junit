package com.patterns.mockito;

import com.patterns.creational.singleton.threadsafe.DbConfiguration;
import config.Log4jPropertiesConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.*;

class SuiteTest {

 DbConfiguration config1 = DbConfiguration.getDBConfiguration();
 DbConfiguration config2 = DbConfiguration.getDBConfiguration();

 @Test
 void getInstance() {
  assertNotNull(config1);
  assertSame(config1, config2);
  assertEquals(config1, config2);
 }

}
