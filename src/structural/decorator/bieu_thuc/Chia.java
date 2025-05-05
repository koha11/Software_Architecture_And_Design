package structural.decorator.bieu_thuc;

public class Chia extends BieuThucDecorator{
    private float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ") / " + toanHang;
    }
}
