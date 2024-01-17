import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //initalize scanner
        Scanner scanner = new Scanner(System.in);
    try {
        //output and input
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        //process

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
        } else if (firstNumber < secondNumber) {
            System.out.println("The first number: " + firstNumber + " is less than the second number " + secondNumber);
        } else {
            System.out.println("The second number: " + secondNumber + " is less than the first number " + firstNumber);
        }
    } catch (Exception e) {
        System.out.println("Invalid input, enter a valid number");
    }
    
    }
}
