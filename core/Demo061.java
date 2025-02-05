public class Demo061 {
    public static void main(String[] args) {
        System.out.print("Prime numbers from 1 to 10: ");
        
        for (int num = 1; num <= 10; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
