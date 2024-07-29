import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 지하철역까지 소요시간
        int A = sc.nextInt(); // 버스오기까지 소요시간
        int B = sc.nextInt(); // 지하철오기까지 소요시간

        transport(N, A, B);
    }

    public static void transport(int n, int a, int b) {
        if (a == b && n <= b) {
            System.out.println("Anything");
        } else if (a > b && n <= b) {
            System.out.println("Subway");
        } else {
            System.out.println("Bus");
        }
    }
}
