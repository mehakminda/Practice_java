package com.test.designPattern.Behavioral.observer.WeatherStationPull.observable;

import com.test.designPattern.Behavioral.observer.WeatherStationPull.observer.WeatherObserver;

// Observable(Subject) interface
// Defines methods for managing observers and notifying them of changes
public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherReading(float temperature, float humidity, float pressure);
}
