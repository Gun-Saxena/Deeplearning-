package engineering_concepts.design_pattern.SingletonPattern;
public class Main {
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        l1.log("First log message");
        Logger l2=Logger.getInstance();
        l2.log("Second log message");
        if(l1==l2){
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
    }
}
