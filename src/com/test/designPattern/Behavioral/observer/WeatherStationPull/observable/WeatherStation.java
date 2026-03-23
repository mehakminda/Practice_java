package com.test.designPattern.Behavioral.observer.WeatherStationPull.observable;

import com.test.designPattern.Behavioral.observer.WeatherStationPull.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

// Concrete Observable (Subject)
// WeatherStation - the concrete observable class that holds weather data
public class WeatherStation implements WeatherObservable {
    // List of observers registered for updates
    private List<WeatherObserver> weatherObserverList;

    // Observable Data
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherStation() {
        weatherObserverList = new ArrayList<>();
    }


    @Override
    public void addObserver(WeatherObserver observer) {
            weatherObserverList.add(observer);
            System.out.println("[+] Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        weatherObserverList.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver wo: weatherObserverList){
            // Notify each observer about the change in weather data(state)
            wo.update(); // Observer will update its state based on the new data and respond accordingly
        }
    }

    @Override
    public void setWeatherReading(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "weatherObserverList=" + weatherObserverList +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
