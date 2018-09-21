package LightBulb;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch aSwitch = new Switch(lightBulb);
        aSwitch.toggle();
        aSwitch.toggle();
        aSwitch.toggle();

        Fan fan = new Fan();
        Switch bSwitch = new Switch(fan);
        bSwitch.toggle();
        bSwitch.toggle();
        bSwitch.toggle();

    }
}
