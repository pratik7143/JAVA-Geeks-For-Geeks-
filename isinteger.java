package IfElse;
import java.util.Scanner;
public class isinteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = obj.nextDouble();
        int x = (int)a; //typecasting
        if(a-x>0) System.out.println("The number entered is not an Integer");
        else System.out.println("The number entered is an Integer");

    }
}
