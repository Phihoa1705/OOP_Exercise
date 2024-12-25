package OOP_Ex.Manager_Transform;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Xe đạp",20);
        bicycle.displayInfo();
        System.out.println("Khi đã di chuyển");
        bicycle.move(30);
        bicycle.displayInfo();
    }
}
