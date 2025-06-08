package final_test_practice.decorator.bieu_thuc;

public abstract class PhepTinh extends BieuThuc{
    protected BieuThuc bieuThuc;

    public PhepTinh(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
//
//    @Override
//    public String getBieuThuc() {
//        return "";
//    }
}
