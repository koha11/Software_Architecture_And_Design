package behavioral.chain_of_responsibility.atm;

public abstract class ChuoiMenhGiaFactory {
    public ChuoiMenhGiaFactory() {
    }

    protected abstract MenhGiaATM getChuoiMenhGia(int mgLonNhat);
    public void rutTien(int soTien, int mgLonNhat) {
        var m = getChuoiMenhGia(mgLonNhat);
        m.rutTien(soTien);
    }
}
