import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = N;

        for (int i = M; i <= N; i++) {
            if(check(i)) {
                sum += i;
                if (i < min)
                    min = i;
            }
        }

        if( sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }

    static boolean check(int num) {
        if(num < 2)
            return false;

        if(num == 2 || num == 3)
            return true;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}