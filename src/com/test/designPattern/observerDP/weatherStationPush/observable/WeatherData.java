package com.test.designPattern.observerDP.weatherStationPush.observable;

public class WeatherData {
    private float temperature;
    private float humidity;

    public WeatherData(float temperature, float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
    }
    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
