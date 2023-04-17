import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n]; // 배열 선언
		for (int i = 0; i < num.length; i++) { // 배열 속 숫자의 수만큼 반복 
			num[i] = sc.nextInt(); // 배열에 입력
		}
		int v = sc.nextInt();
		int cnt = 0; // 숫자 카운트 변수
		for (int i : num) { // i를 num에서 반복
			if (i==v) cnt++; // i == v면 cnt 변수에 카운트
		}
		System.out.println(cnt);
	}

}
