import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> people1 = new HashSet<>();
        List<String> people2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people1.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (people1.contains(name)) {
                people2.add(name);
            }
        }

        Collections.sort(people2);

        sb.append(people2.size()).append("\n");
        for (String name : people2) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
