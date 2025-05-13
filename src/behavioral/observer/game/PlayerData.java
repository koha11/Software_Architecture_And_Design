package behavioral.observer.game;

public class PlayerData {
    private int thoiGian, countdown, grade;
    private PlayerDataListener dashboard;

    public PlayerData(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public int getCountdown() {
        return countdown;
    }

    public int getGrade() {
        return grade;
    }

    public void setDashboard(PlayerDataListener dashboard) {
        this.dashboard = dashboard;
    }

    public void removeDashboard(PlayerDataListener dashboard) {
        this.dashboard = null;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        if(dashboard != null)
            dashboard.listen(this);
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        if(dashboard != null)
            dashboard.listen(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        if(dashboard != null)
            dashboard.listen(this);
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "thoiGian=" + thoiGian +
                ", countdown=" + countdown +
                ", grade=" + grade +
                '}';
    }
}
