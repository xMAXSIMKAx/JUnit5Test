package App.System;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThermostatTest {

    @Test
    void testValidTemperature() {
        int validTemperature = 20;
        assertDoesNotThrow(() -> new Thermostat().validateTemperature(validTemperature));
    }

    @Test
    void testLowerBoundTemperature() {
        int lowerBoundTemperature = -10;
        assertDoesNotThrow(() -> new Thermostat().validateTemperature(lowerBoundTemperature));
    }

    @Test
    void testUpperBoundTemperature() {
        int upperBoundTemperature = 35;
        assertDoesNotThrow(() -> new Thermostat().validateTemperature(upperBoundTemperature));
    }

    @Test
    void testBelowLowerBoundTemperature() {
        int belowLowerBoundTemperature = -11;
        assertThrows(TemperatureOutOfRangeException.class, () -> new Thermostat().validateTemperature(belowLowerBoundTemperature));
    }

    @Test
    void testAboveUpperBoundTemperature() {
        int aboveUpperBoundTemperature = 36;
        assertThrows(TemperatureOutOfRangeException.class, () -> new Thermostat().validateTemperature(aboveUpperBoundTemperature));
    }
}