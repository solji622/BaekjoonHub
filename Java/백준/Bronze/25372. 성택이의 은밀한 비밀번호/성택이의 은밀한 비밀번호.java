import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] pw = new String[N];

        for (int i = 0; i < pw.length; i++) {
            pw[i] = sc.next();
        }

        for (int i = 0; i < pw.length; i++) {
            int len = pw[i].length();
            if (len >= 6 && len <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
