package model;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("[Windows] Rendering square check box.");
    }
    @Override
    public void toggle() {
        System.out.println("[Windows] Windows checkbox checked.");
    }
}