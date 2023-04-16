import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<i+1; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if (A == 0 && B == 0) break; // 0, 0이 나오면 종료
			System.out.println(A+B);
		}
	}
}