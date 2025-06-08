package final_test_practice.chain_of_responsibility.CB1.b;

public class MainRutTien {
    public static void main(String[] args) {
        RutTienAtm mg500 = new MenhGiaTT(500);
        RutTienAtm mg200 = new MenhGiaTT(200);
        RutTienAtm mg100 = new MenhGiaTT(100);
        RutTienAtm mg50 = new MenhGiaTT(50);
        RutTienAtm mg20 = new MenhGiaTT(20);
        RutTienAtm mg10 = new MenhGiaTT(10);
        RutTienAtm mg5 = new MenhGiaTT(5);
        RutTienAtm mg2 = new MenhGiaTT(2);
        RutTienAtm mg1 = new MenhGiaNN(1);

        mg500
                .setTiepTheo(mg200)
                .setTiepTheo(mg100)
                .setTiepTheo(mg50)
                .setTiepTheo(mg20)
                .setTiepTheo(mg10)
                .setTiepTheo(mg5)
                .setTiepTheo(mg2)
                .setTiepTheo(mg1);

        mg500.rutTien(293);
    }
}
