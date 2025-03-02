package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
            .buildCPU("Intel I3813")
            .buildRAM("8GB")
            .buildStorage("1TB")
            .buildScreen("4k")
            .build();

        System.out.println(c.toString());
    }
}
