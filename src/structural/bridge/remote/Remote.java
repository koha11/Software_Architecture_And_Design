package structural.bridge.remote;

public class Remote {
    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeDown() {
        if(device.getVolume() > 0 && device.isEnabled())
            device.setVolume(device.getVolume()-1);

        System.out.println("Volume: " + device.getVolume());
    }

    public void volumeUp() {
        if(device.getVolume() < 100 && device.isEnabled())
            device.setVolume(device.getVolume()+1);

        System.out.println("Volume: " + device.getVolume());
    }

    public Device getDevice() {
        return device;
    }
}
