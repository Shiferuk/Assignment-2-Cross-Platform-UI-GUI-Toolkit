package model.Mac;

import model.TextField;

public class MacTextField implements TextField {
    @Override
    public void render() {
        System.out.println("[Mac] Rendering rounded macOS text field.");
    }
    @Override
    public void type(String text) {
        System.out.println("[Mac] Typed \"" + text + "\" into field.");
    }
}
