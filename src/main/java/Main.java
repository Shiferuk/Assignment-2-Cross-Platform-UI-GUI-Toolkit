import app.*;

public class Main {
    public static void main(String[] args) {
        String osType = "Mac";

        SystemFactory factory;

        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (osType.equalsIgnoreCase("Gtk")) {
            factory = new GtkFactory();
        } else {
            factory = new MacFactory();
        }

        FormRenderer renderer = new FormRenderer(factory);
        renderer.displayForm();
    }
}