package com.patterns;

import com.patterns.behavioral.strategy.strategy1.PaypalStrategyTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;


/*
 Ejecutaría todos los test desde esta clase que estén dentro del paquete creational e iterator y que  la
 clase o método contenga la Tag "database"
* */
@RunWith(JUnitPlatform.class)
// @SelectPackages({"com.patterns.creational", "com.patterns.iterator"})
@SelectPackages("com.patterns")
@SuiteDisplayName("Suite patrones")
// @IncludeTags("database") // También se puede usar @ExcludeTags para el caso contrario
// @SelectClasses(PaypalStrategyTest.class)
public class SuiteTest {
}
