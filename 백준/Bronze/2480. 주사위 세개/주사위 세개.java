import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
        
        if (A != B && B != C && A != C) { // 모두 다를 때
			int max; // 최댓값
			if (A > B) { // A > B일 경우
				if (C > A) { // C > A > B일 경우
					max = C; // 최댓값 C
				} else {
					max = A; // A > C > B면 최댓값 A 
				}
			}
            else {
				if (C > B) { // C > B 일 경우
					max = C; // 최댓값 C
				} else { // B > C > A 일 경우
					max = B; // 최댓값 B
				}
			}
            System.out.println(max * 100);
		} else {
		    if (A == B && A == C) { // 모두 같을 때
			System.out.println(10000 + A * 1000);
		    } else {
                if (A == B || A == C) { // 두개만 같을 때
			    System.out.println(1000 + A * 100); // A == B || C
		        } else {
			        System.out.println(1000 + B * 100); // B==C
		        }
            }
        }
	}
}