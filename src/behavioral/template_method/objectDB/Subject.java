package behavioral.template_method.objectDB;

public class Subject {
    private int maMH, soTC;
    private String tenMH;

    public Subject(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "maMH=" + maMH +
                ", soTC=" + soTC +
                ", tenMH='" + tenMH + '\'' +
                '}';
    }
}
