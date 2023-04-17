import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] num = new int[N];
		for (int i = 0; i < num.length; i++) {
			num [i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for (int i : num) {
			if (i > max) {
				max = i;
			} if (i < min) {
				min = i;
			}
		}
		System.out.print(min);
		System.out.print(" "+max);
	}
}