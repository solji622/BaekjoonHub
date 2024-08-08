import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, sum = 0;
        while (true) {
            a = sc.nextInt();
            if (a == -1) {
                System.out.println(sum);
                break;
            }
            sum += a;
        }
    }
}
