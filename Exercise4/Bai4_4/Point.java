package OOP_Ex.Exercise4.Bai4_4;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 1.0f;
        this.y = 1.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] result = new float[] {getX(),getY()};
        return result;
    }

    @Override
    public String toString() {
        return  "("+x +","+y+")";
    }
}
