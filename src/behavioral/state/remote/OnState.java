package behavioral.state.remote;

public class OnState implements IRemoteState{
    @Override
    public void handle(RemoteControll remote) {
        remote.setState(new OffState());
    }
}
