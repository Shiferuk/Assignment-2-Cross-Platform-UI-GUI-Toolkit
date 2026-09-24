package model;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("[Mac] Rendering rounded macOS check mark.");
    }
    @Override
    public void toggle() {
        System.out.println("[Mac] Mac checkbox toggled.");
    }
}