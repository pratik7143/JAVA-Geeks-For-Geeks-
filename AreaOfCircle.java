package Basics;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = obj.nextDouble();
        double area = 3.14 * (r * r);
        System.out.println("The area of the circle is " + area);
    }
}
