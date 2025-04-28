package behavioral.chain_of_responsibility.atm;

import java.util.ArrayList;
import java.util.List;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    MenhGiaATM m500k, m200k, m100k, m50k, m20k, m10k, m5k, m2k;
    MenhGiaThapNhat m1k;
    public ChuoiMenhGiaVND() {
        m1k = new MenhGiaThapNhat(1);

        m500k = new MenhGia(500);
        m200k = new MenhGia(200);
        m100k = new MenhGia(100);
        m50k = new MenhGia(50);
        m20k = new MenhGia(20);
        m10k = new MenhGia(10);
        m5k = new MenhGia(5);
        m2k = new MenhGia(2);

        m500k
                .thietLapKeTiep(m200k)
                .thietLapKeTiep(m100k)
                .thietLapKeTiep(m50k)
                .thietLapKeTiep(m20k)
                .thietLapKeTiep(m10k)
                .thietLapKeTiep(m5k)
                .thietLapKeTiep(m2k)
                .thietLapKeTiep(m1k);
    }

    @Override
    protected MenhGiaATM getChuoiMenhGia(int mgLonNhat) {

        switch (mgLonNhat) {
            case 500:
                return this.m500k;
            case 200:
                return this.m200k;
            case 100:
                return this.m100k;
            case 50:
                return this.m50k;
            case 20:
                return this.m20k;
            case 10:
                return this.m10k;
            case 5:
                return this.m5k;
            case 2:
                return this.m2k;
            case 1:
                return this.m1k;
            default:
                return null;
        }
    }

}
