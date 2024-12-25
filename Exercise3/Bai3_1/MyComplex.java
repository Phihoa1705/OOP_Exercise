package OOP_Ex.Exercise3.Bai3_1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }
//  Trả về true nếu phần thực của số phức là 0 (tức là số phức là một số ảo).
    public boolean isReal(){
        return (real == 0);
    }
//  Trả về true nếu phần ảo của số phức là 0 (tức là số phức là một số thực).
    public boolean isImaginary(){
        return (imag == 0);
    }
/*
    So sánh số phức hiện tại với một số phức có giá trị phần thực và phần ảo là real và imag.
    Trả về true nếu hai số phức giống nhau.
 */
    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }
/*
    So sánh số phức hiện tại với một đối tượng MyComplex khác.
    Trả về true nếu hai số phức có cùng phần thực và phần ảo.
 */
    public boolean equals(MyComplex another){
        return (this.real == another.real && this.imag == another.imag);
    }
/*
    add(MyComplex right) Cộng số phức right vào số phức hiện tại (thực hiện tại chỗ),
    thay đổi giá trị của đối tượng hiện tại.
 */
public MyComplex add(MyComplex right){
    this.real+=right.real;
    this.imag+=right.imag;
    return this;
}
/*
    addNew(MyComplex right): Cộng số phức right vào số phức hiện tại và trả về một đối
    tượng MyComplex mới mà không thay đổi đối tượng hiện tại.
 */
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.real,this.imag+right.imag);
    }
/*
    subtract(MyComplex right) Trừ số phức right từ số phức hiện tại (thực hiện tại chỗ),
     thay đổi giá trị của đối tượng hiện tại.
 */
    public MyComplex subtract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }
/*
    subtractNew(MyComplex right): Trừ số phức right từ số phức hiện tại và
    trả về một đối tượng MyComplex mới mà không thay đổi đối tượng hiện tại.
 */
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.real,this.imag-right.imag);
    }
/*
    multiply(MyComplex right): Nhân số phức right với số phức hiện tại.
    a+bi)∗(c+di)=(ac−bd)+(ad+bc)i
 */
    public MyComplex multiply(MyComplex right){
        this.real=(this.real*right.real - this.imag*right.imag);
        this.imag=(this.real*right.imag + this.imag*right.real);
        return this;
    }
/*
    divide(MyComplex right): Chia số phức hiện tại cho số phức right
    (a+bi)/(c+di) = ((ac+bd)/(c^2 + a^2) + ((bc−ad)/(c^2 + a^2))*i)
 */
    public MyComplex divide(MyComplex right){
        this.real=(double)((this.real*right.real + this.imag*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        this.imag-=(double)((this.imag*right.real - this.real*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        return this;
    }
/*
    conjugate(): Lấy liên hợp của số phức, tức là thay đổi dấu của phần ảo (phần imag)
 */
    public MyComplex conjugate(){
        this.imag *= -1;
        return this;
    }
}
