import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meme = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        int N = sc.nextInt();
                sc.nextLine();
        String result = "No";

        for (int i = 0; i < N; i++) {
            String trans = sc.nextLine();
            boolean found = false;
            for (int j = 0; j < meme.length; j++) {
                if (trans.equals(meme[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result = "Yes";
                break;
            }
        }


        System.out.println(result);
    }
}
