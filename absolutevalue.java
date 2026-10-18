package IfElse;
import java.util.Scanner;
public class absolutevalue 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int a;
        a = obj.nextInt();
        if(a>=0){
            System.out.println(a);
        }
        else
        {
            System.out.println(-a);
        }
    }
}
