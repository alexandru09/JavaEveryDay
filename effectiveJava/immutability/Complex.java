package effectiveJava.immutability;

// Immutable class - Effective Java 3rd edition - Joshua Bloch
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    // Arithmetic operations plus, minus, times and dividedBy return a new instance
    // instead of modifying the current one to ensure immutability
    public Complex plus(Complex c) {
        return new Complex(re + c.re, im - c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                           re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                           (im * c.re - re * c.im) / tmp);
    }

    @Override 
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) o;
        // use Double.compare because of Double.NaN and -0.0
        return Double.compare(c.re, re) == 0
            && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}