package OOP_Ex.Exercise4.Bai4_6;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog["+super.toString()+"]";
    }
}
