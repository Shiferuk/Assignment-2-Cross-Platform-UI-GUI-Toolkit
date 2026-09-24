package app;

import model.*;

public class MacDialogApp extends UserInterfaceApp {
    @Override
    protected Button createButton() {
        return new MacButton();
    }

    @Override
    protected Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}