package devices;

public class DVDPlayer implements DeviceInterface{

    @Override
    public void powerOn() {
        System.out.println("Ligando o DVD Player...");
    }

    @Override
    public void powerOff() {
        System.out.println("Desligando o DVD Player...");
    }
    
}
