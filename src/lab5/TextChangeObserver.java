package lab5;
/**
 * The TextChangeObserver is an observer that responds to text change events in a text box.
 */
public class TextChangeObserver implements Observer {
    /**
     * Handles the text change event.
     */
    @Override
    public void update() {
        System.out.println("Подія: текст змінено");
    }
}

