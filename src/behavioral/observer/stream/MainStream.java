package behavioral.observer.stream;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MonHoc lttbdd = new MonHoc("01", "Lap trinh thiet bi di dong");

        MonHoc tkktpm = new MonHoc("02", "Thiet ke kien truc phan mem");

        MyStream<List<MonHoc>> myStream = new MyStream<>();

        DataAccess da = new DataAccess(myStream);
        Client client1 = new Client(myStream, "khoa");
        Client client2 = new Client(myStream, "vinh");

        System.out.println("Lan 1");
        da.add(lttbdd);
        System.out.println("Lan 2");
        da.add(tkktpm);

    }
}
