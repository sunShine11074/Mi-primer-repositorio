
package quadraticformulaa;
import java.util.Scanner;
public class QuadraticFormulaa {

    public static void main(String[] args) {
        // Inputs and requests
        Scanner scanner = new Scanner(System.in);
        double root1 = 0, root2 = 0, discriminant = 0;
        System.out.println("This programs seeks to get the roots of a second degree polynomium.");
        System.out.println("It employs the quadratic formula to give the roots of the parabola.");
        System.out.println("You have to remember that the quadratic formula asks for the 3 coefficients of the general equation:\n ax2 + bx + c");
        System.out.println("\nSo here we go. Input \"a\" below");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Now, input \"b\" below");
        double b = Double.valueOf(scanner.nextLine());
        System.out.println("Lastly, input \"c\"");
        double c = Double.valueOf(scanner.nextLine());
        // Discriminant e
        discriminant = b*b - 4*a*c;
        // Check complex roots
        if (discriminant >= 0 && a != 0) {
            // Final results
            root1 = ((-b + Math.sqrt(discriminant)) / 2*a );    // No sabía de Math.sqrt
            root2 = ((-b - Math.sqrt(discriminant)) / 2*a );
            // Final results
            System.out.println("\nRoot 1 is: "+ root1);
            System.out.println("Root 2 is: "+ root2);
            // Expression
            System.out.println("You could write it as:\n"+ "f(x) = (x +(" +(-root1)+ "))(x +(" +(-root2)+ "))");
        } else if (a == 0){
            // Final results
            System.out.println("Undefined. We can't divide by zero.");
        } else {
            // Final results
            System.out.println("It has two complex roots !!!");
        };
        
    }
    
}
