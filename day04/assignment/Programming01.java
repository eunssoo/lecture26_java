package assignment;

public class Programming01 {

    static class Triangle {

        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double findArea() {
            return base * height / 2;
        }

        public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {

        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());
    }
}