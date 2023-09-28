
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;

public class Formulas {
    
    public void Formulas() { }
    
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double ra = 0, rb = 0; // Variables to make Ordered Pair
        // Calculation Time :D
        ra = (-b + Math.sqrt( Math.pow(b, 2) - (4 * a * c) ) ) / (2 * a);
        rb = (-b - Math.sqrt( Math.pow(b, 2) - (4 * a * c) ) ) / (2 * a);
        
        OrderedPair result = new OrderedPair(ra, rb);
        return result; // Output
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B) {
        return (B.getY() - A.getY()) / (B.getX() - A.getX()); // Simple, one-liner
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double ra = 0, rb = 0; // Calculations
        ra = (A.getX() + B.getX()) / 2;
        rb = (A.getY() + B.getY()) / 2;
        
        OrderedPair result = new OrderedPair(ra, rb);
        return result; // Return result 
    }

    public static double findArithmeticSeriesSum (double a, double d, int k) {
        return (double) k/2 * (2*a + d * (k-1)); // Another one-line func- method.
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        return a * ((1 - Math.pow(r, k))/(1 - r)); // One line again (I'm sensing a pattern)
    }
    
    public static int rollDie (int sides) {
        return (int) Math.floor(Math.random() * sides) + 1; // Insert mildly amusing comment here
    }   
}
