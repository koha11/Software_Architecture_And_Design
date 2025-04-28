package behavioral.chain_of_responsibility.atm;

public class MenhGia extends MenhGiaATM {
    private MenhGiaATM keTiep;

    public MenhGia(int giaTri) {
        super(giaTri);
        keTiep = null;
    }

    @Override
    public MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    public void rutTien(int soTien) {

        int soTo = soTien / this.giaTri;
        int soDu = soTien % this.giaTri;

        if(soTo > 0)
        {
            System.out.println(soTo + " tờ mệnh giá " + this.giaTri + "000 đồng");
        }

        if(soDu > 0)
            this.keTiep.rutTien(soDu);
    }
}
