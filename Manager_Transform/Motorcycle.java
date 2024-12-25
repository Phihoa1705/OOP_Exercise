package OOP_Ex.Manager_Transform;

public class Motorcycle extends AbstractVehicle{
    private double fuelLevel; // Lượng nhiên liệu hiện tại
    private final double fuelConsumptionRate = 0.05; // Tiêu thụ nhiên liệu (lít/km)

    public Motorcycle(String name, double baseMaintenanceCos) {
        super(name, baseMaintenanceCos);
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public double calculateMaintenanceCost() {
        // Chi phí nhiên liệu dựa trên tổng số km di chuyển
        double fuelCost = this.getMileage() * fuelConsumptionRate * 20; // Giả sử giá nhiên liệu là 20/lít
        return this.getBaseMaintenanceCost() + fuelCost;
    }

    @Override
    public void refuel(double amount) {
        fuelLevel += amount; // Tăng mức nhiên liệu hiện tại
    }

    @Override
    public void move(int distance) {
        double requiredFuel = distance * fuelConsumptionRate;
        if (fuelLevel >= requiredFuel) {
            fuelLevel -= requiredFuel;
            super.move(distance); // Gọi move từ AbstractVehicle để tăng mileage
        } else {
            System.out.println("Không đủ nhiên liệu để di chuyển.");
        }
    }

    @Override
    public double calculateFuelCost() {
        return this.getMileage() * fuelConsumptionRate * 20; // Chi phí nhiên liệu xe máy
    }
}
