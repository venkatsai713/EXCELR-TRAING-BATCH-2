import java.util.Scanner;

class bank {
    private String custname;
    private long bankaccno;
    private Double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        custname = sc.next();
        System.out.print("Enter your account number: ");
        bankaccno = sc.nextLong();
        System.out.print("Enter bank balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Hello " + custname + "\nBank account number: " + bankaccno + "\nBalance: " + balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        bank obj = new bank();
        obj.input();
        obj.display();
    }
}