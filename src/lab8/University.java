package lab8;

public class University extends Institution {
    // спецполе для университета - наличие военной кафедры
    private boolean hasMilitaryDepartment;

    public University(String name, boolean hasMilitaryDepartment) {
        super(name);
        this.hasMilitaryDepartment = hasMilitaryDepartment;
    }

    @Override
    public void displayInfo() {
        String military = hasMilitaryDepartment ? "Есть" : "Нет";
        System.out.println("Университет: " + name + " | Военная кафедра: " + military);
    }
}
