package com.patterns.behavioral.observer.observer1;


/**
 * Patrón Observer o patrón observador
 * @author alan
 * @see Computer
 * @see <a href="https://www.google.es">Computer Bugfix Docs</a>
 * @version java 1.2
 */
public class Main {

    /**
     * Main entry point to the app
     * @param args
     */
    public static void main(String[] args) {
        Weather aemet = new Weather();

        WeatherObserver computer = new Computer();
        aemet.addObserver(computer);
        aemet.addObserver(new Smartphone());

        aemet.changeWeather(WeatherType.CLOUDY);
        aemet.changeWeather(WeatherType.RAINY);
        aemet.changeWeather(WeatherType.SUNNY);

        aemet.removeObserver(computer);
        aemet.changeWeather(WeatherType.SUNNY);

    }
}
