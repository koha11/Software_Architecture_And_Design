package creational.factory.pizza;

import creational.factory.pizza.vietnam.PizzaStore_VietNam;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore_VietNam();
        Pizza p = ps.orderPizza(PizzaType.HAISAN);

        System.out.println(p.toString());

    }
}
