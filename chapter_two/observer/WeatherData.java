package chapter_two.observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
    }   

    public void measurementChangd(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChangd();
    }

    public float getTemperature() {
        return temperature;
    }

    
    public float getHumidity() {
        return humidity;
    }

    

    public float getPressure() {
        return pressure;
    }
    
}