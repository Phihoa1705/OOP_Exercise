package OOP_Ex.Exercise4.Bai4_4;

public class MovePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] result = new float[] {getxSpeed(),getySpeed()};
        return result;
    }

    public MovePoint move() {
        float x = getX();
        float y = getY();

        x += this.xSpeed;
        y += this.ySpeed;

        this.setX(x);
        this.setY(y);

        return this;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+"),speed=("+xSpeed+","+ySpeed+")";
    }
}
