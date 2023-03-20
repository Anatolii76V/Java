public interface MathArithmeticsReal {

    default double sumReal(double a, double b) {

        return a + b;
    }

    default double subReal(double a, double b) {
        return a - b;

    }

    double divReal();

    double mulReal();
}