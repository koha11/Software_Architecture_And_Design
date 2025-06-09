package final_test_practice.decorator.tokenize;

public class MainTokenize {
    public static void main(String[] args) {
        ITokenize token = new TachTu("Lz vinh, và ngu");
        System.out.println(token.tokenize());
        token = new LoaiBoDauCau(token);
        System.out.println(token.tokenize());
        token = new LoaiBoTuDung(token);
        System.out.println(token.tokenize());
    }
}
