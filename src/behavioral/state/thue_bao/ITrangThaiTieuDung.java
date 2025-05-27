package behavioral.state.thue_bao;

public interface ITrangThaiTieuDung {
    void xuLyNapTien(int soTien, ThueBao thueBao);

    void xuLyGoiDien(int soPhut, ThueBao thueBao);

    void handleDisplay(ThueBao thueBao);
}
