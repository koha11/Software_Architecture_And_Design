package behavioral.state.thue_bao;

public class GoldState implements ITrangThaiTieuDung{
    @Override
    public void xuLyNapTien(int soTien, ThueBao thueBao) {
        int KM = (int) (soTien * 1.1);
        thueBao.setSoDu(thueBao.getSoDu() + KM);
        thueBao.display();
    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBao thueBao) {
        int soTienTon = soPhut * 1200;

        // max minute o state nay
        int maxTien = (thueBao.getSoDu() % 200_000);

        int maxMinute = maxTien/1200;

        if(soPhut > maxMinute) {
            thueBao.setSoDu(maxTien);
            thueBao.setState(new SilverState());
            thueBao.goiDien(soPhut - maxMinute);
        }
        else {
            thueBao.setSoDu(soTienTon);
            thueBao.display();

        }
    }

    @Override
    public void handleDisplay(ThueBao thueBao) {
        System.out.println("Trang thái: Vàng");
        System.out.println("Số dư: " + thueBao.getSoDu());

        int tg = (thueBao.getSoDu()-200_000)/(1200/60) + (thueBao.getSoDu()-100_000)/(1500/60) + 100_000/(1800/60);

        System.out.println("Số giây còn lại: " + tg);
    }
}
