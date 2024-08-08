
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);

            if (arr[word - 'a'] == -1) {
                arr[word - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
