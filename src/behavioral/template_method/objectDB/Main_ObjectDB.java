package behavioral.template_method.objectDB;

public class Main_ObjectDB{
    public static void main(String[] args) {
        var khoa = new Student(1, "Khoa", "09/06/2004", "Khanh Hoa");

        var my = new Student(2, "My", "05/11/2004", "Khanh Hoa");

        var kttkpm = new Subject(1,3,"Kien truc va thiet ke phan mem");
        var mobile = new Subject(2,4,"Lap trinh thiet bi di dong");
        var cnpm = new Subject(3,3,"Cong nghe phan mem");

        var studentDB = new StudentDB();
        var subjectDB = new SubjectDB();

        studentDB.add(khoa).add(my);
        subjectDB.add(kttkpm).add(mobile).add(cnpm);

        System.out.println(subjectDB.findById(1).toString());
        System.out.println(subjectDB.findById(2).toString());
        System.out.println(subjectDB.findById(3).toString());
        System.out.println(studentDB.findById(1).toString());
        System.out.println(studentDB.findById(2).toString());
    }
}
