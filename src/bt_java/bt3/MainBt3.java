package bt_java.bt3;

public class MainBt3 {
    public static void main(String[] args) {
        SinhVienNTU svNTU = new SinhVienNTU("Khoa", "Khong") {
            @Override
            public float getDiemTB() {
                return 0;
            }
        };

        SinhVienNTU svIT = new SinhVienIT("Khoa", 9.0f, 6.8f, 7.9f);
        SinhVienNTU svBiz = new SinhVienBiz("Vinh",9.5f, 6.8f);

        svNTU.inThongTin();
        svIT.inThongTin();
        svBiz.inThongTin();
    }
}
