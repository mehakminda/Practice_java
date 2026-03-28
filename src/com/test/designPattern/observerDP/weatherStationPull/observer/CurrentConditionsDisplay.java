package com.test.designPattern.observerDP.weatherStationPull.observer;

import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherData;
import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherObservable;

public class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherObservable weatherObservable;

    public CurrentConditionsDisplay(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("CurrentConditionsDisplay : "+ weatherObservable.toString());
        //we can use toString or getWeatherData() method

    }
}
