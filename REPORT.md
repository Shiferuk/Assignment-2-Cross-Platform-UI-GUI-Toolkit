## 1. Part A - Start Without Factories

### Initial Constructor Approach (Before Builder)

Before introducing the Builder pattern, object instantiation relied on direct constructor calls with long parameter lists:

```java
String osType = "Windows";

WindowsButton winButton = null;
MacCheckbox macCheckbox = null;

if (osType.equalsIgnoreCase("Windows")) {
    winButton = new WindowsButton();
} else if (osType.equalsIgnoreCase("Mac")) {
    macCheckbox = new MacCheckbox();
}

if (osType.equalsIgnoreCase("Windows") && winButton != null) {
    winButton.renderWindowsButton();
} else if (osType.equalsIgnoreCase("Mac") && macCheckbox != null) {
    macCheckbox.renderMacCheckbox();
}
```

### Key Design Problems Identified

1. **Violation of the Single Responsibility Principle:** Every time a new OS is added or a component's instantiation logic changes (e.g., new WindowsButton() requires a theme color parameter), it necessitates modifications to the core application logic file.
2. **Complete absence of polymorphism:** Client cannot store application components in a generic list of buttons or call a single unified .render() method. The client is forced to know the internal class details and exact method names of every OS component in the application.
3. **Open/Closed principle violation:** Software design should be open for extension, but closed for modification. Adding support for a new OS family, will require manually editing every existing file in the app. Required action: find and modify every single if-else chain with-in the application.

---