package com.test.designPattern.behaviour.observerDP.weatherStationPush.observer;

import com.test.designPattern.behaviour.observerDP.weatherStationPush.observable.WeatherData;

public interface WeatherObserver {
    public void update(WeatherData data);
}
