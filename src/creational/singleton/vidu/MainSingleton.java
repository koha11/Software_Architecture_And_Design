package creational.singleton.vidu;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.display();
        s1.display();
        s2.display();
        s2.display();
        s1.display();
        s2.display();
        s1.display();
        s2.display();
    }
}
