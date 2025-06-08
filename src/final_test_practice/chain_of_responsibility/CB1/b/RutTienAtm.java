package final_test_practice.chain_of_responsibility.CB1.b;

public abstract class RutTienAtm {
    protected int giaTri;

    public RutTienAtm(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract RutTienAtm setTiepTheo(RutTienAtm tiepTheo);
    public abstract void rutTien(int soTien);
}
