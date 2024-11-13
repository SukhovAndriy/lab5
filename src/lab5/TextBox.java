package lab5;
import java.util.ArrayList;
import java.util.List;
/**
 * The TextBox class represents a text box in the GUI that notifies observers about text changes.
 */
public class TextBox implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String text; // Текст у текстовому полі
    /**
     * Constructor to create a text box with initial text.
     * @param initialText The initial text in the text box.
     */
    public TextBox(String initialText) {
        this.text = initialText;
    }
    /**
     * Adds an observer to the text box.
     * @param observer The observer to be added.
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Notifies all observers about a text change event.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    /**
     * Sets new text in the text box and notifies observers.
     * @param newText The new text to be set.
     */
    public void setText(String newText) {
        this.text = newText;
        System.out.println("Текст змінений на: " + newText);
        notifyObservers(); // Повідомляє спостерігачів про зміну тексту
    }
    /**
     * Renders the text box on the screen.
     */
    public void render() {
        System.out.println("Відображення текстового поля: " + text);
    }
}

