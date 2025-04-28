package behavioral.state.ATM;

public class ATM {
    ATM_State state;
    int soTien;
    public ATM(){
        state = new HetTien();
        soTien=0;
    }
    void setState(ATM_State state){
        this.state=state;
    }
    public void napTien(int soTien){
        state.xuLyNapTien(soTien,this);
    }
    public void rutTien(){
        state.xuLyRutTien(this);
    }
}
