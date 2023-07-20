import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] arr = new boolean[42];

		for (int i = 0; i < 10; i++)
			arr[Integer.parseInt(br.readLine()) % 42] = true;

		int count = 0;
		for (boolean value : arr) {
			if (value) // value가 true라면 (arr이 42로 나누어떨어진다면 true
				count++;
		}
		sb.append(count);
		System.out.println(sb);
	}
}