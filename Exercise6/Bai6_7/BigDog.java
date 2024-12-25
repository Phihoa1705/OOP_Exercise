package OOP_Ex.Exercise6.Bai6_7;

public class BigDog extends Dog{
    public BigDog() {
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() + ']';
    }

    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}