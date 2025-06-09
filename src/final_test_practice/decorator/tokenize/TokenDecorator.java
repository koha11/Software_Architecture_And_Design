package final_test_practice.decorator.tokenize;

import java.util.List;

public class TokenDecorator implements ITokenize {
    private ITokenize token;

    public TokenDecorator(ITokenize token) {
        this.token = token;
    }

    @Override
    public List<String> tokenize() {
        return token.tokenize();
    }
}
