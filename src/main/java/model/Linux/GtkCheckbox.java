package model.Linux;

import model.Checkbox;

public class GtkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("[Gtk] Rendering rounded Linux Gtk check mark.");
    }
    @Override
    public void toggle() {
        System.out.println("[Gtk] Gtk checkbox toggled.");
    }
}