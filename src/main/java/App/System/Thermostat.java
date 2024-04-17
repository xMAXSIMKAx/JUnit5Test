package App.System;

import App.System.TemperatureOutOfRangeException;

public class Thermostat {
    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;

    public void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter current temperature: ");
        int currentTemperature = scanner.nextInt();

        try {
            validateTemperature(currentTemperature);
            System.out.println("Temperature is within the valid range.");

        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Temperature is out of range: " + e.getMessage());

        }
    }

    public void validateTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            throw new TemperatureOutOfRangeException("Temperature is out of range.");
        }
    }
}