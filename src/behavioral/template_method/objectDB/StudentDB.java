package behavioral.template_method.objectDB;

public class StudentDB extends ObjectDB<Student>{

    @Override
    public int getId(Student student) {
        return student.getMaSV();
    }
}
