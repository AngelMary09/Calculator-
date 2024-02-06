
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner cal = new Scanner(System.in);

            System.out.println("Simple Calculator");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Division");

            System.out.print("Select from 1 to 4 : ");
            int selectCalNum = cal.nextInt();

            System.out.print("Enter the first number: ");
            double num1 = cal.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = cal.nextDouble();

            double result;

            switch (selectCalNum) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid selection . Please enter a number between 1 and 4.");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
