import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        
        HashSet<String> str = new HashSet<>();
        for (int i = 0; i < n; i++) {
            str.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            if (str.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
