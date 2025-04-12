import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 원섭
        int b = sc.nextInt(); // 세희
        int c = sc.nextInt(); // 상근
        int d = sc.nextInt(); // 숭
        int f = sc.nextInt(); // 강수

        int[] people =  {a, b, c, d, f};

        int sum = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] < 40) {
                people[i] = 40;
            }
        }

        for(int i : people) {
            sum += i;
        }

        System.out.println(sum / 5);

    }
}