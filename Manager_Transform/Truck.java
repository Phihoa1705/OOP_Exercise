package OOP_Ex.Manager_Transform;

public class Truck extends  AbstractVehicle{
    private double fuelLevel; // Lượng nhiên liệu hiện tại
    private final double fuelConsumptionRate = 0.2; // Tiêu thụ nhiên liệu (lít/km)
    private final double loadWeight; // Trọng lượng tải

    public Truck(String name, double baseMaintenanceCost, double loadWeight) {
        super(name, baseMaintenanceCost);
        this.loadWeight = loadWeight;
        this.fuelLevel = 0; // Bắt đầu với lượng nhiên liệu bằng 0
    }

    @Override
    public double calculateFuelCost() {
        return 0;
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public double calculateMaintenanceCost() {
        double additionalMaintenanceCost = 100.0; // Chi phí bảo trì cao hơn do kích thước lớn.
        return baseMaintenanceCost + additionalMaintenanceCost;
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void refuel(double amount) {
        fuelLevel += amount; // Tăng mức nhiên liệu hiện tại
    }
}
