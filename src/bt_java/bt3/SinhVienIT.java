package bt_java.bt3;

public class SinhVienIT extends SinhVienNTU {

    public SinhVienIT(String hoTen, float diemJava, float diemCSS, float diemHTMl) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTMl = diemHTMl;
    }

    private float diemJava, diemCSS, diemHTMl;

    @Override
    public float getDiemTB() {
        float sum = diemJava*2 + diemCSS + diemHTMl;

        return sum/4;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: ");
        System.out.println("Diem Java: " + diemJava);
        System.out.println("Diem HTML: " + diemHTMl);
        System.out.println("Diem CSS: " + diemCSS);
        System.out.println("Diem TB: " + getDiemTB());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
