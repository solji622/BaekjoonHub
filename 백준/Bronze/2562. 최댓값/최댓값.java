import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[9];
		for (int i = 0; i < num.length; i++) {
			num [i] = sc.nextInt();
		}
		int max = num[0];
		for (int i : num) {
			if (i > max) {
				max = i;
			}
		}
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]==max) {
				temp = i;
				temp = temp+1;
				break;
			}
		}
		System.out.println(max);
		System.out.println(temp);
	}
}