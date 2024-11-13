package lab5;
import java.util.ArrayList;
import java.util.List;
/**
 * The Button class represents a button in the GUI that notifies observers about button clicks.
 */
public class Button implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String label; // Текст на кнопці
    /**
     * Constructor to create a button with a label.
     * @param label The text on the button.
     */
    public Button(String label) {
        this.label = label;
    }
    /**
     * Adds an observer to the button.
     * @param observer The observer to be added.
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Notifies all observers about a button click event.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(); // Оновлює всіх спостерігачів
        }
    }
    /**
     * Simulates a button click and notifies observers about the event.
     */
    public void click() {
        System.out.println("Кнопка: " + label);
        notifyObservers(); // Повідомляє спостерігачів про натискання
    }
    /**
     * Renders the button on the screen.
     */
    public void render() {
        System.out.println("Відображення кнопки: " + label);
    }
}

