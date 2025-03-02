package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class PizzaStore_VietNam extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType t) {
        switch (t) {
            case HAISAN -> {
                return new Pizza_HaiSan();
            }
        }

        return new Pizza_HaiSan();
    }
}
