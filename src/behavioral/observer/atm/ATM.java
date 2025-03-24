package behavioral.observer.atm;

public class ATM {
    private TheoDoiATM theATM;

    public ATM() {
        this.theATM = null;
    }

    public void rutTien(int soTien) {
        if(theATM == null)
        {
            System.out.println("Vui long dua the vao may");
            return;
        }

        theATM.nhanThongBao(soTien,theATM.kiemTraSoDu(soTien));
    }

    public void nhanThe(TheoDoiATM theATM) {
        if(this.theATM != null)
        {
            System.out.println("Nhan the that bai");
            System.out.println("May ATM da co the ton tai");
            return;
        }

        this.theATM = theATM;
        System.out.println("Nhan the thanh cong");
    }

    public void traThe() {
        if(this.theATM == null)
        {
            System.out.println("Rut the that bai");
            System.out.println("May ATM khong co the nao");
        }
        this.theATM = null;
        System.out.println("Rut the thanh cong");
    }
}
