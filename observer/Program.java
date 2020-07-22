package observer;

public class Program {

    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(1, 2, 3);


    }
    
}