package final_test_practice.observer.CA3;

public class NhaDauTu extends TiGiaListener{
    private DichVuTiGia dvtg;

    public NhaDauTu(String name, DichVuTiGia dvtg) {
        super(name);
        this.dvtg = dvtg;
        dvtg.addListener(this);
    }

    @Override
    public void listen(float tiGia) {
        System.out.println("Nha dau tu " + name + " nhan: ");
        System.out.println(tiGia);
    }

    @Override
    public void dangKy(DichVuTiGia dvtg) {
        dvtg.addListener(this);
        this.dvtg = dvtg;
    }

    @Override
    public void huyDangKy() {
        dvtg.removeListener(this);
        this.dvtg = null;
    }
}
