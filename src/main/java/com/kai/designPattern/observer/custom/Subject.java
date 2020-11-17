package com.kai.designPattern.observer.custom;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/02
 * @Description:
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
