package com.test.designPattern.behaviour.observerDP.weatherStationPush.observer;

import com.test.designPattern.behaviour.observerDP.weatherStationPush.observable.WeatherData;

public class CurrentConditionsDisplay implements WeatherObserver{
    @Override
    public void update(WeatherData data) {
        System.out.println("CurrentConditionsDisplay: "+data.toString());
        //we can use toString or getWeatherData() method

    }
}
