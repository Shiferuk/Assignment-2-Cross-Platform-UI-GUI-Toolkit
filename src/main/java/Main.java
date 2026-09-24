import app.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        String osType = "Mac";

        UserInterfaceApp app;

        if (osType.equalsIgnoreCase("Windows")) {
            app = new WindowsDialogApp();
        } else if (osType.equalsIgnoreCase("Gtk")) {
            app = new GtkDialogApp();
        } else {
            app = new MacDialogApp();
        }

        app.displayForm();
    }
}