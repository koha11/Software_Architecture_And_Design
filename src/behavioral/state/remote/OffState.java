package behavioral.state.remote;

public class OffState implements IRemoteState{

    @Override
    public void handle(RemoteControll remote) {
        remote.setState(new OnState());
    }
}
