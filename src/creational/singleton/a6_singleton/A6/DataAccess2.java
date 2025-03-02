package creational.singleton.a6_singleton.A6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//this class for multi instance
public class DataAccess2 {
    private static Map<String,DataAccess2> instances = new HashMap<>();
    List<SanPham> dsSP;

    protected DataAccess2() {
        dsSP = new ArrayList<>();
    }

    public static DataAccess2 getInstance(String tag) {
        if (instances.get(tag) == null)
            instances.put(tag, new DataAccess2());

        return instances.get(tag);
    }

    public void them(SanPham sp) {
        dsSP.add(sp);
    }

    public void inKQ() {
        for (var sp : dsSP)
            System.out.println(sp.toString());
    }
}
