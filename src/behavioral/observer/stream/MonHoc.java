package behavioral.observer.stream;

public class MonHoc {
    private String maMonHoc, tenMonHoc;

    public MonHoc(String maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMonHoc='" + maMonHoc + '\'' +
                ", tenMonHoc='" + tenMonHoc + '\'' +
                '}';
    }
}
