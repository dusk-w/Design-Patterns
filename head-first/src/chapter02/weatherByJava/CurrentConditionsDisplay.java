package chapter02.weatherByJava;

import chapter02.weather.register.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 重做消费者
 *
 * @author wei
 * @since 2022-06-01-23-59
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
