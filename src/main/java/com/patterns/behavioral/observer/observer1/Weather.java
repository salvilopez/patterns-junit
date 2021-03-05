package com.patterns.behavioral.observer.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject in observer pattern
 */
public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather(){
        this.observers = new ArrayList<>();
    }

    /**
     * Adds observer to observer list
     * @param obs
     */
    public void addObserver(WeatherObserver obs){
        System.out.println("Añadido obs");
        this.observers.add(obs);
    }

    /**
     * Removes an observer
     * @param obs
     */
    public void removeObserver(WeatherObserver obs){
        System.out.println("Añadido obs");
        this.observers.remove(obs);
    }

    /**
     * Changes weather and notify observers
     * @param currentWeather weather type enum
     */
    public void changeWeather(WeatherType currentWeather){
        this.currentWeather = currentWeather;
        this.notifyObservers();
    }

    /**
     * Notifies observers whit new weather
     */
    private void notifyObservers(){
        for (WeatherObserver observer: this.observers) {
            observer.update(this.currentWeather);
        }
    }

}
