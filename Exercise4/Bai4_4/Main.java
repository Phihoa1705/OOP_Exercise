package OOP_Ex.Exercise4.Bai4_4;

public class Main {
    public static void main(String[] args) {
        MovePoint movePoint = new MovePoint(3.0f,5.0f,4.5f,5.5f);
        System.out.println(movePoint);
        movePoint.move();
        System.out.println(movePoint);
    }
}
