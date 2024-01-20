package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList<>();

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);

    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if(sensors==null)throw new IllegalStateException("sensor is null");
        else if (sensors.isEmpty()) throw new IllegalStateException("sensor is empty");
        else if (!sensors.stream().allMatch(Sensor::isOn)) throw new IllegalStateException("Sensor is off");
        return (int) sensors.stream().mapToInt(Sensor::read).average().orElse(0);
    }
    public List<Integer> readings() throws AssertionError{

        List<Integer> reading = new ArrayList<>();
        if (reading==null) throw new AssertionError("null arrayList");
        for (Sensor unit:sensors){
            reading.add(unit.read());
        }
        return reading;
    }
}
