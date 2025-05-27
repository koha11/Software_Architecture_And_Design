package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiThongThuong extends GiaiVeSo{
    private GiaiVeSo giaiKeTiep;

    public GiaiThongThuong(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }


    @Override
    public GiaiVeSo giaiKeTiep(GiaiVeSo giaiVeSo) {
        this.giaiKeTiep = giaiVeSo;
        return this.giaiKeTiep;
    }

    @Override
    public String doVeSo(String so) {
        for(var soTrungThuong: boSoTrungThuong)
        {
            if(so.endsWith(soTrungThuong))
                return "Chúc mừng bạn đã trúng giải " + tenGiai;
        }

        return giaiKeTiep.doVeSo(so);
    }
}
