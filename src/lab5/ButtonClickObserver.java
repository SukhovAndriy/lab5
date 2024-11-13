package lab5;
/**
 * The ButtonClickObserver is an observer that responds to button click events.
 */
public class ButtonClickObserver implements Observer {
    /**
     * Handles the button click event.
     */
    @Override
    public void update() {
        System.out.println("Подія: натиснуто кнопку");
    }
}

