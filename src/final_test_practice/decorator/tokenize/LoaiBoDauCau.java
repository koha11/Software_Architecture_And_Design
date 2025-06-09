package final_test_practice.decorator.tokenize;

import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    public LoaiBoDauCau(ITokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        return super.tokenize().stream().map(token -> token.replaceAll("\\p{Punct}", "")).toList();
    }
}
