import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int a = 2; // 초기 점 2개 (한 면 *

		for (int i = 0; i < n; i++)
			a += a - 1;
		sb.append(a * a);
		System.out.println(sb);
	}
}