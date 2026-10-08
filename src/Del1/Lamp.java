package Del1;

public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    @Override
    public String toString() {
        return "Lamp watt: " + watt + " isOn: " + isOn;
    }
}