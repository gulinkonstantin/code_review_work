public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double dif(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double times(double a, double b) {
        return a * b;
    }

    public double[] solver(double a, double b) {
        double x = div(dif(0, b), a);
        return new double[]{x};
    }
}