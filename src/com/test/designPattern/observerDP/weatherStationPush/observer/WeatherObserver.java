package com.test.designPattern.observerDP.weatherStationPush.observer;

import com.test.designPattern.observerDP.weatherStationPush.observable.WeatherData;

public interface WeatherObserver {
    public void update(WeatherData data);
}
