package behavioral.observer.stream;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>> {
    private MyStream stream;
    private String name;

    public Client(MyStream stream, String name) {
        this.stream = stream;
        this.name = name;
        this.stream.addListener(this); // client tu dang ky minh vao listeners cua stream
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println(name);
        for(MonHoc mh: monHocs) {
            System.out.println(mh.toString());
        }
    }
}
