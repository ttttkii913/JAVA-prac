import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i <= sqrt(N); i++) {
            while(N % i == 0) {
                N /= i;
                sb.append(i + "\n");
            }
        }
        if(N != 1)
            sb.append(N);

        System.out.println(sb);
        br.close();

    }
}