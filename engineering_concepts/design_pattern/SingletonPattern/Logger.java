package engineering_concepts.design_pattern.SingletonPattern;

public class Logger {
    private static Logger obj;
    private Logger(){
        System.out.println("Logger instance created.");
    }
    public static Logger getInstance(){
        if (obj == null) {
            obj= new Logger();
        }
        return obj;
    }
}
