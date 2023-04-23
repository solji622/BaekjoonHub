import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] student = new int[31]; // 배열에 30명(n+1) 있음
		
		for(int i = 1; i<29; i++) { // a 입력을 28번함
			int a = scan.nextInt();
			student [a] = 1;
		}
		for(int i = 1; i <student.length; i++) {
			if (student[i] != 1 ) { // i가 1이 아니라면 출력
				System.out.println(i); 
			}
		}
		
	}
}