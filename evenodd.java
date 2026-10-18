package IfElse;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        a = obj.nextInt();
        if(a%2==0){
            System.out.println("The number entered is even");
        }
        else 
        {
            System.out.println("The number entered is odd");
        }
    }
}
