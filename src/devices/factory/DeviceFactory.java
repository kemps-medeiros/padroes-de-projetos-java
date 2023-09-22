package devices.factory;

import devices.DVDPlayer;
import devices.DeviceInterface;
import devices.TV;

public class DeviceFactory {
        public DeviceInterface createDevice(String deviceType) {
        switch (deviceType) {
            case "tv":
                return new TV();
            case "dvd":
                return new DVDPlayer();
            default:
                throw new IllegalArgumentException("Dispositivo não suportado: " + deviceType);
        }
    }
}
