package final_test_practice.state.CF2;

public class Atm {
    private int innerTien;
    private AtmState state;

    public Atm() {
        innerTien = 0;
        state = new HetTienState();
    }

    public void setState(AtmState state) {
        this.state = state;
    }

    public void rutTien(int soTien) {
        state.handleRutTien(soTien, this);
    }

    public void napTien(int soTien) {
        state.handleNapTien(soTien, this);
    }

    public int getInnerTien() {
        return innerTien;
    }

    public void setInnerTien(int innerTien) {
        this.innerTien = innerTien;
    }
}
