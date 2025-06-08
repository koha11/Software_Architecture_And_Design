package final_test_practice.state.CF1;

public class OffState implements RemoteState{
    @Override
    public void handlePressPower(RemoteControl remote) {
        remote.setState(new OnState());
        System.out.println("TV dang bat");
    }
}
