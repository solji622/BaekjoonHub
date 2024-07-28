import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] socks = new int[5];
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            socks[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if(result.contains(socks[i])) {
                result.remove(socks[i]);
            } else {
                result.add(socks[i]);
            }
        }

        Iterator iter = result.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
