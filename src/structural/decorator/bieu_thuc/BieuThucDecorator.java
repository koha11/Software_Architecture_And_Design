package structural.decorator.bieu_thuc;

public class BieuThucDecorator extends BieuThuc{
    private BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
