package designpattern;

public class ChinesePowerImpl implements ChinesePower {
    private int electricTension;
    private int frequency;
    private String plugShap;

    public int get220ElectricTension() {
        return electricTension;
    }

    public int get50Frequency() {
        return frequency;
    }

    public String getAPlugShap() {
        return plugShap;
    }

    public void plug() {
        electricTension = 220;
        frequency = 50;
        plugShap = "A";
    }
}
