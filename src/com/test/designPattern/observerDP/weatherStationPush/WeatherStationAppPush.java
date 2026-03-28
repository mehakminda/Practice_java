package com.test.designPattern.observerDP.weatherStationPush;

import com.test.designPattern.observerDP.weatherStationPush.observable.WeatherObservable;
import com.test.designPattern.observerDP.weatherStationPush.observable.WeatherStation;
import com.test.designPattern.observerDP.weatherStationPush.observer.CurrentConditionsDisplay;
import com.test.designPattern.observerDP.weatherStationPush.observer.ForcastDisplay;

public class WeatherStationAppPush {
    static void main() {

        WeatherObservable weatherObservable=new WeatherStation() ;

        ForcastDisplay forcastDisplay=new ForcastDisplay();
        weatherObservable.addObserver(new CurrentConditionsDisplay());
        weatherObservable.addObserver(forcastDisplay);

        System.out.println("---------Initial weather updates------------");
        weatherObservable.setWeatherReadings(30.7F, 15.9F);
        weatherObservable.notifyObservers();

        System.out.println("---------Second weather updates------------");
        weatherObservable.setWeatherReadings(40.1F,20F);
        weatherObservable.notifyObservers();


        System.out.println("----------Removed one Observer-----------");
        weatherObservable.removeObserver(forcastDisplay);
        weatherObservable.setWeatherReadings(50.1F,30F);
        weatherObservable.notifyObservers();




    }
}
