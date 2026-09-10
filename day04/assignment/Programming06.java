package assignment;

public class Programming06 {

    static class Complex {

        private double real;
        private double imaginary;

        public Complex(double real) {
            this.real = real;
            this.imaginary = 0.0;
        }

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public void print() {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(2.0);
        c1.print();

        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}