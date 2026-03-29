package com.test.designPattern.behaviour.observerDP.weatherStationPush.observable;

import com.test.designPattern.behaviour.observerDP.weatherStationPush.observer.WeatherObserver;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherReadings(float temperature, float humidity);
}
