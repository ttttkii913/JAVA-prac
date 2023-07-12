import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());

		if (B + C > 59) {
			A += (B + C) / 60;
			B = (B + C) % 60;
			if (A > 23)
				A %= 24;
		} else
			B += C;
		System.out.println(A + " " + B);
	}
}