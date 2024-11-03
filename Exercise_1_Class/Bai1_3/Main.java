package OOP_Ex.Exercise_1_Class.Bai1_3;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f,3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r2.getWidth());

        /*
            - %.2f là một định dạng số thập phân:
                + % là ký tự bắt đầu của định dạng.
                + .2 chỉ ra rằng bạn muốn in ra số thập phân với 2 chữ số sau dấu chấm thập phân.
                + f biểu thị rằng giá trị sẽ là một số dấu phẩy động (float hoặc double).
                + %n là một ký tự đặc biệt được sử dụng để xuống dòng. Nó tương đương với \n nhưng
                phụ thuộc vào hệ điều hành để đảm bảo sự tương thích (ví dụ, trên Windows nó sẽ là "\r\n")
         */

        System.out.printf("area is: %.2f%n",r1.getArea());
        System.out.printf("perimeter is: %.2f%n",r1.getPerimeter());
    }
}
