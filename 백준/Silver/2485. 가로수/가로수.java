import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(br.readLine());

        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        int[] gaps = new int[n - 1];
        for (int i = 0; i< n - 1; i++) {
            gaps[i] = tree[i + 1] - tree[i];
        }

        int gcd = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcd = gcd(gcd, gaps[i]);
        }

        int res = 0;
        for (int gap : gaps) {
            res += (gap / gcd) - 1;
        }

        System.out.println(res);

    }

    // 유클리드 호제법
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
