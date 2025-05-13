package behavioral.strategy.tinh_toan;

public class MainTinhToan {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTinhToan(new Cong());
        System.out.println(context.tinh(75,12));
        context.setTinhToan(new Tru());
        System.out.println(context.tinh(78,14));
        context.setTinhToan(new Nhan());
        System.out.println(context.tinh(16,2));
        context.setTinhToan(new Chia());
        System.out.println(context.tinh(32,8));

    }
}
