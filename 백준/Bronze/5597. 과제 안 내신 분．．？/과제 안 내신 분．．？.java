import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[30];

		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n - 1] = 1;
		}
		for (int k = 0; k < arr.length; k++)
			if (arr[k] != 1)
				sb.append(k + 1 + "\n");
		System.out.println(sb);
	}
}