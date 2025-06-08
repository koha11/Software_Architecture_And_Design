package final_test_practice.state.CF2;

public class MainAtm {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.napTien(100_000_000);
        atm.rutTien(30_000_000);
        atm.rutTien(40_000_000);
        atm.rutTien(50_000_000);
    }
}
