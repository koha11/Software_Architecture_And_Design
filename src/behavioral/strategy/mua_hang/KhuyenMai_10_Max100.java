package behavioral.strategy.mua_hang;

public class KhuyenMai_10_Max100 implements IKhuyenMai{
    @Override
    public float KhuyenMai(float soTien) {
        return Math.min(soTien * 0.1f, 100);
    }
}
