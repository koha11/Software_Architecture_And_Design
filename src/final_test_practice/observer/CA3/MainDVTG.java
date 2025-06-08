package final_test_practice.observer.CA3;

public class MainDVTG {
    public static void main(String[] args) {
        DichVuTiGia dvtg = new DichVuTiGia();
        NhaDauTu ndta = new NhaDauTu("A", dvtg);
        NhaDauTu ndtb = new NhaDauTu("B", dvtg);
        NhaDauTu ndtc = new NhaDauTu("C", dvtg);

        dvtg.updateTiGia(-0.03f);
        dvtg.updateTiGia(-0.08f);
        dvtg.updateTiGia(3.03f);
        ndtb.huyDangKy();
        dvtg.updateTiGia(7.03f);
    }
}
