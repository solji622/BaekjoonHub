import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        int weight = 0;

        while (true) {
            name = sc.next();
            age = sc.nextInt();
            weight = sc.nextInt();

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }

        }
    }
}