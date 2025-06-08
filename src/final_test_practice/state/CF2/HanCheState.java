package final_test_practice.state.CF2;

public class HanCheState implements AtmState{
    @Override
    public void handleRutTien(int soTien, Atm atm) {
        if(atm.getInnerTien() >= soTien)
        {
            atm.setState(new SanSangState());
            atm.rutTien(soTien);
            return;
        }

        if(atm.getInnerTien() == 0)
        {
            atm.setState(new HetTienState());
            atm.rutTien(soTien);
            return;
        }

        System.out.println("Có tiền cho khách hàng rút nhưng lại không đủ số tiền tối đa cho mỗi lần rút");
    }

    @Override
    public void handleNapTien(int soTien, Atm atm) {
        atm.setInnerTien(atm.getInnerTien() + soTien);
        atm.setState(new SanSangState());
    }
}
