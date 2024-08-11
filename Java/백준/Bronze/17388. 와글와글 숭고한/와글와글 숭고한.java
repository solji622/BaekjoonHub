import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        int sum = s + k + h;
        int min = s;
        String result = "Soongsil";

        for (int i = 0; i < 3; i++) {
            if (min > k) {
                min = k;
                result = "Korea";
            } else if (min > h) {
                min = h;
                result = "Hanyang";
            }
        }

        if (sum >= 100) {
            System.out.println("OK");
        } else {
            System.out.println(result);
        }
    }

}
