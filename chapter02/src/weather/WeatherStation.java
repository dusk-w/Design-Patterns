package weather;

/**
 * 气象站
 *
 * @author wei
 * @since 2022-06-01-23-43
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(data);

        data.setMeasurements(80, 60, 30);
        data.setMeasurements(70,50,10);
        data.removeObserver(conditionsDisplay);
        data.setMeasurements(60,10,5);
    }
}
