package engineering_concepts.design_pattern.CommandPattern;

public class RemoteControl{
    private Command com;
    public void setCommand(Command com){
        this.com=com;
    }
    public void pressButton() {
        com.execute();
    }
}
