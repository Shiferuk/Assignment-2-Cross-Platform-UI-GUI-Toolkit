package components;

public class MacCheckbox {
    private boolean isChecked = false;

    public void renderMacCheckbox() {
        System.out.println("Rendering a macOS style checkbox with rounded corners.");
    }

    public void toggleMacCheckbox() {
        this.isChecked = !this.isChecked;
        System.out.println("Mac checkbox state changed to: " + this.isChecked);
    }
}
