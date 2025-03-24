package structural.composite.subject;

public class Subject extends StudyManagement{
    int soTC, fee;

    public Subject(String name, int soTC, int fee) {
        super(name);
        this.soTC = soTC;
        this.fee = fee;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.prefix)
                .append(this.name)
                .append(": số TC: ")
                .append(this.getSoTC())
                .append(", học phí: ")
                .append(this.getFee())
                .append("\n");

        return builder.toString();
    }

    @Override
    public StudyManagement add(StudyManagement sm) {
        return null;
    }

    @Override
    public void remove(StudyManagement sm) {

    }
}
