package behavioral.chain_of_responsibility.tien_dien;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKW) {
        int thanhTien = (soKW - min) * gia;

        System.out.println(this.tenBac + ": -->" + this.min + ": " + (soKW - min) + " x " + this.gia + " = " + thanhTien);

        return thanhTien;
    }
}
