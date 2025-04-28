package behavioral.state.ATM;

public class HetTien implements ATM_State{
    @Override
    public void xuLyNapTien(int soTien, ATM context) {
        context.soTien+=soTien;
        if(context.soTien>=5_000_000){
            context.setState(new SanSang());
        }else if(context.soTien>0){
            context.setState(new HanChe());
        }
    }

    @Override
    public void xuLyRutTien(ATM context) {
        System.out.println("Xin lỗi máy hết tiền");
    }
}
