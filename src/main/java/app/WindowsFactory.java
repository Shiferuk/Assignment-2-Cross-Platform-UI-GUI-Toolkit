package app;

import model.*;
import model.Windows.WindowsButton;
import model.Windows.WindowsCheckbox;
import model.Windows.WindowsTextField;

public class WindowsFactory implements SystemFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
//    public Button createButton(String os) {
//        if (os.equals("Windows")) { return new WindowsButton(); }
//    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}