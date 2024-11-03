package OOP_Ex.Exercise4.Bai4_5;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        this.setWidth(side);
        this.setLength(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public double getSide() {
        return this.getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color="+this.getColor()+",filled="+this.isFilled()+
                "],width="+this.getWidth()+",length="+this.getLength();
    }
}
