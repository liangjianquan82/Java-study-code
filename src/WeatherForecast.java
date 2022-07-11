public class WeatherForecast {
    private double temperature ;
    private String skyCondition ;
    private double celsiusTemperature ;

    public WeatherForecast() {
    }
    public WeatherForecast(double temperature,String skyCondition) {
        this.temperature = temperature;
        this.skyCondition = skyCondition;
        fahrenheitToCelsius();
        System.out.println("Defaults are set.");
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getSkyCondition() {
        return skyCondition;
    }

    public void setSkyCondition(String skyCondition) {
        this.skyCondition = skyCondition;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "temperature=" + temperature +
                ", skyCondition='" + skyCondition + '\'' +
                '}';
    }

    public void set(double temperature, String skyCondition) {
        this.temperature = temperature;
        this.skyCondition = skyCondition;
        fahrenheitToCelsius();
        System.out.println("Info updated.");
    }

    public void getFahrenheit() {
        System.out.println("Current temperature: " + temperature + " in Fahrenheit.\n" +
                "Current sky condition: " + skyCondition + "!");
        rangeTemperature();
        temperatureAndSkyCondition();
    }

    public void getCelsius() {
        System.out.println("Current temperature: " + String.format("%.5f", celsiusTemperature)  + " in Celsius.\n" +
                "Current sky condition: " + skyCondition + "!");
        rangeTemperature();
        temperatureAndSkyCondition();
    }

    private void fahrenheitToCelsius() {
        this.celsiusTemperature = (temperature - 32) * 5 / 9;
    }

    private void rangeTemperature() {
        if (temperature < -50 || temperature > 150) {
            System.out.println("temperature is not within the normal range: Extreme cold weather");
        }else if(temperature > 150){
            System.out.println("temperature is not within the normal range: Extremely hot weather");
        }
    }

    private void temperatureAndSkyCondition() {
        if ((temperature > 32 && skyCondition.equals("Snowy")) || (temperature < 32 && skyCondition.equals("Rainy"))) {
            System.out.println("Be careful. The weather is not consistent.");
        }
    }
}
