package lab8;

public class College extends Institution {
    // Спец поле для колледжа - колво специальностей
    private int majorsCount;

    public College(String name, int majorsCount) {
        super(name);
        this.majorsCount = majorsCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("колледж: " + name + " | направлений: " + majorsCount);
    }
}
