package behavioral.observer.tigia;

public abstract class NhaDauTu implements ThayDoiTiGia {
    String ten;
    DichVuTiGia dvtg;

    public NhaDauTu(String ten, DichVuTiGia dvtg) {
        this.ten = ten;
        this.dvtg = dvtg;
//        this.dangKy();
    }

    public void dangKy() {
        dvtg.dangKy(this);
    }

    public void huyDangKy() {
        dvtg.huyDangKy(this);
    }
}
