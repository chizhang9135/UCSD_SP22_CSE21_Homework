import java.util.Scanner;

public class Q3b {
    public static void main(String[] args) {
        int counter = 0;
        System.out.print("What is the n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            for (int j = i-1; j <= n; j++) {
                counter++;
            }
        }
        System.out.println("Print times: " + counter);
    }
}
