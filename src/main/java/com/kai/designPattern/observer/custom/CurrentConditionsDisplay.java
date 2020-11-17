package com.kai.designPattern.observer.custom;
import com.kai.designPattern.observer.DisplayElement;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/02
 * @Description:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
