package behavioral.observer.atm;

public class MainATM {
    public static void main(String[] args) {
        var mayATM = new ATM();
        var myATMCard = new TaiKhoan("anhkhoa", 100000);

        myATMCard.duaTheVaoATM(mayATM);
        mayATM.rutTien(90000);
        mayATM.rutTien(100000);
        mayATM.rutTien(10000);

        myATMCard.rutTheKhoiATM();
        mayATM.rutTien(10000);

        myATMCard.duaTheVaoATM(mayATM);
        mayATM.rutTien(10000);
    }
}
