package homework4.level1;

public class TempCalculator {

    double celsiusToFarenheit (double celsius){
        return celsius*1.8 + 32;
    }

    double farenheitToCelsius (double farenheit){
        return (farenheit - 32) / 1.8;
    }
}
