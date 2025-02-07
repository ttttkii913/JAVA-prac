import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> str = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                str.add(name);
            } else {
                str.remove(name);
            }
        }

        // 역순 정렬 
        List<String> res = new ArrayList<>(str);
        res.sort(Collections.reverseOrder());

        for (String name : res) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
