package com.test.designPattern.Behavioral.observer.WeatherStationPush;

import com.test.designPattern.Behavioral.observer.WeatherStationPush.observable.WeatherObservable;
import com.test.designPattern.Behavioral.observer.WeatherStationPush.observable.WeatherStation;
import com.test.designPattern.Behavioral.observer.WeatherStationPush.observer.CurrentConditionsDisplay;
import com.test.designPattern.Behavioral.observer.WeatherStationPush.observer.ForecastDisplay;

// Client code to demonstrate the Observer Pattern
public class WeatherStationAppPush {
    public static void main(String[] args) {
        //Push based

        System.out.println("###### State Design Pattern ######");
        // Create the weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();

        // Create displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        //add Observers
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);

        //weather update
        System.out.println("===>>> Initial Weather Update");
        weatherStation.setWeatherReading(80, 65, 30.4f);

        System.out.println("===>>> Second Weather Update");
        weatherStation.setWeatherReading(82, 70, 29.2f);

        // Remove forecast display
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("===>>> Third Weather Update");
        weatherStation.setWeatherReading(70, 21, 29.2f);
        // Forecast display will not be notified
    }
}

