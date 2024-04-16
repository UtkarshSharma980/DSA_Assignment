import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int c = 6 * a + b;
        System.out.println(c);
        scanner.close();
    }
}
