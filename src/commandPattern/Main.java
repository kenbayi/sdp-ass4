package commandPattern;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();
        Light light = new Light();

        remote.setCommand(0, new TurnTVOn(tv));
        remote.setCommand(1, new DimLights(light));

        remote.pressButton(0);  // TV ON
        remote.pressUndo();      // TV OFF

        remote.pressButton(1);  // Light DIM
        remote.pressUndo();      // Light ON
    }
}

