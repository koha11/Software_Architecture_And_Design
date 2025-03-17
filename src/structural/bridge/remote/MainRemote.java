package structural.bridge.remote;

public class MainRemote {
    public static void main(String[] args) {
        AdvancedRemote r = new AdvancedRemote(new TV());

        r.togglePower();

        for (int i = 0; i < 10; i++) {
            r.volumeUp();
        }

        r.volumeDown();

        r.mute();
        r.mute();
    }
}
