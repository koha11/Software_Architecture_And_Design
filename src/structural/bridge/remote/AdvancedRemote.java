package structural.bridge.remote;

public class AdvancedRemote extends Remote{
    private int volumeMemo;
    boolean isMute = false;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        Device device = this.getDevice();

        if(!device.isEnabled())
        {
            System.out.println("TV haven't opened yet");
            return;
        }

        if(isMute) {
            device.setVolume(volumeMemo);
        }
        else {
            volumeMemo = device.getVolume();
            device.setVolume(0);
        }

        isMute = !isMute;

        System.out.println("Volume: " + device.getVolume());
    }
}
