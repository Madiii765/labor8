package lab8;

public class Main {
    public static void main(String[] args) {
        //массив базового типа и заполняем его разными наследниками
        Institution[] list = new Institution[3];

        list[0] = new School("Гимназия №1", 11);
        list[1] = new College("Политехнический колледж", 5);
        list[2] = new University("Технический Университет",true);

        System.out.println("Список учебных заведений:");

        // В одном цикле вызываем метод и каждый объект выведет свои данные
        for (Institution inst : list) {
            inst.displayInfo();
        }
    }
}
