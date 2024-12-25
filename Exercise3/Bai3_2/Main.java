package OOP_Ex.Exercise3.Bai3_2;

public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        double[] coeffs = {1.2, 3.4, 5.6, 7.8} ;
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p2.add(p3));
        System.out.println(p3.multiply(p1));
    }
}
