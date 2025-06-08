package final_test_practice.decorator.bieu_thuc;

public class Nhan extends PhepTinh{
    private int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() * toanHang;
    }

    @Override
    public String getBieuThuc() {
        return "( " + bieuThuc.getBieuThuc() + " ) * " + toanHang;
    }
}
