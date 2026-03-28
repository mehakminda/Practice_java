package com.test.designPattern.observerDP.weatherStationPull.observable;

import com.test.designPattern.observerDP.weatherStationPull.observer.WeatherObserver;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherReadings(float temperature, float humidity);
}
