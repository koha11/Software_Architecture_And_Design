package behavioral.strategy.mua_hang;

public class AirPlay implements IThanhToan{
    @Override
    public float thanhToan(float soTien) {
        if(soTien >= 1000000)
            return soTien * 0.03f;
        else
            return 0;
    }
}
