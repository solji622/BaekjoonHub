import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        System.out.println((int) (price / 1.1f)); // 11배니까 1.1 나누기
    }
}
