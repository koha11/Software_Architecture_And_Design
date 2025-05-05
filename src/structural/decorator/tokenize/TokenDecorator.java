package structural.decorator.tokenize;

import java.util.List;

public class TokenDecorator implements ITokenize{
    ITokenize tokens;

    public TokenDecorator(ITokenize tokens) {
        this.tokens = tokens;
    }

    @Override
    public List<String> tokenize() {
        return tokens.tokenize();
    }
}
