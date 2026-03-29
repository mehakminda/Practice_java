package com.test.designPattern.behaviour.observerDP.weatherStationPush.observer;

import com.test.designPattern.behaviour.observerDP.weatherStationPush.observable.WeatherData;

public class ForcastDisplay implements WeatherObserver{
    @Override
    public void update(WeatherData data) {
        System.out.println("ForcastDisplay : "+ data.toString());

    }
}
