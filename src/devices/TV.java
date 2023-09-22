package devices;

public class TV implements DeviceInterface{

    @Override
    public void powerOn() {
        System.out.println("Ligando a TV...");
    }

    @Override
    public void powerOff() {
        System.out.println("Desligando a TV...");
    }
    
}
