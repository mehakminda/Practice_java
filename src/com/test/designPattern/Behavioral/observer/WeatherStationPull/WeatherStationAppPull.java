package com.test.designPattern.Behavioral.observer.WeatherStationPull;

import com.test.designPattern.Behavioral.observer.WeatherStationPull.observable.WeatherObservable;
import com.test.designPattern.Behavioral.observer.WeatherStationPull.observable.WeatherStation;
import com.test.designPattern.Behavioral.observer.WeatherStationPull.observer.CurrentConditionsDisplay;
import com.test.designPattern.Behavioral.observer.WeatherStationPull.observer.ForecastDisplay;

// Client code to demonstrate the Observer Pattern
public class WeatherStationAppPull {
    public static void main(String[] args) {
        //Pull based

        System.out.println("###### State Design Pattern ######");
        // Create the weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();

        // Create displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

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

