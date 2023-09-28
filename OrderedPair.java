
/**
 * Write a description of class OrderedPair here.
 *
 * @author Parsa S.
 * @project Problem Set 2B
 * @date 9/21/2023
 */
public class OrderedPair {
    double x, y;
    
    OrderedPair() {
        x = 0.0;
        y = 0.0;
    }
    
    OrderedPair(double ix, double iy) {
        x = ix;
        y = iy;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}
