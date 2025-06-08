package final_test_practice.state.CF2;

public class SanSangState implements AtmState{
    @Override
    public void handleRutTien(int soTien, Atm atm) {
        if(atm.getInnerTien() < soTien)
        {
            atm.setState(new HanCheState());
            atm.rutTien(soTien);
            return;
        }

        atm.setInnerTien(atm.getInnerTien() - soTien);
        System.out.println("Có tiền để khách hàng rút. Khách hàng có thể rút số tiền tối đa mỗi lần rút.");
    }

    @Override
    public void handleNapTien(int soTien, Atm atm) {
        atm.setInnerTien(atm.getInnerTien() + soTien);
    }
}
