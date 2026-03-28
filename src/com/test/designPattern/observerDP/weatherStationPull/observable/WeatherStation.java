package com.test.designPattern.observerDP.weatherStationPull.observable;

import com.test.designPattern.observerDP.weatherStationPull.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private List<WeatherObserver> observerList;
    private WeatherData weatherData;

    public WeatherStation(){
        this.observerList=new ArrayList<>();
    }
    @Override
    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer: observerList){
            // Notify each observer about the change in weather data(state)
            observer.update(); // Observer will update its state based on the new data and respond accordingly

        }

    }

    @Override
    public void setWeatherReadings(float temperature, float humidity) {
        this.weatherData=new WeatherData(temperature,humidity);
        notifyObservers();

    }

    public WeatherData getWeatherData(){
        return weatherData;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "weatherData=" + weatherData +
                '}';
    }
}
