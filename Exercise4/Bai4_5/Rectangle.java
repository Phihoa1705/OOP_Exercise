package OOP_Ex.Exercise4.Bai4_5;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle( double width, double length,String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width*this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color="+this.getColor()+",filled="+this.isFilled()+"]" +
                ",width="+getWidth()+",length="+getLength()+"]";
    }
}
