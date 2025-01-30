import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; 
            sum += digit * digit; 
            num /= 10; 
        }

        System.out.println("Sum of squares of digits: " + sum);
        sc.close(); 
    }
}
