package behavioral.strategy.mua_hang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private IKhuyenMai km;
    private IThanhToan httt;
    List<MatHang> dsmh = new ArrayList<>();

    public GioHang() {}

    void thanhToan() {
        float total = 0;

        System.out.println("Danh sach mat hang: ");
        for(MatHang mh: dsmh)
        {
            total += (mh.getGia() * mh.getSl());
            System.out.println(mh);
        }

        System.out.println("Tong tien la: " + total);
        System.out.println("Tien tru do KM: " + km.KhuyenMai(total));
        System.out.println("Tien tru do ptth: " + httt.thanhToan(total));

        total = total - httt.thanhToan(total) - km.KhuyenMai(total);


        System.out.println("Tong tien phai thanh toan la: " + total);
        dsmh.clear();
    }

    void themMH(MatHang mh) {
        dsmh.add(mh);
    }

    void boMH(MatHang mh) {
        dsmh.remove(mh);
    }

    public void setHttt(IThanhToan httt) {
        this.httt = httt;
    }

    public void setKm(IKhuyenMai km) {
        this.km = km;
    }
}
