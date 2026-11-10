package lab8;

public class School extends Institution {
    // Спец поле для школы - колво классов
    private int classesCount;

    public School(String name, int classesCount) {
        super(name); // Передать название в базовый класс
        this.classesCount = classesCount;
    }

    // Переопределяем метод вывода информации
    @Override
    public void displayInfo() {
        System.out.println("школа: " + name + " | всего классов: " + classesCount);
    }
}
