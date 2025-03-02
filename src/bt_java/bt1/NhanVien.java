package bt_java.bt1;

public class NhanVien {
    public NhanVien() {

    }

    public NhanVien(String name, String address, Byte age, double salary, int workedHours) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.workedHours = workedHours;
    }

    private String name, address;
    private Byte age;
    private double salary;
    private int workedHours;

    public String toString() {
        return "name: $name || address: ";
    }

    public double tinhThuong() {
        if (workedHours >= 200)
            return salary * 20 / 100;

        if (workedHours >= 100)
            return salary * 10 / 100;

        return 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
