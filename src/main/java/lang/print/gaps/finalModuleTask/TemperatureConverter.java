package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        // (30 °C × 9/5) + 32 = 86 °F
        int fahrenheit = (temperatureCelsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
