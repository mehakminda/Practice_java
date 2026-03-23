package com.test.designPattern.Behavioral.observer.WeatherStationPull.observer;

import com.test.designPattern.Behavioral.observer.WeatherStationPull.observable.WeatherObservable;

//Concrete Observer 1: current condition display (on TV or mobile)
public class CurrentConditionsDisplay implements WeatherObserver {
    private final WeatherObservable weatherStation;

    public CurrentConditionsDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    // CurrentConditionsDisplay implements the update method in its own way
    @Override
    public void update() {
        System.out.println("Saving weather data... ");
        display();
    }

    // Display the current weather conditions
    public void display() {
        System.out.println("Current Weather Conditions: " + weatherStation.toString());
    }
}

