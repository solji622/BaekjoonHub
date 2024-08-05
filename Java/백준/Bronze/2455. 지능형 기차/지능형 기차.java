import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] out = new int[4];
        int[] in = new int[4];

        for (int i = 0; i < 4; i++) {
            out[i] = sc.nextInt();
            in[i] = sc.nextInt();
        }

        int[] result = new int [4];

        int sum = out[0] + in[0];
        result[0] = sum;
        for (int i = 1; i < 4; i++) {
            sum = (sum - out[i]) + in[i];
            result[i] = sum;
        }

        int max = result[0];

        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }

        System.out.println(max);

    }
}
