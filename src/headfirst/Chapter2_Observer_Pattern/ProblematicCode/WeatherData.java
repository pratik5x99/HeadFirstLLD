package headfirst.Chapter2_Observer_Pattern.ProblematicCode;

public class WeatherData {
    private CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();
    public double getTemparature(){
        return 0.0;
    }
    public double getHumidity(){
        return 0.0;
    }
    public double getPressure(){
        return 0.0;
    }
    public void measurementsChanged(){
        double temp = getTemparature();
        double humidity = getHumidity();
        double pressure = getPressure();

        currentConditionsDisplay.update(temp,pressure,humidity);
        statisticsDisplay.update(temp,pressure,humidity);
        forecastDisplay.update(temp,pressure,humidity);

    }
}
