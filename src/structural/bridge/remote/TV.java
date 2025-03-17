package structural.bridge.remote;

public class TV implements Device{
    private int volume = 0;
    private boolean enable = false;

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
        System.out.println("Turn on TV ...");
    }

    @Override
    public void disable() {
        enable = false;
        System.out.println("Turn off TV ...");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }
}
