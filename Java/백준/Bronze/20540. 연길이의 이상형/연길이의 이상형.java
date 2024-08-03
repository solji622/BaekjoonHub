import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = Arrays.toString(sc.next().split(""));
        String[] mbti = {"E", "I", "N", "S", "F", "T", "P", "J"};

        ArrayList<String> result = new ArrayList<>();

        for (String s : mbti) {
            if (!a.contains(s)) {
                result.add(s);
            }
        }


        for (String s : result) {
            System.out.print(s);
        }


    }
}
