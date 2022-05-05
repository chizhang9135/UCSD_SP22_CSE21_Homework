import java.util.Scanner;

public class Q3a {
    public static void main(String[] args) {
        int counter = 0;
        System.out.print("What is the n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n-i; j++) {
                counter++;
            }
        }
        System.out.println("Print times: " + counter);
    }
}
