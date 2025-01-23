import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (3 * i + 5 * j == n) {
                    min = Math.min(min, i + j);
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);

    }
}
