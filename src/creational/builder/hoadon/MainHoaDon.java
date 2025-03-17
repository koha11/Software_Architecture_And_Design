package creational.builder.hoadon;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon h = new HoaDon.Builder()
                .buildHDHeader("hd1","Anh Khoa", "09/06/2024")
                .addCTHD("Cocacola", 3, 10000, 1.5f)
                .addCTHD("Pepsi", 2, 59000, 1.9f)
                .build();

        h.inHoaDon();

    }
}
