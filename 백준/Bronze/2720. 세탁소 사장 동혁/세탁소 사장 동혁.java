import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());
		int Quater = 25;
		int Dime = 10;
		int Nickel = 5;
		int Penny = 1;

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(n / Quater + " ");
			n %= Quater;
			sb.append(n / Dime + " ");
			n %= Dime;
			sb.append(n / Nickel + " ");
			n %= Nickel;
			sb.append(n / Penny + " " + "\n");
		}
		System.out.println(sb);
	}
}