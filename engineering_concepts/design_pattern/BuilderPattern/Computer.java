public class Computer{
    private String cpu;
    private int ram;
    private int store;
    private String gCard;
    private Computer(Builder b) {
        this.cpu=b.cpu;
        this.ram=b.ram;
        this.store=b.store;
        this.gCard=b.gCard;
    }
    public void display() {
        System.out.println("CPU :"+cpu);
        System.out.println("RAM :"+ram+ " GB");
        System.out.println("Storage:"+store+" GB");
        System.out.println("Graphics Card:"+gCard);
    }
    public static class Builder{
        private String cpu;
        private int ram;
        private int store;
        private String gCard;
        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setRAM(int ram) {
            this.ram=ram;
            return this;
        }
        public Builder setStorage(int store) {
            this.store=store;
            return this;
        }
        public Builder setGraphicsCard(String gCard) {
            this.gCard=gCard;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
