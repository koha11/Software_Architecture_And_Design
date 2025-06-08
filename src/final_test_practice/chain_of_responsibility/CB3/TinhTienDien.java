package final_test_practice.chain_of_responsibility.CB3;

public abstract class TinhTienDien {
    protected String tenBac;
    protected int giaDien, minKW, maxKW;

    public TinhTienDien(String tenBac, int giaDien, int minKW, int maxKW) {
        this.tenBac = tenBac;
        this.giaDien = giaDien;
        this.minKW = minKW;
        this.maxKW = maxKW;
    }

    abstract public TinhTienDien setKeTiep(TinhTienDien keTiep);
    abstract public int tinhTien(int soKW);

}
