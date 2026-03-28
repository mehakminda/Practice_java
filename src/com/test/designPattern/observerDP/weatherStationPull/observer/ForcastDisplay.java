package com.test.designPattern.observerDP.weatherStationPull.observer;

import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherData;
import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherObservable;

public class ForcastDisplay implements WeatherObserver {

    private final WeatherObservable weatherObservable;

    public ForcastDisplay(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("ForcastDisplay "+weatherObservable.toString());

    }
}
