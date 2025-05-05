package behavioral.strategy.so_sanh;

import java.util.List;

public class QLSV {
    List<SinhVien> dsSV;
    ISoSanh<SinhVien> soSanh;

    public QLSV(List<SinhVien> dsSV, ISoSanh<SinhVien> soSanh) {
        this.dsSV = dsSV;
        this.soSanh = soSanh;
    }

    public void sapXep() {
        for (int i = 0; i < dsSV.size()-1; i++) {
            for (int j = i+1; j < dsSV.size(); j++) {
                if(soSanh.soSanh(dsSV.get(i),dsSV.get(j)) == 1) {
                    var temp = dsSV.get(i);
                    dsSV.set(i,dsSV.get(j));
                    dsSV.set(j,temp);
                }
            }
        }
    }

    public void inDS() {
        for(var sv: dsSV)
            System.out.println(sv);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
}
