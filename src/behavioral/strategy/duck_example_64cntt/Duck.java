package behavioral.strategy.duck_example_64cntt;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public abstract void display();
    void swim(){
        System.out.println("The duck is swimming ...");
    }
    void performQuack() {
        System.out.println(quackBehavior.quack());;
    }
    void performFly() {
        System.out.println(flyBehavior.fly());
    }
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
