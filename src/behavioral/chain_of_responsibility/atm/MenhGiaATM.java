package behavioral.chain_of_responsibility.atm;

abstract public class MenhGiaATM {
    protected int giaTri;

    public MenhGiaATM(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep);
    public abstract void rutTien(int soTien);
}
