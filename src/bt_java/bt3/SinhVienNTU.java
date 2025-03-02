package bt_java.bt3;

public abstract class SinhVienNTU {
    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    private String hoTen, nganh;
    public abstract float getDiemTB();

    public String getHocLuc() {
        var dtb = getDiemTB();

        if (dtb >= 9)
            return "Xuat sac";
        if (dtb >= 8)
            return "Gioi";
        if (dtb >= 7)
            return "Kha";
        if (dtb >= 5)
            return "Trung binh";

        return "Yeu";

    }

    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen +  "\nNganh: " + nganh);
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
}
