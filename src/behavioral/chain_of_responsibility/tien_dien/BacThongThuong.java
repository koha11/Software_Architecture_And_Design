package behavioral.chain_of_responsibility.tien_dien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
        bacKeTiep = null;
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        this.bacKeTiep = b;
        return b;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if(soKW <= this.max)
        {
            int thanhTien = (soKW - min) * gia;

            System.out.println(this.tenBac + ": " + this.min + "-->" + this.max + ": " + (soKW - min) + " x " + this.gia + " = " + thanhTien);

            return thanhTien;
        }
        else
        {
            int thanhTien = (max - min) * gia;

            System.out.println(this.tenBac + ": " + this.min + "-->" + this.max + ": " + (soKW - min) + " x " + this.gia + " = " + thanhTien);

            return (max - min) * gia + bacKeTiep.tinhTienDien(soKW);
        }
    }
}
