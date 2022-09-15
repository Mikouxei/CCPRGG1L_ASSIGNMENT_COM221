import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        //New Scanner
        order();

        // Close scanner
        scan.close();

    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply.");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide.");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }

    static String revealMyCrushes() {
        System.out.println("This will reveal the name of your crushes.");
        System.out.print("Enter the your name: ");
        String myName = scan.nextLine();

        System.out.print("Enter the name of your first crush: ");
        String crush1 = scan.nextLine();

        System.out.print("Enter the name of your second crush: ");
        String crush2 = scan.nextLine();
        return myName + " loves " + crush1 + " and " + crush2 + " <3.";
    }

    static void order () {
        System.out.println("Hello, Welcome to KFC!");
        System.out.println("What would you like to order?");
        System.out.print("First Order: ");
        String firstOrder = scan.nextLine();
        System.out.print("Price (PHP): ");
        Double firstPrice = scan.nextDouble();
        scan.nextLine();
    
        System.out.print("Second Order: ");
        String secondOrder = scan.nextLine();
        System.out.print("Price (PHP): ");
        Double secondPrice = scan.nextDouble();
        scan.nextLine();
    
        System.out.print("Third Order: ");
        String thirdOrder = scan.nextLine();
        System.out.print("Price (PHP): ");
        Double thirdPrice = scan.nextDouble();
    
        Double total = firstPrice + secondPrice + thirdPrice;

        System.out.println("These are your orders ma'am/sir: " + firstOrder + ", " + secondOrder + " and " + thirdOrder + ".");
        System.out.println("That will be PHP " + total + " please.");
    
    }
}
