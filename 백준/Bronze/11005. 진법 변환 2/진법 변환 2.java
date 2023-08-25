import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		while (a != 0) {
			if (a % b >= 10)
				sb.append((char) ((a % b) + 55));
			else
				sb.append(a % b);
			a /= b;
		}
		System.out.println(sb.reverse().toString());
	}
}