package behavioral.state.thue_bao;

public class ThueBao {
    private ITrangThaiTieuDung state;
    private int soDu;

    public ThueBao() {
        soDu = 0;
        state = new NormalState();
    }

    public void setState(ITrangThaiTieuDung state) {
        this.state = state;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public void napTien(int soTien) {
        state.xuLyNapTien(soTien, this);
    }

    public void goiDien(int soPhut) {
        state.xuLyGoiDien(soPhut, this);

    }
    public void display() {
        state.handleDisplay(this);
    }


}
