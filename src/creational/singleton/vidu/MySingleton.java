package creational.singleton.vidu;

public class MySingleton {
    private static MySingleton instance;
    int count = 1;
    private MySingleton() {}

    public static MySingleton getInstance(){
        if(instance == null)
        {
            System.out.println("Chua khoi tao");
            instance = new MySingleton();
            return instance;
        }

        System.out.println("Da khoi tao");
        return instance;
    }

    public void display(){
        System.out.println(count++);
    }
}
