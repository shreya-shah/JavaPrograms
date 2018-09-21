package LightBulb;

public class Switch {
   private boolean state;
   private ElectricalAppliance appliance;

    public Switch(ElectricalAppliance appliance) {
        this.appliance = appliance;
    }

    public void toggle(){
        if(state){
            appliance.turnOff();
            state = false;
        }else{
            appliance.turnOn();
            state = true;
        }
    }
}
