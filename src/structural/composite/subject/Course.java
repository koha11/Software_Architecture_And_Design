package structural.composite.subject;

import java.util.ArrayList;
import java.util.List;

public class Course extends StudyManagement{
    List<StudyManagement> courses;

    public Course(String name) {
        super(name);
        courses = new ArrayList<>();
    }

    @Override
    public int getSoTC() {
        int sumTC = 0;
        for(var course : courses)
            sumTC += course.getSoTC();

        return sumTC;
    }

    @Override
    public int getFee() {
        int sumFee = 0;
        for(var course : courses)
            sumFee += course.getFee();

        return sumFee;
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.prefix)
                .append(this.name)
                .append(": tong TC: ")
                .append(this.getSoTC())
                .append(", hoc phi: ")
                .append(this.getFee())
                .append("\n");


        for (var course : courses) {
            course.prefix = this.prefix + "\t";
            builder.append(course.info());
        }

        return builder.toString();
    }

    @Override
    public StudyManagement add(StudyManagement sm) {
        if(!courses.contains(sm)) {
            courses.add(sm);
        }

        return this;
    }

    @Override
    public void remove(StudyManagement sm) {
        courses.remove(sm);
    }
}
