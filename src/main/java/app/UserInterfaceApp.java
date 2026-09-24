package app;

import model.*;

public abstract class UserInterfaceApp {

    protected abstract Button createButton();
    protected abstract Checkbox createCheckbox();

    public void displayForm() {
        System.out.println("========================================");
        System.out.println("App: Initializing OS-native form window...");

        Button submitButton = createButton();
        Checkbox termsCheckbox = createCheckbox();

        termsCheckbox.render();
        submitButton.render();
        System.out.println("App: Form successfully rendered on screen.");

        System.out.println("\n[User interaction simulated]");
        termsCheckbox.toggle();
        submitButton.click();

        System.out.println("App: Form submission complete. Saved to database.");
        System.out.println("========================================\n");
    }
}