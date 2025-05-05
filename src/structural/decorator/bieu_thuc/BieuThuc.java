package structural.decorator.bieu_thuc;

public abstract class BieuThuc {
    public abstract float giaTri();

    public abstract String bieuThuc();

    @Override
    public String toString() {
        return bieuThuc() + " = " + giaTri();
    }
}
