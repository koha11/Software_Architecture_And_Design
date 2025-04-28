package behavioral.state.ATM;

import java.util.Scanner;

public class HanChe implements ATM_State{
    @Override
    public void xuLyNapTien(int soTien, ATM context) {
        System.out.println("Hãy nạp thêm tiền để có thể sử dụng");
        context.soTien+=soTien;
        if(context.soTien>=5_000_000) {
            context.setState(new SanSang());
        }
    }

    @Override
    public void xuLyRutTien(ATM context) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền tối đa: "+context.soTien);
        int res =sc.nextInt();
        context.soTien-=res;
        if(context.soTien==0){
            context.setState(new HetTien());
        }
    }
}
