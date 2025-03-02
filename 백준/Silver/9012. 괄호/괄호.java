import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean isVPS = true;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isVPS && stack.isEmpty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
            stack.clear();
        }

        System.out.print(sb);
    }
}
