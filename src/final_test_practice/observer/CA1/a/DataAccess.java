package final_test_practice.observer.CA1.a;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private MyStream<List<MonHoc>> stream;
    private List<MonHoc> dsmh;


    public DataAccess(MyStream<List<MonHoc>> stream) {
        dsmh = new ArrayList<>();
        this.stream = stream;
    }

    public void addMH(MonHoc mh) {
        dsmh.add(mh);
        stream.addEvent(dsmh);
    }

    public void updateMH(MonHoc mh) {
        for(var m: dsmh)
            if(m.getMaMH().equals(mh.getMaMH()))
                m.setTenMH(mh.getTenMH());

        stream.addEvent(dsmh);
    }

    public void deleteMH(MonHoc mh) {
        for(var m: dsmh)
            if(m.getMaMH().equals(mh.getMaMH()))
                dsmh.remove(m);

        stream.addEvent(dsmh);
    }
}
