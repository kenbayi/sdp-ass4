package observerPattern;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
