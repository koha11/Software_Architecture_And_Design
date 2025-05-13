package behavioral.strategy.mua_hang;

public class MainMuaHang {
    public static void main(String[] args) {
        GioHang gh = new GioHang();
        MatHang tao = new MatHang("Tao", 16.5f, 10);
        MatHang cam = new MatHang("Cam", 22.8f, 2);
        gh.themMH(tao);
        gh.themMH(cam);
        gh.setHttt(new COD());
        gh.setKm(new KhuyenMai_10_Max100());
        gh.thanhToan();
    }
}
