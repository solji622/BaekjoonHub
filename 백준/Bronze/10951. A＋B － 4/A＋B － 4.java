import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
		}
	}
}
// hasNext = EOF(end of file) 더 이상 읽을 수 있는 데이터가 없음!
// ctrl + Z -> 프로그램 종료