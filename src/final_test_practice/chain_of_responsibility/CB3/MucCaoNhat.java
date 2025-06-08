package final_test_practice.chain_of_responsibility.CB3;

public class MucCaoNhat extends TinhTienDien{
    public MucCaoNhat(String tenBac, int giaDien, int minKW, int maxKW) {
        super(tenBac, giaDien, minKW, maxKW);
    }

    @Override
    public TinhTienDien setKeTiep(TinhTienDien keTiep) {
        return null;
    }

    @Override
    public int tinhTien(int soKW) {
        return soKW * giaDien;
    }
}
