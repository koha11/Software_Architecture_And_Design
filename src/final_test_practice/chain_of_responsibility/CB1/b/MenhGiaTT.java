package final_test_practice.chain_of_responsibility.CB1.b;

public class MenhGiaTT extends RutTienAtm {
    private RutTienAtm mgTiepTheo;

    public MenhGiaTT(int giaTri) {
        super(giaTri);
        mgTiepTheo = null;
    }

    @Override
    public RutTienAtm setTiepTheo(RutTienAtm tiepTheo) {
        mgTiepTheo = tiepTheo;
        return mgTiepTheo;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/giaTri;
        int soTienConLai = soTien % giaTri;

        if(soTo != 0)
            System.out.println(soTo + " tờ mệnh giá " + giaTri);

        if (soTienConLai != 0)
            mgTiepTheo.rutTien(soTienConLai);
    }
}
