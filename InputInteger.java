import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your SAPID: ");
        int sapid = obj.nextInt();
        System.out.println("Your SAPID is: " + sapid);
    }
}
