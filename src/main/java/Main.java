import components.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        String osType = name;

        WindowsButton winButton = null;
        WindowsCheckbox winCheckbox = null;
        WindowsTextField winTextField = null;
        MacButton macButton = null;
        MacCheckbox macCheckbox = null;
        MacTextField maxTextField = null;
        GtkButton gtkButton = null;
        GtkCheckbox gtkCheckbox = null;
        GtkTextField gtkTextField = null;

        if (osType.equalsIgnoreCase("Windows")) {
            winButton = new WindowsButton();
        } else if (osType.equalsIgnoreCase("Mac")) {
            macCheckbox = new MacCheckbox();
        }

        // Usage phase: Repeating conditional checks and calling specific method names
        if (osType.equalsIgnoreCase("Windows") && winButton != null) {
            winButton.renderWindowsButton();
            winButton.onClickWindows();
        } else if (osType.equalsIgnoreCase("Mac") && macCheckbox != null) {
            macCheckbox.renderMacCheckbox();
            macCheckbox.toggleMacCheckbox();
        }
    }
}