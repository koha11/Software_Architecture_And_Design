package structural.decorator.tokenize;

import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    private List<String> tuDungs = List.of("thì", "mà", "là", "vì", "nên", "và");

    public LoaiBoTuDung(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> t = tokens.tokenize();
        t.removeAll(tuDungs);
        return t;
    }
}
