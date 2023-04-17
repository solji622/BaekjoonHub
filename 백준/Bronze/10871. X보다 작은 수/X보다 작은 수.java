import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int [] num = new int[N];
		for (int i = 0; i < num.length; i++) {
			num [i] = sc.nextInt();
		}
		for (int i : num) {
			if (X > i) {
				System.out.println(i);
			}
		}
	}
}