package components;

public class GtkCheckbox {
    private boolean isChecked = false;

    public void renderGtkCheckbox() {
        System.out.println("Rendering a Linux Gtk style checkbox with rounded corners.");
    }

    public void toggleGtkCheckbox() {
        this.isChecked = !this.isChecked;
        System.out.println("Linux Gtk checkbox state changed to: " + this.isChecked);
    }
}
