package behavioral.observer.game;

import java.util.Random;

public class MainGame {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(0,5, 0);

        Dashboard dashboard = new Dashboard(playerData);


        for (int i = 4; i >= 0; i--) {
            playerData.setThoiGian(playerData.getThoiGian()+1);
            playerData.setGrade(playerData.getGrade() + new Random().nextInt(11));
            playerData.setCountdown(i);
        }

    }
}
