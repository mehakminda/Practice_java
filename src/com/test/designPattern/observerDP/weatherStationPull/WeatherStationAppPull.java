package com.test.designPattern.observerDP.weatherStationPull;

import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherObservable;
import com.test.designPattern.observerDP.weatherStationPull.observable.WeatherStation;
import com.test.designPattern.observerDP.weatherStationPull.observer.CurrentConditionsDisplay;
import com.test.designPattern.observerDP.weatherStationPull.observer.ForcastDisplay;

public class WeatherStationAppPull {
    static void main() {

        WeatherObservable weatherObservable=new WeatherStation() ;

        //registered the weatherObservable(weatherStation) in these 2 observer
        // //and also added these 2 observer in observer list of weatherObservable(weatherStation)
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherObservable);
        ForcastDisplay forcastDisplay=new ForcastDisplay(weatherObservable);



        weatherObservable.setWeatherReadings(30.7F, 15.9F);

        System.out.println("---------------------");
        weatherObservable.setWeatherReadings(40.1F,20F);



        System.out.println("---------------------");
        weatherObservable.removeObserver(forcastDisplay);
        weatherObservable.setWeatherReadings(50.1F,30F);




    }
}
