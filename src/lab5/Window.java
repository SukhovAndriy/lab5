package lab5;
import java.util.ArrayList;
import java.util.List;
/**
 * The Window class represents a window that can contain multiple GUI components (buttons, text boxes).
 * It allows adding, rendering, and observing events from these components.
 */
public class Window {
    private List<Subject> components = new ArrayList<>(); // Список компонентів у вікні
    /**
     * Adds a component to the window.
     * @param component The component to be added.
     */
    public void addComponent(Subject component) {
        components.add(component);
    }
    /**
     * Renders all the components in the window.
     */
    public void render() {
        for (Subject component : components) {
            if (component instanceof Button) {
                ((Button) component).render(); // Відображає кнопку
            } else if (component instanceof TextBox) {
                ((TextBox) component).render(); // Відображає текстове поле
            }
        }
    }
}

