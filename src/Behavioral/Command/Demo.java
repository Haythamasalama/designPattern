package Behavioral.Command;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        new TurnOnLightCommand(light);
        new TurnOffLightCommand(light);
    }
}
