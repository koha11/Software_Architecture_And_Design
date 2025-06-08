package final_test_practice.observer.CA1.b;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private MyStream<List<MonHoc>> stream;
    private List<MonHoc> dsmh;
    static private DataAccess instance = null;

    private DataAccess(MyStream<List<MonHoc>> stream) {
        dsmh = new ArrayList<>();
        this.stream = stream;
    }

    static public DataAccess getInstance(MyStream<List<MonHoc>> stream) {
        if(instance == null)
            instance = new DataAccess(stream);

        return instance;
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
