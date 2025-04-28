package behavioral.chain_of_responsibility.atm;

public class MenhGiaThapNhat extends MenhGiaATM{
    public MenhGiaThapNhat(int giaTri) {
        super(giaTri);
    }

    @Override
    public MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/this.giaTri;
        System.out.println(soTo + " tờ mệnh giá " + this.giaTri + "000 đồng");
    }
}
