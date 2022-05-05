import java.util.Scanner;

public class Q3b {
    public static void main(String[] args) {
        int counter = 0;
        System.out.print("What is the n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n-1; i++) {
            for (int j = i+1; j <= n; j++) {
                for (int k=1; k <= n; k++) {
                    counter++;
                }
            }
        }
        System.out.println("Print times: " + counter);
    }
}
