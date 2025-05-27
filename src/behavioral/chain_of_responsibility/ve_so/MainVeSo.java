package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class MainVeSo {
    public static void main(String[] args) {
        var giaiDacBiet = new GiaiThongThuong("Giải đặc biệt", List.of("123456"));
        var giaiNhat = new GiaiThongThuong("Giải nhất", List.of("123456"));
        var giaiHai = new GiaiThongThuong("Giải nhì", List.of("34324"));
        var giaiBa = new GiaiThongThuong("Giải ba", List.of("56733","52233"));
        var giaiTam = new GiaiTam("Giải tám", List.of("68"));

        giaiDacBiet
                .giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiHai)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTam);

        System.out.println(giaiDacBiet.doVeSo("152233"));
    }
}
