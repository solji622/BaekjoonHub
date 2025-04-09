import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        float resultA = (float) A / C;
        float resultB = (float) B / D;

        if(resultA >= resultB) {
            System.out.println((int) Math.floor(L-resultA));
        } else {
            System.out.println((int) Math.floor(L-resultB));
        }
    }

}