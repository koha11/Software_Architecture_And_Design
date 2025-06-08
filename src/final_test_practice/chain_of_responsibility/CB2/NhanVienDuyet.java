package final_test_practice.chain_of_responsibility.CB2;

public class NhanVienDuyet extends DuyetVay {

    public NhanVienDuyet(int hanMuc, String ten) {
        super(hanMuc, ten);
    }

    @Override
    public DuyetVay setTiepTheo(DuyetVay tiepTheo) {
        this.tiepTheo = tiepTheo;
        return tiepTheo;
    }

    @Override
    public void duyetKhoanVay(HoSoVay hsv) {
        if(hsv.getHanMuc() > hanMuc)
            tiepTheo.duyetKhoanVay(hsv);
        else
            System.out.println(ten + " " + hsv);
    }
}
