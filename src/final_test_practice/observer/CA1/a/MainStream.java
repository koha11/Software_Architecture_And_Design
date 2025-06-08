package final_test_practice.observer.CA1.a;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> myStream = new MyStream<>();
        DataAccess da = new DataAccess(myStream);
        Client khoa = new Client();
        myStream.addListener(khoa);
        da.addMH(new MonHoc("M1", "Kien truc thiet ke va phan mem"));
        da.addMH(new MonHoc("M2", "Kien truc thiet ke va phan mem"));
        da.updateMH(new MonHoc("M1", "Kien truc thiet ke va phan mem 2345"));
        da.addMH(new MonHoc("M4", "Kien truc thiet ke va phan mem"));
        da.deleteMH(new MonHoc("M2", "Kien truc thiet ke va phan mem"));

    }
}
