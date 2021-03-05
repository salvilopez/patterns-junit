package com.patterns.behavioral.observer.observer1;

/**
 * Main interface for concrete observers implementations
 * @author alan
 */
public interface WeatherObserver {

    /**
     * It executes the behaviour of observer when has been notified
     * @param type weather enum type
     */
    void update(WeatherType type);
}
