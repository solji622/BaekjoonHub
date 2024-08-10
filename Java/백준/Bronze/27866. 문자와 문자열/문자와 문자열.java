import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String[] s = text.split("");
        int n = sc.nextInt();

        System.out.println(s[n-1]);
    }
}
