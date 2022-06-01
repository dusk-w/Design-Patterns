package chapter02.weatherByJava;

import java.util.Observable;

/**
 * 通过java.util实现气象站
 * Observable的缺点：
 * 1.Observable是一个类。java不支持多继承，这限制了observable的复用潜力。并且observable没有接口，所以无法建立自己的实现
 * 2.observable将关键的方法保护起来。setChange()方法被保护起来(protected)，
 *   这意味着除非继承自observable，否则无法创建Observable实例并组合到自己的对象中来。
 *   这个设计违反了第二个设计原则:多用组合，少用继承
 *
 * @author wei
 * @since 2022-06-01-23-55
 */
public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        // 传送数据对象，这里是"拉"
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }
}
