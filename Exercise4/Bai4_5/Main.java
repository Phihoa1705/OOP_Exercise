package OOP_Ex.Exercise4.Bai4_5;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("blue",true);
        System.out.println("getColor="+ shape.getColor());
        System.out.println("isFilled="+ shape.isFilled());

        Circle circle = new Circle(3.5,"green",true);
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println("Hình tròn: "+circle);

        Rectangle rectangle = new Rectangle(4,5,"red",true);
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Hình chữ nhật: " + rectangle);

        Square square = new Square(5.5,"yellow",false);
        System.out.println("Square getSide: " + square.getSide());
//      setWidth && setLength
        square.setWidth(7.6);
        System.out.println(square);
        square.setLength(8.5);
        System.out.println(square);
    }
}
