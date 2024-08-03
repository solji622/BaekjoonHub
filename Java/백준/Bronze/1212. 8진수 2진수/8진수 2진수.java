import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String num = sc.readLine();
        char[] nums = num.toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i] - '0';
            // 0의 값인 48을 nums[i]에서 뺌 -> char타입 숫자를 정수형으로
            String trans = Integer.toBinaryString(a);
            // toBinaryString() 어떠한 숫자를 2진수 문자열로 바꿔주는 함수

            while(trans.length() < 3) {
                trans = "0" + trans;
            }

            result.append(trans);


        }

        int idx = 0;
        while (idx < result.length() - 1 && result.charAt(idx) == '0') {
            idx++;
        }

        System.out.println(result.substring(idx));


    }
}
