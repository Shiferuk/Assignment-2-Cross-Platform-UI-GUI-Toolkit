## 1. Part A - Start Without Factories

### The Problem: Object Creation Without a Pattern

Before applying any creational pattern, the client code instantiated OS-specific
components directly, using string checks to decide which concrete class to build:

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
## 2. Part B - Factory Method

### Applying Factory Method

The fix moves the "which concrete class" decision out of the client and into the
class hierarchy itself. `SystemFactory` declares two abstract factory methods,
`createButton()` and `createCheckbox()`, and defines `displayForm()` — a method
that assembles and drives a form using only the `Button` and `Checkbox`
interfaces, with no knowledge of Windows, Mac, or Gtk. Each subclass
(`WindowsFactory`, `MacFactory`, `GtkFactory`) overrides the factory
methods to supply its own concrete products; polymorphism picks the right one
at runtime instead of an if-else chain. This is what makes it a Factory Method
rather than a static factory: creation is deferred to subclasses via
inheritance, and the Creator (`SystemFactory`) still owns real business
logic that operates on the Product interfaces.

---
## 3. Part C - Abstract Factory

### Applying Abstract Factory and introduce product family

The main idea is that instead of creating individual products directly, the program uses
a factory that can create several related products. Each concrete factory produces products
that belong to the same family and are compatible with each other.
I change the 'UserInterfaceApp' abstract class to `SystemFactory` interface. It defines 
methods for creating three different product types:
```java
public interface SystemFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextField createTextField();
}
```
The factory does not specify the exact classes that will be created. This allows different
concrete factories to provide different product families.

**FormRenderer.java the business-logic client:** Old displayForm() lived inside the abstract 
UserInterfaceApp. Since SystemFactory is now a plain interface with no method bodies allowed, 
that logic needed a new home — FormRenderer takes a SystemFactory in its constructor and 
drives the form using it.


