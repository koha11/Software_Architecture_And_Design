package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        DichVuTiGia dvtg = new DichVuTiGia();
        NhaDauTu khoa = new NhaDauTuA("Trần Anh Khoa",dvtg);
        NhaDauTu vinh = new NhaDauTuB("Khánh Vĩnh", dvtg);

        khoa.dangKy();
        vinh.dangKy();

        dvtg.thongBao(10);

        vinh.huyDangKy();
        dvtg.thongBao(-3);
    }
}
