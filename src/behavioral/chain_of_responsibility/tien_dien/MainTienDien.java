package behavioral.chain_of_responsibility.tien_dien;

public class MainTienDien {
    public static void main(String[] args) {
        BacThongThuong b1 = new BacThongThuong("Bậc 1", 0, 50, 1806);
        BacThongThuong b2 = new BacThongThuong("Bậc 2", 50, 100, 1866);
        BacThongThuong b3 = new BacThongThuong("Bậc 3", 100, 200, 2167);
        BacThongThuong b4 = new BacThongThuong("Bậc 4", 200, 300, 2729);
        BacThongThuong b5 = new BacThongThuong("Bậc 5", 300, 400, 3050);
        BacCaoNhat b6 = new BacCaoNhat("Bậc 6", 400, Integer.MAX_VALUE, 3151);

        b1
                .bacKeTiep(b2)
                .bacKeTiep(b3)
                .bacKeTiep(b4)
                .bacKeTiep(b5)
                .bacKeTiep(b6);

        System.out.println("Số tiền điện cho 125kwh là: " + b1.tinhTienDien(125));
    }
}
