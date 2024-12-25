package OOP_Ex.Exercise_2.Bai2_9;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
//  distance = căn((x2 - x1)^2 + (y2 - y1)^2)
//  Tính khoảng cách giữa điểm hiện tại (this.x, this.y)
//  và một điểm khác có tọa độ (x, y) được truyền vào.
    public double distance(int x, int y) {
        return (double) Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
/*
    Tính khoảng cách giữa điểm hiện tại (this.x, this.y) và một điểm khác
    được biểu diễn bởi đối tượng MyPoint khác.
 */
    public double distance(MyPoint another) {
        return (double) Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    }
/*
     Tính khoảng cách từ điểm hiện tại (this.x, this.y) đến gốc tọa độ (0, 0).
 */
    public double distance() {
        return (double) Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
