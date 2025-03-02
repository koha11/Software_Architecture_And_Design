package behavioral.strategy.duck_example_64cntt;

import java.sql.SQLOutput;

public class VitQuay extends Duck {
    public VitQuay(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am VitQuayBacKinh ...");
        this.swim();
        this.performFly();
        this.performQuack();
        System.out.println("Chúc ăn ngon !!!");
    }
}
