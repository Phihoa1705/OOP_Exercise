package OOP_Ex.Manager_Transform;

// Abstract Class AbstractVehicle
public abstract class AbstractVehicle implements Vehicle {
    protected String name;               // Tên phương tiện
    protected double baseMaintenanceCost; // Chi phí bảo trì cơ bản
    protected int mileage;               // Tổng quãng đường đã di chuyển (km)

    // Constructor
    public AbstractVehicle(String name, double baseMaintenanceCost) {
        this.name = name;
        this.baseMaintenanceCost = baseMaintenanceCost;
        this.mileage = 0; // Ban đầu chưa di chuyển km nào
    }

    // Phương thức di chuyển, tăng quãng đường đã di chuyển
    @Override
    public void move(int distance) {
        if (distance > 0) {
            mileage += distance;
        } else {
            System.out.println("Khoảng cách di chuyển phải lớn hơn 0.");
        }
    }

    // Phương thức trừu tượng để tính chi phí nhiên liệu, sẽ được triển khai cụ thể ở lớp con
    public abstract double calculateFuelCost();

    public double getBaseMaintenanceCost() {
        return baseMaintenanceCost;
    }

    public void setBaseMaintenanceCost(double baseMaintenanceCost) {
        this.baseMaintenanceCost = baseMaintenanceCost;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void refuel(double amount) {

    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên phương tiện: " + name);
        System.out.println("Loại phương tiện: " + getType());
        System.out.println("Tổng số km đã di chuyển: " + mileage);
        System.out.println("Chi phí bảo trì: " + calculateMaintenanceCost());
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0;
    }
}


