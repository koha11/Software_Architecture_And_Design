package behavioral.strategy.mua_hang;

public class MatHang {
    private String ten;
    private float gia;
    private int sl;

    public MatHang(String ten, float gia, int sl) {
        this.ten = ten;
        this.gia = gia;
        this.sl = sl;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                ", sl=" + sl +
                '}';
    }
}
