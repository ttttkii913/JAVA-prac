import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];

		double avg = 0;
		double sum = 0;
		double max = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			avg = (arr[i] / max) * 100;
			arr[i] = (avg);
			sum += (arr[i] / n);
		}
		sb.append(sum);
		System.out.println(sb);
	}
}