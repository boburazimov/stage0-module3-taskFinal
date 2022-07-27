package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        // (30 °C × 9/5) + 32 = 86 °F
        double fahrenheit = (temperatureCelsius * 9.0/5.0) + 32.0;
        System.out.println(fahrenheit);
    }
}
