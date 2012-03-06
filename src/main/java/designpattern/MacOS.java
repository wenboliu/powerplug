package designpattern;

public class MacOS {
    public boolean run(ChinesePower chinesePower) {
        if(220 != chinesePower.get220ElectricTension()) {
            return false;
        }
        if(50 != chinesePower.get50Frequency()) {
            return false;
        }
        if(!"A".equals(chinesePower.getAPlugShap())){
            return false;
        }
        System.out.println("Mac OS has been started successfully!");
        return true;
    }
}
