package model;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("[Windows] Rendering sharp rectangular button.");
    }
    @Override
    public void click() {
        System.out.println("[Windows] Windows button clicked!");
    }
}