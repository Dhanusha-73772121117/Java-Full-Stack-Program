import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int result = 0;
        int digit;
        int n = 0;
        while (num != 0) {
            num /= 10;
            n++;
        }
        num = originalNum;
        while (num != 0) {
            digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
