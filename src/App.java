import devices.DeviceInterface;
import devices.factory.DeviceFactory;
import universalremotecontrol.UniversalRemoteControlInterface;
import universalremotecontrol.adapter.DeviceAdapter;

public class App {
    public static void main(String[] args) throws Exception {
        DeviceFactory deviceFactory = new DeviceFactory();
        
        DeviceInterface tv = deviceFactory.createDevice("tv");
        DeviceInterface dvd = deviceFactory.createDevice("dvd");

        UniversalRemoteControlInterface tvRemote = new DeviceAdapter(tv);
        UniversalRemoteControlInterface dvdRemote = new DeviceAdapter(dvd);
        
        tvRemote.powerOn();
        tvRemote.powerOff();
        
        dvdRemote.powerOn();
        dvdRemote.powerOff();
    }
}
