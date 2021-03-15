package com.patterns.behavioral.strategy.strategy2;

import config.Log4jPropertiesConfiguration;

/**
 * GoF Definition: Define a family of algorithms, encapsulate each one, and make them interchangeable. The
 * strategy pattern lets the algorithm vary independently from client to client.
 */
public class Main {

    public static void main(String[] args) {

        Context upperCaseCtx = new Context(new UpperCaseStrategy());
        Context lowerCaseCtx = new Context(new LowerCaseStrategy());
        Context numericCtx = new Context(new NumericStrategy());

        // pruebas


        System.out.println("upperCase: HOLA, result: " + upperCaseCtx.validate("HOLA"));
        System.out.println("lowerCase: HOLA, result: " + lowerCaseCtx.validate("HOLA"));
        System.out.println("numeric: HOLA, result: " + numericCtx.validate("HOLA"));

        System.out.println("upperCase: HOLA, result: " + upperCaseCtx.validate("HOLA"));
        System.out.println("lowerCase: HOLA, result: " + lowerCaseCtx.validate("HOLA"));
        System.out.println("numeric: HOLA, result: " + numericCtx.validate("HOLA"));

        System.out.println("upperCase: HOLA, result: " + upperCaseCtx.validate("HOLA"));
        System.out.println("lowerCase: HOLA, result: " + lowerCaseCtx.validate("HOLA"));
        System.out.println("numeric: HOLA, result: " + numericCtx.validate("HOLA"));

    }
}
