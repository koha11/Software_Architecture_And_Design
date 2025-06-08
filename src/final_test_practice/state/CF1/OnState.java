package final_test_practice.state.CF1;

public class OnState implements RemoteState{
    @Override
    public void handlePressPower(RemoteControl remote) {
        remote.setState(new OffState());
        System.out.println("TV dang tat");
    }
}
