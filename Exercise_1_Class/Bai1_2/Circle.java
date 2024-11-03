package OOP_Ex.Exercise_1_Class.Bai1_2;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle() {

    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getCircumference() {
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
