import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = n;
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt);
            cnt--;
        }
    }
}
