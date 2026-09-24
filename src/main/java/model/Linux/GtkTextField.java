package model.Linux;

import model.TextField;

public class GtkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("[Gtk] Rendering flat-style Gtk text entry.");
    }
    @Override
    public void type(String text) {
        System.out.println("[Gtk] Typed \"" + text + "\" into field.");
    }
}
