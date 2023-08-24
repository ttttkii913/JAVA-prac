import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int a[][] = new int[n][m];
		int b[][] = new int[n][m];

		for (int i = 0; i < n; i++) { // 배열 a 입력받아 2차원 배열 생성
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				a[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) { // 배열 b 입력받아 2차원 배열 생성
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) { // 출력
			for (int j = 0; j < m; j++)
				sb.append(a[i][j] + b[i][j]).append(" "); // 배열 a와 b 더하고 공백 " "append
			sb.append("\n");
		}
		System.out.print(sb);
	}
}