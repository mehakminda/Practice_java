package com.test.designPattern.Behavioral.observer.WeatherStationPush.observer;

//Concrete Observer 1: current condition display (on TV or mobile)
public class CurrentConditionsDisplay implements WeatherObserver {

    // CurrentConditionsDisplay implements the update method in its own way
    @Override
    public void update() {
        System.out.println("Saving weather data... ");
        display();
    }

    // Display the current weather conditions
    public void display() {
        System.out.println("Current Weather Conditions:  using push");
    }
}

