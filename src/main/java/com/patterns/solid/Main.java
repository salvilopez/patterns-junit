package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws InvalidCarException {

        String carType = "electric";

        ICar car;
        if (carType.equals("car")) {
            car = new Car();
        } else if (carType.equals("electric")) {
            car = new ElectricCar();
        }else{
            throw new InvalidCarException("Invalid car");
        }
        car.accelerate();
    }
}
