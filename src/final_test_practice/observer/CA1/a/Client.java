package final_test_practice.observer.CA1.a;


import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>>{

    @Override
    public void listen(List<MonHoc> monHocList) {
        for(var mh: monHocList)
            System.out.println(mh.toString());

        System.out.println();
    }
}
