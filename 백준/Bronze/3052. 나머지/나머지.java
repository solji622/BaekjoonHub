import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean [] num = new boolean [42]; // t/f 구분위해 bool로 배열 선언
		for(int i = 0; i < 10; i++) {
			num [scan.nextInt() % 42] = true; // 배열에서 입력받은 값을 42로 나눈 나머지 값을 true로 변환
		}
		int cnt = 0;
		for(boolean value : num) { // 배열에 나머지 값 있음
			if(value) { // value (= 나머지 값) 이 true 라면(나머지 값이 다르면)
				cnt++; // 카운트
			}
		}
		System.out.println(cnt);
	}
}