import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		String[] arr = str.split("");

		int n = Integer.parseInt(br.readLine());

		sb.append(arr[n - 1]);
		System.out.println(sb);
	}
}