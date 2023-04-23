import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] num = new int[N];
		int M = scan.nextInt();
		
		for(int i = 0; i < M; i++) {
            int I = scan.nextInt();
            int J = scan.nextInt();
            int K = scan.nextInt();

            for(int j = I - 1; j < J; j++) {
                num [j] = K;
            }
        }
        for(int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");
        }
		
	
	}
}