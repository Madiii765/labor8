package lab8;

public abstract class Institution {
    // общ поле для всех заведений - название
    protected String name;

    // Конструктор базового класса
    public Institution(String name) {
        this.name = name;
    }

    // метод, который каждый обязан написать по-своему
    public abstract void displayInfo();
}
