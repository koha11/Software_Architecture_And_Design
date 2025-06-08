package final_test_practice.chain_of_responsibility.CB5;

public class MainHocLuc {
    public static void main(String[] args) {
        XepHocLuc xs = new HocLucKhac(9, "Xuất sắc");
        XepHocLuc g = new HocLucKhac(8, "Giỏi");
        XepHocLuc k = new HocLucKhac(7, "Khá");
        XepHocLuc tb = new HocLucKhac(5 , "Trung bình");
        XepHocLuc y = new HocLucYeu(0, "Yếu");

        xs
                .setKeTiep(g)
                .setKeTiep(k)
                .setKeTiep(tb)
                .setKeTiep(y);



        for (int i = 0; i < 11; i++) {
            xs.getHocLuc(i);
        }
    }
}
