package com.test.designPattern.Behavioral.observer.WeatherStationPush.observer;

// Concrete Observer 4 - Forecast Display - Predicts weather based on pressure changes
public class ForecastDisplay implements WeatherObserver {


    // ForecastDisplay implements the update method in its own way
    @Override
    public void update() {
        System.out.println("Updating weather data to do some analytics using push " );
        display();
    }

    // Display the forecast based on the current pressure
    public void display() {
        System.out.println("Forecast Details: Displaying information about Rain, " +
                "Temperature Trends, Significant Weather Events and other phenomemnon...");
    }
}

