package final_test_practice.chain_of_responsibility.CB2;

public abstract class DuyetVay {
    protected String ten;
    protected int hanMuc;
    protected DuyetVay tiepTheo;

    public DuyetVay(int hanMuc, String ten) {
        this.hanMuc = hanMuc;
        this.ten = ten;
        tiepTheo = null;
    }

    public abstract DuyetVay setTiepTheo(DuyetVay tiepTheo);

    public abstract void duyetKhoanVay(HoSoVay hsv);
}
