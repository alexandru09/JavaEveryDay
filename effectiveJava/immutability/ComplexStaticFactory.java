package effectiveJava.immutability;

// Immutable class with static factories instead of constructors
// Effective Java 3rd edition - Joshua Bloch
public class ComplexStaticFactory {
    private final double re;
    private final double im;

    private ComplexStaticFactory(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static ComplexStaticFactory valueOf(double re, double im) {
        return new ComplexStaticFactory(re, im);
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    // Arithmetic operations plus, minus, times and dividedBy return a new instance
    // instead of modifying the current one to ensure immutability
    public ComplexStaticFactory plus(ComplexStaticFactory c) {
        return new ComplexStaticFactory(re + c.re, im - c.im);
    }

    public ComplexStaticFactory minus(ComplexStaticFactory c) {
        return new ComplexStaticFactory(re - c.re, im - c.im);
    }

    public ComplexStaticFactory times(ComplexStaticFactory c) {
        return new ComplexStaticFactory(re * c.re - im * c.im,
                           re * c.im + im * c.re);
    }

    public ComplexStaticFactory dividedBy(ComplexStaticFactory c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new ComplexStaticFactory((re * c.re + im * c.im) / tmp,
                           (im * c.re - re * c.im) / tmp);
    }

    @Override 
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof ComplexStaticFactory)) {
            return false;
        }
        ComplexStaticFactory c = (ComplexStaticFactory) o;
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
