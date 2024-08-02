import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doctor = sc.nextLine();
        String people = sc.nextLine();

        char[] docA = doctor.toCharArray();
        char[] peoA = people.toCharArray();

        int docC = 0;
        int peoC = 0;

        for (char c : docA) {
            if (c == 'a') {
                docC++;
            }
        }

        for (char c : peoA) {
            if (c == 'a') {
                peoC++;
            }
        }

        if (docC >= peoC) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }


    }
}
