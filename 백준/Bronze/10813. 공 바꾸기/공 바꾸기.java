import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 갖고있는 바구니 개수
		int M = scan.nextInt(); // 공을 바꿀 횟수
		int [] arr = new int[N+1]; // 배열 선언
		for (int i = 1; i <= N; i++) {
			arr [i] = i; // 바구니 개수만큼 공을 한개씩 배열에 넣기
		}
		for (int i = 0; i < M; i++) {
			int A = scan.nextInt(); 
			int B = scan.nextInt(); // a,b는 공의 번호
			int temp = arr[A]; // 임의의 변수에 배열 A값 넣기
			arr[A] = arr[B]; 
			arr[B] = temp; // 공 교환
		}
		for(int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " "); // 각 바구니에 들어있는 공의 번호 출력
		}
		
	}
}