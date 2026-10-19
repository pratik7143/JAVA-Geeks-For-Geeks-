package Loops;

import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int term = a;
        System.out.println("GP Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term * r;
        }
        sc.close();
    }
}