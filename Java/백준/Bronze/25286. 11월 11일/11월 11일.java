import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int y = 0;
        int m = 0;
        int d = 0;

        for (int i = 0; i < T; i++) {
            y = sc.nextInt();
            m = sc.nextInt();
            d = m;

            int newYear = y;
            int newMonth = m - 1;
            int newDay = d - m;

            if (newMonth == 0) {
                newMonth = 12;
                newYear--;
            }

            if (newYear % 4 == 0 && (newYear % 100 != 0 || newYear % 400 == 0)) {
                months[2] = 29;
            } else {
                months[2] = 28;
            }

            newDay += months[newMonth];

            System.out.println(newYear + " " + newMonth + " " + newDay);
        }

    }
}
