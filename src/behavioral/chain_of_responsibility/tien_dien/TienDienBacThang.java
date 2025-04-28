package behavioral.chain_of_responsibility.tien_dien;

public abstract class TienDienBacThang {
    protected String tenBac;
    protected int min, max, gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract TienDienBacThang bacKeTiep(TienDienBacThang b);
    public abstract int tinhTienDien(int soKW);
}
