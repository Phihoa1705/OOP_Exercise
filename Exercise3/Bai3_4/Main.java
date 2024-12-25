package OOP_Ex.Exercise3.Bai3_4;

public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23,59,59);
        System.out.println(myTime);
        myTime.nextHour();
        System.out.println(myTime);
        myTime.nextSecond();
        System.out.println(myTime);
    }
}
