package creational.builder.hoadon;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hdHeader;
    private List<CTHD> cthds;

    protected HoaDon(Builder b) {
        this.hdHeader = b.hdHeader;
        this.cthds = b.cthds;
    }

    public void inHoaDon() {
        //In header
        System.out.println(hdHeader.toString());

        //In
        for (var cthd: cthds)
            System.out.println(cthd.toString());
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "hdHeader=" + hdHeader.toString() +
                '}';
    }

    public static class Builder {
        private HoaDonHeader hdHeader;
        private List<CTHD> cthds;

        public Builder buildHDHeader(String maHD, String tenKH, String ngayBan) {
            hdHeader = new HoaDonHeader(maHD,tenKH,ngayBan);

            return this;
        }

        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau) {
            CTHD cthd = new CTHD(sanPham,soLuong,donGia,chietKhau);

            if(cthds == null)
                cthds = new ArrayList<>();

            cthds.add(cthd);

            return this;
        }
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
