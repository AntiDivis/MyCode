import java.util.Scanner;

public class Calculatortwo {
    public static void main(String[] args) {

    //Scanner Object
        Scanner scan = new Scanner(System.in);

    //The Inputs
        System.out.println("Input 1st No.");
        double X = scan.nextDouble();
        System.out.println("Input 2nd No.");
        double Y = scan.nextDouble();

    //The Outputs
        double result;

        result = X + Y;
        System.out.println("Addition: " + result);

        result = X - Y;
        System.out.println("Subtraction: " + result);

        result = X * Y;
        System.out.println("Multiplication: " + result);

        result = X / Y;
        System.out.println("Division: " + result);
    }
}

