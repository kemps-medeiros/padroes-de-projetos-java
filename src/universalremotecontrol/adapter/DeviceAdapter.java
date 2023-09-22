package universalremotecontrol.adapter;

import devices.DeviceInterface;
import universalremotecontrol.UniversalRemoteControlInterface;

public class DeviceAdapter implements UniversalRemoteControlInterface{
    private DeviceInterface device;

    public DeviceAdapter(DeviceInterface device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }
    
}
