import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> message = new ArrayList<>();

        while(true) {
            String line = sc.nextLine();
            if (line.equals("#")) {
                break;
            }
            message.add(line);
        }



        for (String s : message) {
            String[] words = s.split("\\s+");
            int count = 0;

            for (String word : words) {
                word = word.toLowerCase();
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }
}