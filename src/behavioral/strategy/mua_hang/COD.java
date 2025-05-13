package behavioral.strategy.mua_hang;

public class COD implements IThanhToan{
    @Override
    public float thanhToan(float soTien) {
        if(soTien >= 2000000)
            return soTien * 0.02f;
        else
            return 0;
    }
}
