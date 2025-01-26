package PS002;
import java.util.Scanner;

public class Ps002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int nearestMultiple = ((number + 50) / 100) * 100;
        
        System.out.println("The nearest multiple of 100 is: " + nearestMultiple);
        
        scanner.close();
    }
}
