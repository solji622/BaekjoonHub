import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();

        int[] party = new int[5];

        for (int i = 0; i < party.length; i++) {
            party[i] = sc.nextInt();
        }

        for (int i : party) {
            System.out.print(i - (l * p) + " ");
        }

    }
}
