package com.kai.designPattern.observer.custom.test;
import com.kai.designPattern.observer.custom.CurrentConditionsDisplay;
import com.kai.designPattern.observer.custom.WeatherData;
import com.kai.designPattern.observer.java.JWeatherData;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/02
 * @Description:
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(80, 65, 40.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.f);

        JWeatherData jWeatherData = new JWeatherData();
        com.kai.designPattern.observer.java.CurrentConditionsDisplay conditionsDisplay = new com.kai.designPattern.observer.java.CurrentConditionsDisplay(jWeatherData);
        jWeatherData.setMeasurements(80, 65, 40.4f);
        jWeatherData.setMeasurements(82, 70, 29.2f);
        jWeatherData.setMeasurements(78, 90, 29.f);
    }
}
