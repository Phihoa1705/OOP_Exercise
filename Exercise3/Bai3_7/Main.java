package OOP_Ex.Exercise3.Bai3_7;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Ball và Player
        Ball ball = new Ball(5.0f, 10.0f, 0.0f); // Vị trí ban đầu của bóng
        Player player = new Player(7, 2.0f, 3.0f, 0.0f); // Số áo và vị trí của người chơi

        // In ra thông tin ban đầu
        System.out.println("Initial Ball Position: " + ball);
        System.out.println("Initial Player Position: " + player);

        // Di chuyển người chơi
        player.move(2.0f, 3.0f);  // Người chơi di chuyển 2 đơn vị theo trục x và 3 đơn vị theo trục y
        player.jump(5.0f);  // Người chơi nhảy lên 5 đơn vị trên trục z

        // In ra vị trí sau khi di chuyển
        System.out.println("Player Position after moving: " + player);

        // Kiểm tra xem người chơi có gần bóng không
        if (player.near(ball)) {
            System.out.println("Player is near the ball.");
        } else {
            System.out.println("Player is not near the ball.");
        }

        // Người chơi đá bóng
        player.kick(ball);  // Người chơi đá bóng

        // In ra vị trí của bóng sau khi đá
        System.out.println("Ball Position after kick: " + ball);
    }
}
