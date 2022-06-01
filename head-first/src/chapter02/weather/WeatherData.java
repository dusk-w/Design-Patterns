package chapter02.weather;

import chapter02.weather.register.Observer;
import chapter02.weather.register.Subject;

import java.util.ArrayList;

/**
 * 天气数据类
 *
 * @author wei
 * @since 2022-06-01-23-12
 */
public class WeatherData implements Subject {

    private final ArrayList<Observer> observers;

    // 温度
    private double temperature;

    // 湿度
    private double humidity;

    // 气压
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public Boolean registerObserver(Observer o) {
        return observers.add(o);
    }

    @Override
    public Boolean removeObserver(Observer o) {
        return observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当从气象站得到更新观测值时，通知观察者
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
