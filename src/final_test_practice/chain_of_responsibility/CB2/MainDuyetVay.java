package final_test_practice.chain_of_responsibility.CB2;

public class MainDuyetVay{
    public static void main(String[] args) {
        var nv1 = new NhanVienDuyet(5_000_000, "Phó trưởng phòng");

        var nv2 = new NhanVienDuyet(15_000_000, "Trưởng phòng");

        var nv3 = new NhanVienDuyet(25_000_000, "Giám đốc");

        var nv4 = new NhanVienDuyet(35_000_000, "Phó trưởng phòng");

        var ct = new NhanVienDuyet(0, "Chủ tịch");

        nv1
                .setTiepTheo(nv2)
                .setTiepTheo(nv3)
                .setTiepTheo(nv4)
                .setTiepTheo(ct);

        nv1.duyetKhoanVay(new HoSoVay("Vay mua ngan hang", 1_400_000));

        nv1.duyetKhoanVay(new HoSoVay("Vay mua xe", 12_400_000));
    }
}
