package application;

public class StandardSensor implements Sensor {
    private int degree;

    public StandardSensor(int degree) {
        this.degree=degree;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return degree;
    }
}
