package OOP_Ex.Exercise6.Bai6_8;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        System.out.println("=======================================================");
//        Có thể dùng interface de tạo object
        Movable movablePoint = new MovablePoint(2,4,5,7);
        Movable movableCircle = new MovableCircle(5,3,2,5,10);
        print(movablePoint);
        print(movableCircle);

    }
//    Lập trình hay dùng
    public static void print(Movable movable) {
        System.out.println(movable);
    }
}
