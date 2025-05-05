package structural.decorator.tokenize;

public class MainTokenize {
    public static void main(String[] args) {
        ITokenize token = new TachTu("Ngày mai là ngày thứ ba, và là ngày đi học");

        token = new LoaiBoDauCau(token);
        token = new LoaiBoTuDung(token);

        System.out.println(token.tokenize());
    }
}
