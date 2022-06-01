package chapter02.weather;

import chapter02.weather.register.DisplayElement;
import chapter02.weather.register.Observer;
import chapter02.weather.register.Subject;

/**
 * 根据Data对象显示当前观测值
 *
 * @author wei
 * @since 2022-06-01-23-23
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temp;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
