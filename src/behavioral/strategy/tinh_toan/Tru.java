package behavioral.strategy.tinh_toan;

public class Tru implements Tinh{
    @Override
    public float tinh(float a, float b) {
        return a - b;
    }
}
