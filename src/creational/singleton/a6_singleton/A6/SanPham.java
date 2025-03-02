package creational.singleton.a6_singleton.A6;

public class SanPham {
    public SanPham(String maSP, String tenSP, int SL, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.SL = SL;
        this.donGia = donGia;
    }

    private String maSP, tenSP;
    private int SL, donGia;

    @Override
    public String toString() {
        return getMaSP() + "\t" + getTenSP() + "\t" + getSL() + "\t" + getDonGia();
    }
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
