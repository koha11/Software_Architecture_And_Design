package final_test_practice.observer.CA1.b;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>> {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void listen(List<MonHoc> monHocList) {
        System.out.println("Toi la " + name);
        for(var mh: monHocList)
            System.out.println(mh.toString());

        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
