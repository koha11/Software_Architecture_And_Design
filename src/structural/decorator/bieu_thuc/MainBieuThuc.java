package structural.decorator.bieu_thuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(2);

        b = new Cong(b, 12);
        b = new Tru(b, 2);
        b = new Nhan(b, 2);
        b = new Chia(b, 3);

        System.out.println(b);
    }
}
