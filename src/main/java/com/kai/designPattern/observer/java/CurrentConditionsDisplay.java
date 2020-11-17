package com.kai.designPattern.observer.java;
import java.util.Observable;
import java.util.Observer;

import com.kai.designPattern.observer.DisplayElement;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/03
 * @Description:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JWeatherData) {
            JWeatherData jWeatherData = (JWeatherData) o;
            this.temperature = jWeatherData.getTemperature();
            this.humidity = jWeatherData.getHumidity();
            display();
        }

    }
}
