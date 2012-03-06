package designpattern;

public class JapanPowerImpl implements JapanPower {
    private int electricTension;
    private int frequency;
    private String plugShap;

    public int get100ElectricTension() {
        return electricTension;
    }

    public int get50Frequency() {
        return frequency;
    }

    public String getAPlugShap() {
        return plugShap;
    }

    public void plug() {
        electricTension = 100;
        frequency = 50;
        plugShap = "A";
    }
}
