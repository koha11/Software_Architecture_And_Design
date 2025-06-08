package final_test_practice.decorator.image;

public class BasicProcess extends ImageProcess {
    private String path;

    public BasicProcess(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void process() {
        super.process();
        System.out.println("anh: " + path);
    }
}
