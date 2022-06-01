package weatherByJava;

import weather.register.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 预测板
 *
 * @author wei
 * @since 2022-06-02-00-04
 */
public class ForecastDisplay implements Observer, DisplayElement {

    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable= observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("currentPressure: " + currentPressure + " last pressure: " + lastPressure);
    }
}
