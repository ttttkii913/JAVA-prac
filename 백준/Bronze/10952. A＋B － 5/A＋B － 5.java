import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int sum = 0;

		while (true) {
			String[] arr = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			sum = a + b;
			if (a == 0 && b == 0)
				break;
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}