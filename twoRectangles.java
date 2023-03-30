// Checks if rectangles overlap, coincide, or contain one another

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter abscissa, ordinate, width, and height of first rectangle: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double w1 = input.nextDouble();
    double h1 = input.nextDouble();
    System.out.println("Enter abscissa, ordinate, width, and height of second rectangle: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double w2 = input.nextDouble();
    double h2 = input.nextDouble();
    
    double horiD = Math.abs(x2-x1);
    double vertD = Math.abs(y2-y1);
    
    if ((w1>0 && h1>0) && (w2>0 && h2>0)) {
        if ((horiD >= (w1/2 + w2/2)) || (vertD >= (h1/2 + h2/2)))
            System.out.println("rectangles do not overlap");
        else if ((horiD < (w1/2 + w2/2) && horiD > Math.abs(w1/2 - w2/2)) && (vertD < (h1/2 + h2/2)))
            System.out.println("rectangles overlap");
        else if ((vertD < (h1/2 + h2/2) && vertD > Math.abs(h1/2 - h2/2)) && (horiD < (w1/2 + w2/2)))
            System.out.println("rectangles overlap");
        else if (w1*h1 > w2*h2)
            System.out.println("r2 is inside r1");
        else if (w1*h1 < w2*h2)
            System.out.println("r1 is inside r2");
        else
            System.out.println("rectangles coincide");
    }
    else
        System.out.println("width and height can't be negative");
    }
}
