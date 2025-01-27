import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if (m + c > 59) {
            h += (m + c) / 60;
            m = (m + c) % 60;
            if (h > 23) {
                h %= 24;
            }
        } else {
            m += c;
        }

        System.out.println(h + " " + m);

    }
}
