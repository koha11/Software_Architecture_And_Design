package behavioral.state.ATM;

import java.util.Scanner;

public class SanSang implements ATM_State{
    @Override
    public void xuLyNapTien(int soTien, ATM context) {
        context.soTien+=soTien;
    }

    @Override
    public void xuLyRutTien(ATM context) {
        System.out.print("Lưa chọn 1: 5.000.000, 2: 3.000.000:");
        Scanner sc = new Scanner(System.in);
        int result=sc.nextInt();
        switch (result){
            case 1:
                context.soTien-=5_000_000;
                System.out.println("Mời bạn nhận 5_000_000");
                break;
            case 2:
                context.soTien-=3_000_000;
                break;
            default:
                System.out.println("Sự lựa chon không đúng");
        }
        if (context.soTien==0){
            context.setState(new HetTien());
        }else if(context.soTien<5_000_000){
            context.setState(new HanChe());
        }
    }
}
