package com.test.designPattern.behaviour.observerDP.weatherStationPush.observable;

import com.test.designPattern.behaviour.observerDP.weatherStationPush.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable{
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
            observer.update(weatherData);
        }

    }

    @Override
    public void setWeatherReadings(float temperature, float humidity) {
        this.weatherData=new WeatherData(temperature,humidity);

    }

    public WeatherData getWeatherData(){
        return weatherData;
    }
}
