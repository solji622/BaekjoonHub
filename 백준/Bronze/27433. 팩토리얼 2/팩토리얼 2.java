import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Integer.parseInt(sc.nextLine());

        long sum = factorial(N);

        System.out.println(sum);
    }

    public static long factorial (long N) {
        if (N <= 1) {
            return 1;
        }

        return N * factorial(N-1);
    }
}
