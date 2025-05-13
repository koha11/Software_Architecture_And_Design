package behavioral.strategy.tinh_toan;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        return a / b;
    }
}
