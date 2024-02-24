import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lastResult = 0;
        ArrayList<Double> results = new ArrayList<>();
        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Find Minimum");
            System.out.println("7. Find Maximum");
            System.out.println("8. Find Average");
            System.out.println("9. Print Last Result");
            System.out.println("10. Print All Results");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            if (choice == 11) {
                System.out.println("Exiting");
                break;
            }else if(choice == 9){
                System.out.println("Last result: " + lastResult);
                continue;
            }else if(choice == 10){
                System.out.println("All results:");
                for (int i = 0; i < results.size(); i++) {
                    System.out.println("Result " + (i + 1) + ": " + results.get(i));
                }
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();

            switch (choice) {
                case 1:
                    lastResult = num1 + num2;
                    break;
                case 2:
                    lastResult = num1 - num2;
                    break;
                case 3:
                    lastResult = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    lastResult = num1 / num2;
                    break;
                case 5:
                    lastResult = num1 % num2;
                    break;
                case 6:
                    lastResult = Math.min(num1, num2);
                    break;
                case 7:
                    lastResult = Math.max(num1, num2);
                    break;
                case 8:
                    lastResult = (num1 + num2) / 2;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (choice >= 1 && choice <= 8) {
                results.add(lastResult);
            }
        }


    }
}
