package com.test.designPattern.observerDP.weatherStationPush.observer;

import com.test.designPattern.observerDP.weatherStationPush.observable.WeatherData;

public class ForcastDisplay implements WeatherObserver{
    @Override
    public void update(WeatherData data) {
        System.out.println("ForcastDisplay : "+ data.toString());

    }
}
