package final_test_practice.observer.CA6;

public class PlayerData {
    private PlayerDataListener dashboard;
    private int thoiGian, countDown, grade;

    public PlayerData() {
        this.dashboard = null;
        this.thoiGian = 0;
        this.countDown = 0;
        this.grade = 0;
    }

    public void setDashboard(PlayerDataListener dashboard) {
        this.dashboard = dashboard;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        dashboard.listen(this);
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        dashboard.listen(this);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashboard.listen(this);
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                ", thoiGian=" + thoiGian +
                ", countDown=" + countDown +
                ", grade=" + grade +
                '}';
    }
}
