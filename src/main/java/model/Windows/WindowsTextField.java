package model.Windows;

import model.TextField;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("[Windows] Rendering square-edged text input.");
    }
    @Override
    public void type(String text) {
        System.out.println("[Windows] Typed \"" + text + "\" into field.");
    }
}
