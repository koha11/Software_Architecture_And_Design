package final_test_practice.decorator.bieu_thuc;

public class Tru extends PhepTinh{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }

    @Override
    public String getBieuThuc() {
        return bieuThuc.getBieuThuc() + " - " + toanHang;
    }
}
