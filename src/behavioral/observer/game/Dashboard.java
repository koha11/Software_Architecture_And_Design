package behavioral.observer.game;

public class Dashboard implements PlayerDataListener{
    private PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.setDashboard(this);
    }

    @Override
    public void listen(PlayerData p) {
        System.out.println(p.toString());
    }
}
