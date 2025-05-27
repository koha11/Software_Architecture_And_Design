package behavioral.state.thue_bao;

public class SilverState implements ITrangThaiTieuDung{
    @Override
    public void xuLyNapTien(int soTien, ThueBao thueBao) {
        if(thueBao.getSoDu() + soTien >= 200_000) {
            int KM = (int) ((200_000 - thueBao.getSoDu()) * 1.05);

            thueBao.setSoDu(thueBao.getSoDu() + KM);
            thueBao.setState(new GoldState());
            thueBao.napTien(soTien - 100_000);
        }
        else
        {
            thueBao.setSoDu(thueBao.getSoDu() + (int) (soTien * 1.05));
            thueBao.display();

        }
    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBao thueBao) {
        int soTienTon = soPhut * 1500;
        int maxTien = (thueBao.getSoDu() % 100_000);
        int maxMinute = maxTien/1500;

        if(soPhut > maxMinute) {
            thueBao.setSoDu(maxTien);
            thueBao.setState(new NormalState());
            thueBao.goiDien(soPhut - maxMinute);
        }
        else {
            thueBao.setSoDu(soTienTon);
            thueBao.display();

        }
    }

    @Override
    public void handleDisplay(ThueBao thueBao) {
        System.out.println("Trang thái: Bạc");
        System.out.println("Số dư: " + thueBao.getSoDu());

        int tg = (thueBao.getSoDu()-100_000)/(1500/60) + 100_000/(1800/60);

        System.out.println("Số giây còn lại: " + tg);
    }
}
