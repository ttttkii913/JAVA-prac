import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " "); // 두 줄 입력받기에 한 번 더 써줘야됨

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num < x)
				sb.append(num).append(" ");
		}
		System.out.print(sb);
	}
}