package structural.composite.subject;

public class MainSubject {
    public static void main(String[] args) {
        var ITCourse = new Course("IT 2022 - 2026");

        var year1 = new Course("Nam 2022-2023");
        var year2 = new Course("Nam 2023-2024");

        var term1 = new Course("Ky 1");
        var term2 = new Course("Ky 2");
        var term3 = new Course("Ky 3");

        var ktpm = new Subject("KTPM", 3, 5000);
        var csdl = new Subject("CSDL", 3, 5000);
        var lsd = new Subject("LSD", 2, 2000);

        ITCourse.add(year1).add(year2);

        year1.add(term1).add(term2);

        year2.add(term3);

        term1.add(ktpm);
        term2.add(csdl);
        term3
                .add(lsd)
                .add(ktpm);

        System.out.println(ITCourse.info());

    }
}
