import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());

		int ans = 0;
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if ('A' <= c && c <= 'Z')
				ans = ans * b + ((c - 'A') + 10);
			else
				ans = ans * b + (c - '0');
		}
		System.out.println(ans);
	}
}