package final_test_practice.chain_of_responsibility.CB1.b;

public class MenhGiaNN extends RutTienAtm {
    public MenhGiaNN(int giaTri) {
        super(giaTri);
    }

    @Override
    public RutTienAtm setTiepTheo(RutTienAtm tiepTheo) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        System.out.println(soTien + " tờ mệnh giá " + giaTri);
    }
}
