import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		for (int j = 0; j < m; j++) { // i번부터 j번 바구니
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken()); // 1 2 3 처럼 ijk 입력받음
			int J = Integer.parseInt(st.nextToken());

			for (int z = I; z <= J; z++, J--) {
				int temp = arr[z - 1];
				arr[z - 1] = arr[J - 1];
				arr[J - 1] = temp;
			}
		}
		for (int k = 0; k < arr.length; k++)
			sb.append(arr[k] + " ");
		System.out.println(sb);
	}
}