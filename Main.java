import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();
        System.out.println("x + y = "+ (x+y));
        System.out.println("x - y = "+ (x-y));
        System.out.println("x * y = "+(x*y));
        System.out.println("x / y = "+(x/y));
        System.out.println("x % y = "+(x%y));


    }
}
