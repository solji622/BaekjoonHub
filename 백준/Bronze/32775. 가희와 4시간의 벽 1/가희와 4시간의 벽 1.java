import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //high speed rail
        int m = sc.nextInt(); //flight

        if (n > m) {
            System.out.println("flight");
        } else {
            System.out.println("high speed rail");
        }


    }
}