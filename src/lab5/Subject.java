package lab5;
/**
 * The Subject interface is used for components in the GUI.
 * It defines methods for adding, removing, and notifying observers about events.
 */
public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers();
}

