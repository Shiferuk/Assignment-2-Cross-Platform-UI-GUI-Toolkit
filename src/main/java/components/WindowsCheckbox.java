package components;

public class WindowsCheckbox {
    private boolean isChecked = false;

    public void renderWindowsCheckbox() {
        System.out.println("Rendering a Windows style checkbox with rounded corners.");
    }

    public void toggleWindowsCheckbox() {
        this.isChecked = !this.isChecked;
        System.out.println("Windows checkbox state changed to: " + this.isChecked);
    }
}
