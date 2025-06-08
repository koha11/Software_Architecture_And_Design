package final_test_practice.chain_of_responsibility.CB2;

public class HoSoVay {
    private String thongTin;
    private int hanMuc;

    public HoSoVay(String thongTin, int hanMuc) {
        this.thongTin = thongTin;
        this.hanMuc = hanMuc;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public int getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(int hanMuc) {
        this.hanMuc = hanMuc;
    }

    @Override
    public String toString() {
        return "thong tin: " + thongTin +
                " , han muc: " + hanMuc +
                " dong";
    }
}
