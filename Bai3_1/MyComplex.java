package Bai3_1;

public class MyComplex {
    private double real;
    private double imag;

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

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0 && imag != 0;
    }

    public boolean equals(MyComplex other) {
        return this.real == other.real && this.imag == other.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex other) {
        this.real += other.real;
        this.imag += other.imag;
        return this;
    }

    public MyComplex subtract(MyComplex other) {
        this.real -= other.real;
        this.imag -= other.imag;
        return this;
    }

    public MyComplex multiply(MyComplex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double newReal = (this.real * other.real + this.imag * other.imag) / denominator;
        double newImag = (this.imag * other.real - this.real * other.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    @Override
    public String toString() {
        if (imag >= 0) {
            return "(" + real + " + " + imag + "i)";
        } else {
            return "(" + real + " - " + (-imag) + "i)";
        }
    }
}
