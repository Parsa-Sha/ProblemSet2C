
/**
 * Write a description of class main here.
 *
 * @author Parsa S.
 * @project Problem Set 2C
 * @date 9/27/2023
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c +" are " + roots);
        
        
        System.out.println("FIND SLOPE: Find the slope between (x1,y1) and (x2,y2): ");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        OrderedPair opa = new OrderedPair(x1, y1);
        OrderedPair opb = new OrderedPair(x2, y2);
        System.out.println("A line between " + opa + " and " + opb + " has a slope of " + Formulas.findSlope(opa, opb) + ".");
        
        // Midpoint formula go brrr
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2): ");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        
        opa = new OrderedPair(x1, y1);
        opb = new OrderedPair(x2, y2);
        System.out.println("The midpoint between " + opa + " and " + opb + " has a slope of " + Formulas.findMidpoint(opa, opb) + ".");
        
        // Arithmetic series
        System.out.println("ARITHMETIC SERIES: Find the sum of an arithmetic series using the number of terms, the first number, and the common difference: ");
        System.out.print("Number of terms: ");
        int d = input.nextInt();
        System.out.print("The first number: ");
        b = input.nextDouble();
        System.out.print("Increases by: ");
        a = input.nextDouble();
        System.out.println("The sum of the first " + d + " terms of an arithmetic series that starts with " + b + " and increases by "+ a + " is " + Formulas.findArithmeticSeriesSum(b, a, d) +".");
        
        System.out.println("GEOMETRIC SERIES: Find the sum of a geometric series using the number of terms, the first number, and the rate of change: ");
        System.out.print("Number of terms: ");
        d = input.nextInt();
        System.out.print("The first number: ");
        b = input.nextDouble();
        System.out.print("Rate of growth: ");
        a = input.nextDouble();
        System.out.println("The sum of the first " + d + " terms of a geometric series that starts with " + b + " and increases by a rate of "+ a + " is " + Formulas.findGeometricSeriesSum(b, a, d) +".");
        
        System.out.println("DIE ROLLER: Roll a die using how many sides it has");
        System.out.print("Number of die sides: ");
        d = input.nextInt();
        System.out.print("Rolling a " + d + "-sided die... you got a " + Formulas.rollDie(d) + "!");
    }
}
