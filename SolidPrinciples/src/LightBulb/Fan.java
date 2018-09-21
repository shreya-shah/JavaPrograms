package LightBulb;

public class Fan implements ElectricalAppliance {
    public boolean turnOn(){
        System.out.println("Fan Turning on");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Fan Turning off");
        return false;
    }
}
