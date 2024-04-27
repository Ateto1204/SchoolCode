package ntou.cs.java2024;

// javac -d . Complex.java

import java.security.SecureRandom;

public class Complex {
    private double realPart;
    private double imaginaryPart;
    private SecureRandom secureRandom = new SecureRandom();

    public Complex() {
        this.realPart = secureRandom.nextDouble();
        this.imaginaryPart = secureRandom.nextDouble();
    }

    public Complex(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    public String add(Complex complex) {
        double real = this.realPart + complex.realPart;
        double imaginary = this.imaginaryPart + complex.imaginaryPart;
        Complex result = new Complex(real, imaginary);
        return result.toString();
    }

    public String subtract(Complex complex) {
        double real = this.realPart - complex.realPart;
        double imaginary = this.imaginaryPart - complex.imaginaryPart;
        Complex result = new Complex(real, imaginary);
        return result.toString();
    }

    public String multiply(Complex complex) {
        double real = this.realPart * complex.realPart;
        double imaginary = this.imaginaryPart * complex.imaginaryPart;
        Complex result = new Complex(real, imaginary);
        return result.toString();
    }

    public String divide(Complex complex) {
        double real = this.realPart / complex.realPart;
        double imaginary = this.imaginaryPart / complex.imaginaryPart;
        Complex result = new Complex(real, imaginary);
        return result.toString();
    }

    public String conjugate() {
        if(imaginaryPart < 0.0) {
            return String.format("%.2f + %.2fi", realPart, -imaginaryPart);
        }
        return String.format("%.2f + %.2fi", realPart, imaginaryPart);
    }

    public String absolute() {
        double imaginary = this.imaginaryPart;
        if(imaginary < 0.0) imaginary *= -1;
        imaginary = Math.sqrt(imaginary);
        double real = this.realPart;
        if(real < 0.0) real *= -1;
        return String.format("%.2f", real + imaginary);
    }

    @Override
    public String toString() {
        if(imaginaryPart < 0.0) {
            return String.format("%.2f - %.2fi", realPart, -imaginaryPart);
        }
        return String.format("%.2f + %.2fi", realPart, imaginaryPart);
    }
}
