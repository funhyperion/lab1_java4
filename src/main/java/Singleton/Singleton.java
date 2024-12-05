package Singleton;

public class Singleton {

    // єдиний екземпляр класу
    private static Singleton instance;

    // Приватний конструктор для запобігання створенню об'єктів
    private Singleton() {}

    // Метод для отримання єдиного екземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Метод для демонстрації функціональності
    public void showMessage() {
        System.out.println("Тестування Сынглтону");
    }

}
