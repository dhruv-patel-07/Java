// Complex.java
class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Constructor with parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Add two complex numbers
    public Complex add(Complex otherNumber) {
        double newRealPart = this.realPart + otherNumber.realPart;
        double newImaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Subtract two complex numbers
    public Complex subtract(Complex otherNumber) {
        double newRealPart = this.realPart - otherNumber.realPart;
        double newImaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Multiply two complex numbers
    public Complex multiply(Complex otherNumber) {
        double newRealPart = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double newImaginaryPart = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Divide two complex numbers
    public Complex divide(Complex otherNumber) {
        double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        double newRealPart = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
        double newImaginaryPart = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Set the real part
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    // Set the imaginary part
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Get the real part
    public double getRealPart() {
        return this.realPart;
    }

    // Get the imaginary part
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    // Convert to string
    public String toString() {
        return this.realPart + " + " + this.imaginaryPart + "i";
    }
}

// ComplexDemo.java
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);

        System.out.println("Complex number 1: " + c1.toString());
        System.out.println("Complex number 2: " + c2.toString());

        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.toString());

        Complex difference = c1.subtract(c2);
        System.out.println("Difference: " + difference.toString());

        Complex product = c1.multiply(c2);
        System.out.println("Product: " + product.toString());

        Complex quotient = c1.divide(c2);
        System.out.println("Quotient: " + quotient.toString());
    }
}