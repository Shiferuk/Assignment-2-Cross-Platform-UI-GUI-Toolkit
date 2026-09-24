package model.Mac;

import model.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("[Mac] Rendering rounded macOS button.");
    }
    @Override
    public void click() {
        System.out.println("[Mac] Mac button clicked!");
    }
}