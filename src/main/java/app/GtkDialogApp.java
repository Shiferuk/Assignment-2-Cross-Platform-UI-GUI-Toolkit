package app;

import model.*;

public class GtkDialogApp extends UserInterfaceApp {
    @Override
    protected Button createButton() {
        return new GtkButton();
    }

    @Override
    protected Checkbox createCheckbox() {
        return new GtkCheckbox();
    }
}