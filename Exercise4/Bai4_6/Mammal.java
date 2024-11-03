package OOP_Ex.Exercise4.Bai4_6;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal["+super.toString()+"]";
    }
}
