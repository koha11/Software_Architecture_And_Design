package behavioral.observer.tigia;

public class NhaDauTuB extends NhaDauTu{

    public NhaDauTuB(String ten, DichVuTiGia dvtg) {
        super(ten, dvtg);
    }

    @Override
    public void nhanThongBao(float delta) {
        if(delta >= 0)
            System.out.println(this.ten + " mua vào");
        else
            System.out.println(this.ten + " bán ra");
    }
}
