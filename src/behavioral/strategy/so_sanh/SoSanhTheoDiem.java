package behavioral.strategy.so_sanh;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getDiemTB() > o2.getDiemTB() ? 1 : 0;
    }
}
