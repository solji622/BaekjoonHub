import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(disc(sc.next()));
        }
    }

    public static String disc(String text) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(') {
                st.push(c);
            } else if (st.empty()) {
                return "NO";
            } else {
                st.pop();
            }
        }

        if (st.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
