package final_test_practice.observer.CA6;

import java.util.Random;

public class MainConsole {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        Dashboard dashboard = new Dashboard(playerData);
        playerData.setThoiGian(60);
        for (int i = 1; i <= 60; i++) {
            playerData.setGrade(i+1);
            playerData.setCountDown(i);
            playerData.setThoiGian(playerData.getThoiGian() - i);
        }
    }
}
