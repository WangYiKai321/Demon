package com.kai.designPattern.observer.java;
import java.util.Observable;

import lombok.Getter;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/03
 * @Description:
 */
@Getter
public class JWeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public JWeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();//注意这里调用的是无参的notify方法，说明观察者是使用拉的方式拉获取数据，所谓的拉指的是使用get方法主动拉取数据
        //对应的是notify带参数的push方法，push方法表明观察者在update方法的时候通过参数object获取而不是通过get方法获取
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
