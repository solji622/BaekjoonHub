import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sBurger = sc.nextInt();
        int mBurger = sc.nextInt();
        int lBurger = sc.nextInt();
        int[] burgers = {sBurger, mBurger, lBurger};

        int cola = sc.nextInt();
        int cider = sc.nextInt();

        int minBurger = burgers[0];
        for (int i = 1; i < burgers.length; i++) {
            if (burgers[i] < minBurger) {
                minBurger = burgers[i];
            }
        }

        int minDrink = 0;
        if (cola <= cider) {
            minDrink = cola;
        } else if (cola >= cider) {
            minDrink = cider;
        }

        System.out.println((minBurger + minDrink) - 50);
    }

}