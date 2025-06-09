package final_test_practice.decorator.bevarage;

public class MainBevarage {
    public static void main(String[] args) {
        Bevarage espresso = new Espresso();

        System.out.println(espresso.getDescription() + " co gia la " + espresso.cost());
        espresso = new Milk(espresso);

        System.out.println(espresso.getDescription() + " co gia la " + espresso.cost());
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription() + " co gia la " + espresso.cost());
        espresso = new Soy(espresso);

        System.out.println(espresso.getDescription() + " co gia la " + espresso.cost());
    }
}
