package app;

import model.*;

public class WindowsDialogApp extends UserInterfaceApp {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }

    @Override
    protected Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}