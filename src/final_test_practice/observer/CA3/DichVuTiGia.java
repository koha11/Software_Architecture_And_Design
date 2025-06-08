package final_test_practice.observer.CA3;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
    private List<TiGiaListener> listeners;
    private float tiGia;

    public DichVuTiGia() {
        this.listeners = new ArrayList<>();
        this.tiGia = 0;
    }

    public void addListener(TiGiaListener listener) {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }

    public void removeListener(TiGiaListener listener) {
        listeners.remove(listener);
    }

    public void updateTiGia(float tiGia) {
        this.tiGia = tiGia;
        for(var l: listeners)
            l.listen(this.tiGia);
    }

}
