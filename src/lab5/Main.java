package lab5;
public class Main {
    public static void main(String[] args) {
        // Створення компонентів інтерфейсу
        Button button = new Button("Натиснути");
        TextBox textBox = new TextBox("Введіть текст");

        // Створення спостережувачів
        ButtonClickObserver buttonClickObserver = new ButtonClickObserver();
        TextChangeObserver textChangeObserver = new TextChangeObserver();

        // Додавання спостерігачів до компонентів
        button.addObserver(buttonClickObserver);
        textBox.addObserver(textChangeObserver);

        // Створення вікна і наповнення компонентами
        Window window = new Window();
        window.addComponent(button);
        window.addComponent(textBox);

        // Відображення компонентів у вікні
        window.render();

        // Події при натисканні
        button.click();
        textBox.setText("Новий текст");
    }
}

