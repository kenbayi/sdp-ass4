package observerPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);

        weatherStation.setMeasurements(20, 65, 30.7f);
        weatherStation.setMeasurements(30, 70, 28.2f);
    }
}
