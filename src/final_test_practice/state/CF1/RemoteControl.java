package final_test_practice.state.CF1;

public class RemoteControl {
    private RemoteState state;

    public RemoteControl() {
        this.state = new OffState();
    }

    public void pressPower() {
        state.handlePressPower(this);
    }

    public void setState(RemoteState state) {
        this.state = state;
    }
}
