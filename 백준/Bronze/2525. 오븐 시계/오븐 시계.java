import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int M = A * 60 + B; // 시와 분을 하나의 분으로 변환
		M = M + C; // 변환한 값에 C를 더함
		
		int H = (M / 60) % 24; // 24시이상일 경우 0부터 시작하게 나머지
		int MM = M % 60; // 60으로 나눈 나머지 값이 분이 됨
		System.out.println(H + " " + MM);
	}
}