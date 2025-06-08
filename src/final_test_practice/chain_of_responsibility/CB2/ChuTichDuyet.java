package final_test_practice.chain_of_responsibility.CB2;

public class ChuTichDuyet extends DuyetVay{
    public ChuTichDuyet(int hanMuc, String ten) {
        super(hanMuc, ten);
    }

    @Override
    public DuyetVay setTiepTheo(DuyetVay tiepTheo) {
        return null;
    }

    @Override
    public void duyetKhoanVay(HoSoVay hsv) {
        System.out.println(ten + " " + hsv);
    }
}
