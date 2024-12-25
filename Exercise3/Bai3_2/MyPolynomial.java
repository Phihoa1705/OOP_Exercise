package OOP_Ex.Exercise3.Bai3_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }
/*
    Lặp qua mảng coeffs (hệ số của đa thức) từ bậc cao nhất đến bậc thấp nhất.
    Nếu hệ số của một hạng tử là 0, thì bỏ qua hạng tử đó.
    Đối với từng hạng tử, kiểm tra và định dạng hệ số:
    Làm tròn hệ số đến 2 chữ số sau dấu phẩy.
    Thêm dấu cộng (+) hoặc dấu trừ (-) tùy thuộc vào giá trị của hệ số.
    Thêm ký hiệu x^bậc đối với các bậc từ 2 trở lên, hoặc x đối với bậc 1.
    Trả về chuỗi mô tả đa thức với các hạng tử được nối lại với nhau.
 */
    @Override
    public String toString() {
        String coeffsString = "";
        for (int degree = coeffs.length - 1; degree >= 0; degree--) {
            if (coeffs[degree] == 0) {
                continue;
            }
            if (degree == coeffs.length - 1) {
                coeffsString += Math.floor(coeffs[degree] * 100) / 100;
            }else{
                coeffsString += (coeffs[degree] > 0 ? " + " : " - ");
                coeffsString += Math.floor(coeffs[degree] * 100) / 100;
            }

            if (degree >= 2) {
                coeffsString += "x^" + degree;
            } else if (degree == 1) {
                coeffsString += "x";
            }
        }
        return coeffsString;
    }
//  Tính giá trị của đa thức tại giá trị x
    public double evaluate(double x) {
        double ans = 0;
        for (int degree = 0; degree < coeffs.length; degree++) {
            ans += Math.pow((coeffs[degree] * x), degree);
        }
        return ans;
    }
//  Cộng hai đa thức lại với nhau
    public MyPolynomial add(MyPolynomial another) {
        int size = coeffs.length > another.getDegree() + 1 ? coeffs.length : another.getDegree() + 1;

        double[] ans = new double[size];

        for (int degree = 0; degree < ans.length; degree++) {
            double add = 0;
            if (degree <= this.getDegree()) {
                add += coeffs[degree];
            }
            if (degree <= another.getDegree()) {
                add += another.coeffs[degree];
            }
            ans[degree] = add;
        }

        return new MyPolynomial(ans);
    }
//  Nhân hai đa thức lại với nhau.
    public MyPolynomial multiply(MyPolynomial another) {
        int size = getDegree() + another.getDegree() + 1;
        double[] ans = new double[size];

        for (int deg1 = 0; deg1 < coeffs.length; deg1++) {
            for (int deg2 = 0; deg2 < another.coeffs.length; deg2++) {
                double num = coeffs[deg1] * another.coeffs[deg2];
                ans[deg1 + deg2] += num;
            }
        }

        return new MyPolynomial(ans);
    }
}
