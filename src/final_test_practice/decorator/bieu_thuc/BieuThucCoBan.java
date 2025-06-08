package final_test_practice.decorator.bieu_thuc;

public class BieuThucCoBan extends BieuThuc{
    private float toanHang;

    public BieuThucCoBan(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String getBieuThuc() {
        return String.valueOf(toanHang);
    }

    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }
}
