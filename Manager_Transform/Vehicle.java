package OOP_Ex.Manager_Transform;

public interface Vehicle {
//    Trả về loại phương tiện
    public String getType();
//    Trả về chi phí bảo trì
    public double calculateMaintenanceCost();
//    Hiển thị thông tin phương tiện
    public void displayInfo();
//    Di chuyển phương tiện một khoảng cách nhất định (tính bằng km).
    public void move(int distance);
//    Đổ nhiên liệu cho phương tiện (không áp dụng cho xe đạp).
    public void refuel(double amount);
}
