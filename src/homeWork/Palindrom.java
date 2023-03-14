package homeWork;

import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrom(int x) {
        int reverse = 0;
        int temp = x;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        return (x == reverse);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scan.nextInt();
        System.out.println(isPalindrom(x));
    }


}
