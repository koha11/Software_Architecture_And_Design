package final_test_practice.decorator.tokenize;

import java.util.Arrays;
import java.util.List;

public class TachTu implements ITokenize{
    private String str;

    public TachTu(String str) {
        this.str = str;
    }

    @Override
    public List<String> tokenize() {
        return Arrays.stream(str.split(" ")).toList();
    }
}
