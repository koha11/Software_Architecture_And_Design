package creational.singleton.a6_singleton.A6;

public class MainA6 {
    public static void main(String[] args) {
        DataAccess da1 = DataAccess.getInstance();
        var sp01 = new SanPham("SP01","Nuoc hoa", 2, 18000);
        var sp02 = new SanPham("SP02","Dau goi", 1, 30000);
        var sp03 = new SanPham("SP03","Sua tam", 4, 16000);
        var sp04 = new SanPham("SP04","Dau xa", 2, 12000);

        da1.them(sp01);
        da1.them(sp02);
        da1.them(sp03);
        da1.them(sp04);

        da1.inKQ();

        System.out.println("da2");
        DataAccess2 da2 = DataAccess2.getInstance("vinhngu");
        da2.them(sp01);
        da2.them(sp02);
        da2.inKQ();

        System.out.println("da3");
        DataAccess2 da3 = DataAccess2.getInstance("vinhngu");
        da3.them(sp03);
        da3.them(sp04);
        da3.inKQ();
    }
}
