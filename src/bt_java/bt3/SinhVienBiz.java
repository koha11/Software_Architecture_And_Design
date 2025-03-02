package bt_java.bt3;

public class SinhVienBiz extends SinhVienNTU{
    public SinhVienBiz(String hoTen, float diemMarketing, float diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    private float diemMarketing, diemSales;

    @Override
    public float getDiemTB() {
        float sum = diemMarketing*2 + diemSales;

        return sum/3;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: ");
        System.out.println("Diem marketing: " + diemMarketing);
        System.out.println("Diem Sales: " + diemSales);
        System.out.println("Diem TB: " + getDiemTB());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
