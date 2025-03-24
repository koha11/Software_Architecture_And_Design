package behavioral.state.remote;

public class RemoteControll {
    private IRemoteState state;

    public RemoteControll() {
        state = new OffState();
    }

    public void setState(IRemoteState state) {
        this.state = state;
    }

    void powerPress() {
        state.handle(this);
    }
}
