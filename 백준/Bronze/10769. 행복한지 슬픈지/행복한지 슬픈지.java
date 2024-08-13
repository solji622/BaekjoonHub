import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int happy = 0;
        int sad = 0;
        for (int i = 0; i < s.length()-3; i++) {
            if(s.charAt(i) == ':') {
                if(s.charAt(i+1) == '-') {
                    if (s.charAt(i+2) == ')') {
                        happy++;
                    } else if (s.charAt(i+2) == '(') {
                        sad++;
                    }
                }
            }
        }

        if (happy > sad) {
            System.out.println("happy");
        } else if (happy < sad) {
            System.out.println("sad");
        } else if (happy == 0 && sad == 0) {
            System.out.println("none");
        } else {
            System.out.println("unsure");
        }
    }
}
