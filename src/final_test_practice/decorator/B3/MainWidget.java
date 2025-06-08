package final_test_practice.decorator.B3;

public class MainWidget {
    public static void main(String[] args) {
        Widget center = new Center();
        center = new Text(center);
        center = new Button(center);

        System.out.println(center.build());
    }
}
