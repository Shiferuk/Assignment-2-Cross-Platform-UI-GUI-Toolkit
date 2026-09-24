package model.Linux;

import model.Button;

public class GtkButton implements Button {
    @Override
    public void render() {
        System.out.println("[Gtk] Rendering rounded Linux Gtk button.");
    }
    @Override
    public void click() {
        System.out.println("[Gtk] Gtk button clicked!");
    }
}