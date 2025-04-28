package behavioral.template_method.objectDB;

public class SubjectDB extends ObjectDB<Subject>{
    @Override
    public int getId(Subject subject) {
        return subject.getMaMH();
    }
}
