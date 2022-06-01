package chapter02.weatherByJava;

/**
 * 气象站
 *
 * @author wei
 * @since 2022-06-02-00-02
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);

        data.setMeasurements(1,1,1);
        data.deleteObserver(display);
        data.setMeasurements(2,2,2);

        ForecastDisplay forecastDisplay = new ForecastDisplay(data);

        data.setMeasurements(3,3,3);
    }
}
