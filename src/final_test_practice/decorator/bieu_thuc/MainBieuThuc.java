package final_test_practice.decorator.bieu_thuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucCoBan(1);

        bt = new Cong(bt, 12);
        bt = new Tru(bt, 5);
        bt = new Cong(bt, 12);
        bt = new Nhan(bt, 4);
        bt = new Chia(bt, 2);


        System.out.println(bt.getBieuThuc() + " = " + bt.giaTri());
    }
}
