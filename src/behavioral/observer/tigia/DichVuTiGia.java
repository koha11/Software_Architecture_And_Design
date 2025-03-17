package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia{
    List<ThayDoiTiGia> nhaDauTus = new ArrayList<>();
    void dangKy(ThayDoiTiGia ndt) {
        if (nhaDauTus.contains(ndt))
            System.out.println("Nha dau tu nay da dang ky roi");
        else
            nhaDauTus.add(ndt);
    }
    void huyDangKy(ThayDoiTiGia ndt) {
        if (!nhaDauTus.contains(ndt))
            System.out.println("Nha dau tu nay chua dang ky");
        else
            nhaDauTus.remove(ndt);
    }
    void thongBao(float delta) {
        for (var ndt : nhaDauTus)
            ndt.nhanThongBao(delta);
    }
}
