package final_test_practice.state.CF2;

public class HetTienState implements AtmState{
    @Override
    public void handleRutTien(int soTien, Atm atm) {
        System.out.println("Số tiền trong máy bằng 0");
    }

    @Override
    public void handleNapTien(int soTien, Atm atm) {
        atm.setInnerTien(atm.getInnerTien() + soTien);
        atm.setState(new SanSangState());
    }
}
