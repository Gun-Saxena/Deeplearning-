public class Computer{
    private String cpu;
    private int ram;
    private int storage;
    private String graphicsCard;
    private Computer(Builder b) {
        this.cpu=b.cpu;
        this.ram=b.ram;
        this.storage=b.storage;
        this.graphicsCard=b.graphicsCard;
    }
    public void display() {
        System.out.println("CPU :"+cpu);
        System.out.println("RAM :"+ram+ " GB");
        System.out.println("Storage:"+storage+" GB");
        System.out.println("Graphics Card:"+graphicsCard);
    }
    public static class Builder{
        private String cpu;
        private int ram;
        private int storage;
        private String graphicsCard;
        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setRAM(int ram) {
            this.ram=ram;
            return this;
        }
        public Builder setStorage(int storage) {
            this.storage=storage;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard=graphicsCard;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}