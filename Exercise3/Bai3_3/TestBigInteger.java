package OOP_Ex.Exercise3.Bai3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main (String [] args) {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("2222222222222343242222222234234234234212222222222222222222");
        System.out.println (i1.add(i2));
    }
}
