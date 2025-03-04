import java.util.Scanner;
public class Problem_125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println("Converted: "+s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        Problem_125 p1 = new Problem_125();
        boolean result = p1.isPalindrome(s);
        System.out.println("" + result);
    }
}