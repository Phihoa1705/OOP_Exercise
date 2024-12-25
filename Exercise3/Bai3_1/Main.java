package OOP_Ex.Exercise3.Bai3_1;


public class Main {
    public static void main(String[] args) {
        OOP_Ex.Exercise3.Bai3_1.MyComplex myComplex = new OOP_Ex.Exercise3.Bai3_1.MyComplex(2.1,2.6);
        System.out.println("MyComplex: " + myComplex);

        myComplex.add(new OOP_Ex.Exercise3.Bai3_1.MyComplex(2,6));
        System.out.println("MyComplex after add: " + myComplex);

        OOP_Ex.Exercise3.Bai3_1.MyComplex myComplex1 =  myComplex.addNew(new OOP_Ex.Exercise3.Bai3_1.MyComplex(2,3));
        System.out.println("MyComplex after addNew: " + myComplex1); 
        
        MyComplex myComplex2 = new MyComplex(2.1,2.6);
        myComplex2 = myComplex2.subtract(new MyComplex(2,6));
        System.out.println("MyComplex after substract: " + myComplex2);
        myComplex2 = myComplex2.multiply(new MyComplex(2.5,3.6));
        System.out.println("MyComplex after multiply: " + myComplex2);
        myComplex2 = myComplex2.conjugate();
        System.out.println("MyComplex after conjugate: " + myComplex2);

    }
}
