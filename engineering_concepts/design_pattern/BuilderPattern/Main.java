public class Main {
    public static void main(String[] args) {
        Computer c=new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();
        Computer o=new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicsCard("Integrated Graphics")
                .build();
        System.out.println("Gaming PC");
        c.display();
        System.out.println("Office PC");
        o.display();
    }
}
