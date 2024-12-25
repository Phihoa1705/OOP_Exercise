package OOP_Ex.Exercise6.Bai6_1;

public abstract class Shape {
    protected  String color;
    protected Boolean filled;

    public Shape() {
        this.color = "Red";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
}
