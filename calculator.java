import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String input = s.nextLine();
        
        
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        char operation = parts[1].charAt(0);
        int b = Integer.parseInt(parts[2]);
        double answer=0;;
        if(operation == '+'){
            answer=a+b;
        }else if(operation== '-'){
            answer=a-b;
        }else if(operation== '*'){
            answer=a*b;
        } else if (operation == '/') {
            if (b != 0) {
                answer = (double) a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return; 
            }
        } else {
            System.out.println("Invalid operation");
            s.close();
            return; 
        }
        System.out.println("The solution is "+answer);

    
}
}