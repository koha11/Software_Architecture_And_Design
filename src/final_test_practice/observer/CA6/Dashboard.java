package final_test_practice.observer.CA6;

public class Dashboard implements PlayerDataListener{
    private PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.setDashboard(this);
    }

    @Override
    public void listen(PlayerData playerData) {
        this.playerData = playerData;
        System.out.println(this.playerData);
    }
}
