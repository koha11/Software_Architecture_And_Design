package creational.builder.string_builder;

public class MainA2 {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        builder.addBool(true).addString("hello world").addFloat(1.4f);
        builder.addBool(true).addString("\n").addFloat(1.4f);
        System.out.println(builder);
    }
}
