package final_test_practice.chain_of_responsibility.CB3;

public class MainTinhTienDien {
    public static void main(String[] args) {
        TinhTienDien bac1 = new MucThongThuong("Bậc 1",  1_806, 0, 50);
        TinhTienDien bac2 = new MucThongThuong("Bậc 2",  1_866, 50, 100);
        TinhTienDien bac3 = new MucThongThuong("Bậc 3",  2_167, 100, 200);
        TinhTienDien bac4 = new MucThongThuong("Bậc 4",  3_729, 200, 300);
        TinhTienDien bac5 = new MucThongThuong("Bậc 5",  3_050, 300, 400);
        TinhTienDien bac6 = new MucCaoNhat("Bậc 6",  1_806, 400, Integer.MAX_VALUE);


        bac1
                .setKeTiep(bac2)
                .setKeTiep(bac3)
                .setKeTiep(bac4)
                .setKeTiep(bac5)
                .setKeTiep(bac6);

        System.out.println("Tien dien cua 1000 kw: " + bac1.tinhTien(1000));
    }
}
