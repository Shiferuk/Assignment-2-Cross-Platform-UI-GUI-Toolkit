package app;

import components.*;

public class UserInterfaceApp {
    private String osType;

    private WindowsButton winButton;
    private MacButton macButton;
    private GtkButton gtkButton;

    private WindowsCheckbox winCheckbox;
    private MacCheckbox macCheckbox;
    private GtkCheckbox gtkCheckbox;

    private WindowsTextField winTextField;
    private MacTextField macTextField;
    private GtkTextField gtkTextField;

    public UserInterfaceApp(String osType) {
        this.osType = osType;
    }

    public void buildForm() {
        if (osType.equalsIgnoreCase("Windows")) {
            this.winButton = new WindowsButton();
            this.winCheckbox = new WindowsCheckbox();
            this.winTextField = new WindowsTextField();
        } else if (osType.equalsIgnoreCase("Mac")) {
            this.macButton = new MacButton();
            this.macCheckbox = new MacCheckbox();
            this.macTextField = new MacTextField();
        } else if (osType.equalsIgnoreCase("Linux")) {
            this.gtkButton = new GtkButton();
            this.gtkCheckbox = new GtkCheckbox();
            this.gtkTextField = new GtkTextField();
        } else {
            throw new IllegalArgumentException("Unsupported OS: " + osType);
        }
    }

    public void renderForm() {
        if (osType.equalsIgnoreCase("Windows")) {
            winButton.renderWindowsButton();
            winCheckbox.renderWindowsCheckbox();
            //winTextField.renderWindowsTextField();
        } else if (osType.equalsIgnoreCase("Mac")) {
            macButton.renderMacButton();
            macCheckbox.renderMacCheckbox();
            //macTextField.renderMacTextField();
        } else if (osType.equalsIgnoreCase("Linux")) {
            gtkButton.renderGtkButton();
            gtkCheckbox.renderGtkCheckbox();
            //gtkTextField.renderGtkTextField();
        }
    }
}