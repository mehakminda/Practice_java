package com.test.designPattern.observerDP.weatherStationPush.observable;

import com.test.designPattern.observerDP.weatherStationPush.observer.WeatherObserver;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherReadings(float temperature, float humidity);
}
