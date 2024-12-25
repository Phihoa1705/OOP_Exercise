package OOP_Ex.Exercise6.Bai6_3;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng MovablePoint
        MovablePoint point1 = new MovablePoint(0, 0, 5, 5);
        MovablePoint point2 = new MovablePoint(10, 10, 2, 3);

        // In ra thông tin của các đối tượng MovablePoint
        System.out.println("Initial Position of point1: " + point1);
        System.out.println("Initial Position of point2: " + point2);

        // Di chuyển các điểm
        point1.moveUp();
        point1.moveRight();
        point2.moveDown();
        point2.moveLeft();

        // In ra thông tin sau khi di chuyển
        System.out.println("Position of point1 after move: " + point1);
        System.out.println("Position of point2 after move: " + point2);

        // Di chuyển thêm một lần nữa
        point1.moveDown();
        point1.moveLeft();
        point2.moveUp();
        point2.moveRight();

        // In ra thông tin sau khi di chuyển lần nữa
        System.out.println("Position of point1 after second move: " + point1);
        System.out.println("Position of point2 after second move: " + point2);
    }
}
