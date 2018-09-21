package LightBulb;

public class LightBulb implements ElectricalAppliance{

    public boolean turnOn(){
        System.out.println("Turning on");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Turning off");
        return false;
    }
}
