package creational.singleton.a6_singleton.A6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private DataAccess() {
        dsSP = new ArrayList<SanPham>();
    }
    private static DataAccess instance;
    private List<SanPham> dsSP;

    public static DataAccess getInstance() {
        if (instance == null)
            instance = new DataAccess();

        return instance;
    }

    public void them(SanPham sp) {
        if (dsSP.contains(sp))
            return;

        dsSP.add(sp);
    }

    public void sua(SanPham sp) {
        if (dsSP.contains(sp))
            return;

        dsSP.add(sp);
    }

    public void xoa(SanPham sp) {
        dsSP.remove(sp);
    }

    public void inKQ() {
        for (var sp: dsSP)
            System.out.println(sp.toString());
    }

}
