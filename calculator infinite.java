import java.util.Scanner;
public class Practicing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the calculation or type exit to quit:");
            String input = s.nextLine().replaceAll("\\s", "");  // Corrected the regex to \\s for whitespace
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator, Thank you!");
                break;
            }
            String[] parts = input.split("(?<=[-+*/])|(?=[-+*/])");  // Removed space from regex pattern
            if (parts.length != 3) {
                System.out.println("Sorry, Invalid Input");
                continue;
            }
            try {
                int a = Integer.parseInt(parts[0]);
                char operation = parts[1].charAt(0);
                int b = Integer.parseInt(parts[2]);
                double answer = 0;
                if (operation == '+') {
                    answer = a + b;
                } else if (operation == '-') {
                    answer = a - b;
                } else if (operation == '*') {
                    answer = a * b;
                } else if (operation == '/') {
                    if (b != 0) {
                        answer = (double) a / b;
                    } else {
                        System.out.println("Sorry, cannot divide by zero");
                        continue;
                    }
                } else {
                    System.out.println("Sorry, Invalid operation");
                    continue;
                }
                System.out.println("The solution for your operation is " + answer);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, Invalid number format");
            }
        }
        s.close();
    }
}
