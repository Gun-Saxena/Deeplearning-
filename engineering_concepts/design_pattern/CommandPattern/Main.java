package engineering_concepts.design_pattern.CommandPattern;

public class Main{
    public static void main(String[] args){
        Light l=new Light();
        Command on=new LightOnCommand(l);
        Command off=new LightOffCommand(l);
        RemoteControl rem=new RemoteControl();
        rem.setCommand(on);
        rem.pressButton();
        rem.setCommand(off);
        rem.pressButton();
    }
}