package OOP_Ex.Manager_Transform;

public class Bicycle extends AbstractVehicle{

    public Bicycle(String name, double baseMaintenanceCos) {
        super(name,baseMaintenanceCos);
    }

    @Override
    public double calculateMaintenanceCost() {
        double repairCost = 10.0; // khoản chi phí nhỏ cho sửa chữa
        return this.getBaseMaintenanceCost() + repairCost;
    }

    @Override
    public void move(int distance) {
        super.move(distance);
    }

    @Override
    public String getType() {
        return "Bicycle";
    }

//    Phuong thuc ko thuc hien
    @Override
    public double calculateFuelCost() {
        return 0;
    }

}
