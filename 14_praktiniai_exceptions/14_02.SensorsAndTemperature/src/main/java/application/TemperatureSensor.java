package application;

import java.util.Random;

import static java.lang.Math.random;

public class TemperatureSensor implements Sensor {
    private boolean on;

    public TemperatureSensor() {
        on=false;
    }

    @Override
    public boolean isOn() {

        return this.on;
    }

    @Override
    public void setOn() {
        on=true;
    }

    @Override
    public void setOff() {
        on=false;

    }

    @Override
    public int read() throws IllegalArgumentException {

        if (isOn()) return new Random().nextInt(61) - 30;
        else throw new IllegalArgumentException("Sensor is off!");

    }
}
