package final_test_practice.decorator.bieu_thuc;

public class Chia extends PhepTinh{
    private int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()/toanHang;
    }

    @Override
    public String getBieuThuc() {
        return "( " + bieuThuc.getBieuThuc() + ") / " + toanHang;
    }
}
