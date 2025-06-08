package final_test_practice.observer.CA3;

public abstract class TiGiaListener {
    protected String name;

    public TiGiaListener(String name) {
        this.name = name;
    }

    abstract public void listen(float tiGia);
    abstract public void dangKy(DichVuTiGia dvtg);
    abstract public void huyDangKy();
}
