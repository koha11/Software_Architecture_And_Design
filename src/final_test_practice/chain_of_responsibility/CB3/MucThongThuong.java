package final_test_practice.chain_of_responsibility.CB3;

public class MucThongThuong extends TinhTienDien{
    private TinhTienDien keTiep;

    public MucThongThuong(String tenBac, int giaDien, int minKW, int maxKW) {
        super(tenBac, giaDien, minKW, maxKW);
        keTiep = null;
    }

    @Override
    public TinhTienDien setKeTiep(TinhTienDien keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    public int tinhTien(int soKW) {
        System.out.println(soKW);
        System.out.println(maxKW * giaDien);
        System.out.println(soKW * giaDien);
        System.out.println();

        if(minKW + soKW > maxKW)
            return (maxKW * giaDien) + keTiep.tinhTien(soKW - maxKW);

        return soKW * giaDien;
    }
}
