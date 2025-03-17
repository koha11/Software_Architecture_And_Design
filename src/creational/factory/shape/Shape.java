package creational.factory.shape;

public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;

    protected Shape() {
        this.brush = "12";
        this.paper = "A4";
        this.frame = "wood";
    }

    public abstract String draw();

    @Override
    public String toString() {
        return "Shape{" +
                "brush='" + brush + '\'' +
                ", paper='" + paper + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
