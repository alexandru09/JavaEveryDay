package effectiveJava.itemEleven;

// import java.util.Objects;

/*
 * Always override hashCode() if you override equals()
 * Check Object.class for the exact contract hashCode() must adhere to
 */
public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if ( o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix
            && pn.areaCode == areaCode;
    }

    /*
     * The worst implementation of hasCode() that is legal - NEVER USE!
     * Legal because equal objects will have same hashCode.
     * Horrible because every object will have same hashCode.
     */
    // @Override
    // public int hashCode() {
    //     return 42;
    // }

    /*
     * One line hascode method with mediocre performance
     * Works well, the downside is performance
     * Uses array creation because it takes variable nr. of params
     * Also uses autoboxing for primitive types, another performance issue
     */
    // @Override
    // public int hashCode() {
    //     return Objects.hash(lineNum, prefix, areaCode);
    // }


    /*
     * Good hashCode implementation
     * Uses all significant fields - all fields used in equals() method
     * 31 because it is odd prime
     * 31 because multiplication by 31 can be replaced with a shift and 
     * substraction, which optimizes performances a little bit
     * 31 * i = (i << 5) -i
     */
    // @Override
    // public int hashCode() {
    //     int result = Short.hashCode(areaCode);
    //     result = 31 * result + Short.hashCode(prefix);
    //     result = 31 * result + Short.hashCode(lineNum);
    //     return result;
    // }

    /*
     * Good implementation with lazily initialized cached hash code
     * Use this if the cost of creating the hashCode is high
     * Lazily - it only computes the hashCode when it's first required
     * DON'T exclude significant fields from hashCode to improve performance!
     */
    private int hashCode; // initialized to 0

    @Override
    public int hashCode() {
        int result = hashCode;
            if (result == 0) {
                result = Short.hashCode(areaCode);
                result = 31 * result + Short.hashCode(prefix);
                result = 31 * result + Short.hashCode(lineNum);
            }
            return result;
        }
}
    