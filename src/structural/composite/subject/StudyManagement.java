package structural.composite.subject;

abstract public class StudyManagement {
    String name;
    String prefix = "";

    public StudyManagement(String name) {
        this.name = name;
    }

    abstract public int getSoTC();
    abstract public int getFee();
    abstract public String info();
    abstract public StudyManagement add(StudyManagement sm);
    abstract public void remove(StudyManagement sm);
}
