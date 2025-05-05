package behavioral.strategy.so_sanh;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainSoSanh {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Khoa", Date.from(Instant.parse("2004-01-01T00:00:00Z")), 8.9f);

        SinhVien sv2 = new SinhVien("Vinh", Date.from(Instant.parse("2004-08-11T00:00:00Z")), 0.9f);

        SinhVien sv3 = new SinhVien("Trung", Date.from(Instant.parse("2004-09-21T00:00:00Z")), 1.9f);

        QLSV qlsv = new QLSV(new ArrayList<>(List.of(sv1, sv2, sv3)), new SoSanhTheoDiem());

        qlsv.inDS();
        System.out.println();
        qlsv.sapXep();
        qlsv.inDS();

        qlsv.setSoSanh(new SoSanhTheoTen());
        System.out.println();
        qlsv.sapXep();
        qlsv.inDS();
    }
}
