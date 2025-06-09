package final_test_practice.decorator.tokenize;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    private List<String> tuDungs = List.of("và", "hoặc", "thì", "mà", "là");

    public LoaiBoTuDung(ITokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        ArrayList<String> tokens = new ArrayList<>(super.tokenize());
        tokens.removeAll(tuDungs);
        return tokens;
    }
}
