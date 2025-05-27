package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiTam extends GiaiVeSo{
    public GiaiTam(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public GiaiVeSo giaiKeTiep(GiaiVeSo giaiVeSo) {
        return null;
    }

    @Override
    public String doVeSo(String so) {
        for(var soTrungThuong: boSoTrungThuong)
        {
            if(so.endsWith(soTrungThuong))
                return "Chúc mừng bạn đã trúng " + tenGiai;
        }

        return "Chúc bạn may mắn lần sau";
    }
}
