package behavioral.observer.atm;

public class TaiKhoan implements TheoDoiATM{
    private String tenTK;
    private int soDu;
    private ATM atm;

    public TaiKhoan(String tenTK, int soDu) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = null;
    }

    public void duaTheVaoATM(ATM atm) {
        this.atm = atm;
        this.atm.nhanThe(this);
    }

    public void rutTheKhoiATM() {
        this.atm.traThe();
        this.atm = null;
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        return soTienRut <= soDu;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong)
        {
            System.out.println("So du ban dau la " + this.soDu + "vnd");
            System.out.println("Rut thanh cong " + soTienRut + "vnd");
            System.out.println("So tien trong tai khoan " + tenTK + " con lai " + this.soDu + "vnd");
            System.out.println();
            this.soDu -=soTienRut;
        }
        else {
            System.out.println("So du ban dau la " + this.soDu + "vnd");
            System.out.println("So tien trong tai khoan " + tenTK + " khong du de rut " + soTienRut + "vnd");
            System.out.println("Rut tien khong thanh cong");
            System.out.println();
        }


    }
}
