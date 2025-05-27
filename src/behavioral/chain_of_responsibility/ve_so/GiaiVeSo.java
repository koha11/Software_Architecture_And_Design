package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public abstract class GiaiVeSo {
    protected String tenGiai;
    protected List<String> boSoTrungThuong;
    public abstract GiaiVeSo giaiKeTiep(GiaiVeSo giaiVeSo);
    public abstract String doVeSo(String so);

    public GiaiVeSo(String tenGiai, List<String> boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }
}
