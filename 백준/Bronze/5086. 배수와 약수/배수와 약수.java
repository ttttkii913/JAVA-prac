import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 & B == 0)
                break;
            
            if (B % A == 0)
                sb.append(f);
            else if (A % B == 0)
                sb.append(m);
            else
                sb.append(n);

        }
        System.out.println(sb);
    }
}