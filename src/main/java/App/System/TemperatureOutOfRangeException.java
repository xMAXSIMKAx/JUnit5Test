package App.System;

public class TemperatureOutOfRangeException extends Exception {
    //TemperatureOutOfRangeException Це власний клас винятку, який буде використовуватися для сигналізації про те, що температура знаходиться за межами допустимого діапазону.
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}
