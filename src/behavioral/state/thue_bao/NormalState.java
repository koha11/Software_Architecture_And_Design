package behavioral.state.thue_bao;

public class NormalState implements ITrangThaiTieuDung {
    @Override
    public void xuLyNapTien(int soTien, ThueBao thueBao) {
        if(thueBao.getSoDu() + soTien >= 100_000) {
            thueBao.setSoDu(thueBao.getSoDu() + 100_000 - thueBao.getSoDu());
            thueBao.setState(new SilverState());
            thueBao.napTien(soTien - 100_000);
        }
        else
        {
            thueBao.setSoDu(thueBao.getSoDu() + soTien);
            thueBao.display();
        }
    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBao thueBao) {
        int soTienTon = soPhut * 1800;

        if(soTienTon > thueBao.getSoDu())
            System.out.println("Tien khong du de goi");
        else
            thueBao.setSoDu(thueBao.getSoDu() - soTienTon);
    }

    @Override
    public void handleDisplay(ThueBao thueBao) {
        System.out.println("Trang thái: Thường");
        System.out.println("Số dư: " + thueBao.getSoDu());
        System.out.println("Số giây còn lại: " + thueBao.getSoDu()/(1800/60));
    }
}
