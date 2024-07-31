import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fight = {"HIGHSCHOOL", "MASTER", "0611", "CONTEST"};


        String a = sc.nextLine();
            switch (a) {
                case "SONGDO" :
                    System.out.println(fight[0]);
                    break;
                case "CODE" :
                    System.out.println(fight[1]);
                    break;
                case "2023" :
                    System.out.println(fight[2]);
                    break;
                case "ALGORITHM" :
                    System.out.println(fight[3]);
                    break;
                default:
                    break;
            }
    }
}
