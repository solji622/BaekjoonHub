import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int coin = 100 * n;

        if (coin >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
