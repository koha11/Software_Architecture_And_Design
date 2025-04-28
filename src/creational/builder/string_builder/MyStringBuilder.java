package creational.builder.string_builder;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder() {
        this.str = "";
    }

    public MyStringBuilder addString(String s) {
        str += s;
        return this;
    }

    public MyStringBuilder addFloat(float f) {
        str += Float.toString(f);

        return this;
    }

    public MyStringBuilder addBool(boolean b) {
        str += Boolean.toString(b);

        return this;
    }

    public String toString() {
        return str;
    }
}
